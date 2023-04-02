import java.util.List;
import java.util.Map;

public class ExtratorConteudoIMDB implements ExtratorConteudo {

    public List<Conteudo> extrairConteudos(String html) {

        // Extract only the data that interests me (title, rating, post)
        JsonParser JsonParser = new JsonParser();
        List<Map<String, String>> listaAtributos = JsonParser.parse(html);

        return listaAtributos.stream()
                .map(atributo -> new Conteudo(atributo.get("title"),
                        atributo.get("image").replaceAll("(@+)(.*).jpg$",
                                "$1.jpg"),
                        atributo.get("imDbRating")))
                .toList();

        // List<Conteudo> conteudos = new ArrayList<>();

        // // criando a lista de conteudos a partir de listaAtributos
        // for (Map<String, String> atributo : listaAtributos) {

        // String titulo = atributo.get("title");
        // String urlImagem = atributo.get("image")
        // .replaceAll("(@+)(.*).jpg$", "$1.jpg"); // Remove the @2x from the image UR

        // Conteudo conteudo = new Conteudo(titulo, urlImagem);

        // conteudos.add(conteudo);

        // }

        // return conteudos;

    }

}
