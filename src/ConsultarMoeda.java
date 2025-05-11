import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoeda {
    public Moedas buscarMoeda(String moedaBase, String moedaTarget){
        URI direcao = URI.create("https://v6.exchangerate-api.com/v6/ed7e0bed47b28727d6a149d3/pair/"+moedaBase+"/"+moedaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direcao)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Não encontrei a moeda:");
        }
    }

}
