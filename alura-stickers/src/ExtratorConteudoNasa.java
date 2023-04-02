import java.util.List;
import java.util.Map;

public class ExtratorConteudoNasa implements ExtratorConteudo {
    public List<Conteudo> extrairConteudos(String html) {

        // Extract only the data that interests me (title, rating, post)
        JsonParser JsonParser = new JsonParser();
        List<Map<String, String>> listaAtributos = JsonParser.parse(html);

        return listaAtributos.stream()
                .map(atributo -> new Conteudo(atributo.get("title"), atributo.get("url")))
                .toList();

    }
}
