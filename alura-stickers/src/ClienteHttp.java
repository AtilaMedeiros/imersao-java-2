import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ClienteHttp {

    public String buscarBodyDaURL(String url) {

        try {
            // Montando em uma intância o endereço do Servidor
            URI endereco = URI.create(url);

            // Montando em uma intância a conexão com Servidor
            HttpClient conClient = HttpClient.newHttpClient();

            // Montando em uma intância o seu pedido
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();

            // Enviando o pedido (HttpRequest) pela conexão (HttpClient) e recebendo a
            // resposta (HttpResponse)
            HttpResponse<String> response = conClient.send(request, BodyHandlers.ofString());

            // Pegando o corpo da resposta em string que pode ser HTML, JSON, XML, etc.
            String body = response.body();

            return body;

        } catch (IOException ex) {
            throw new RuntimeException("Erro ao buscar dados do URL " + url + " usando o método GET"
                    + ": " + ex.getMessage(), ex);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("A thread foi interrompida enquanto buscava dados do URL " + url
                    + " usando o método GET", ex);

        }

    }
}
