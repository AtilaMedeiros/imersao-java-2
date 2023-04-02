import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {

    public static void main(String[] args) throws Exception {

        API api = API.NASA;
        String url = api.getUrl();
        ExtratorConteudo extrator = api.getExtrator();

        // Recebe o json apos o filtro do buscaBodyDaURL
        String json = new ClienteHttp().buscarBodyDaURL(url);

        // Recebe somente os campos selecionados(titulo, urlImagem e imDbRating) apos o
        // filtro do extrairConteudos
        List<Conteudo> conteudos = extrator.extrairConteudos(json);

        // Cria um objeto com as regras de formatação da imagem
        var geradora = new GeradorDeFigurinhas();

        // If don't exist, create the folder "figurinhas"
        var diretorio = new File("figurinhas/");
        diretorio.mkdir();

        // Itera sobre conteudo para criar as figurinhas
        conteudos.stream().forEach(conteudo -> {
            try {
                /*
                 * A URL é obtida chamando o método "urlImagem()" do objeto "conteudo", que
                 * retorna a URL do arquivo de imagem. Em seguida, o método "openStream()" é
                 * chamado na URL, que retorna um objeto "InputStream" que pode ser usado para
                 * ler os dados do arquivo.
                 */
                InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
                InputStream imagemSobrepor = new FileInputStream(new File("sobrepor/paulo-silveira.png"));

                // Armazenamos o nome do arquivo em uma variável
                String nomeArquivo = "figurinhas/" + conteudo.titulo()
                        + ".png";

                // Com os dados do arquivo de imagem e o nome do arquivo, podemos criar a
                // figurinha
                geradora.cria(inputStream, nomeArquivo, imagemSobrepor);

                // Formatting terminal font
                String fundoMagenta = "\u001B[45m";
                String reset = "\u001B[0m";
                String estrela = "\u2B50";
                String negrito = "\u001B[1m";
                System.out.println(negrito + "Título: " + reset + conteudo.titulo());
                System.out.println("Poster: " + conteudo.urlImagem());

                if (api == API.IMDB_TOP_MOVIES) {
                    double rating = Double.parseDouble(conteudo.imDbRating());
                    System.out.println(fundoMagenta + "Classificação: " + rating + reset);
                    for (int i = 1; i <= rating; i++) {
                        System.out.print(estrela);
                    }
                }
                System.out.println("\n");

                ;

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
// for (Conteudo conteudo : conteudos) {

// InputStream inputStream = new URL(conteudo.urlImagem()).openStream();
// String nomeArquivo = "saida/" + conteudo.titulo() + ".png";

// geradora.cria(inputStream, nomeArquivo);

// System.out.println(conteudo.titulo());
// System.out.println();

// }