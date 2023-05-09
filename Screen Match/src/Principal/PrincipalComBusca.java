package Principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.Gson;

import modelos.Titulo;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Por favor, digite o nome de um filme:");
        var busca = leitura.nextLine();

        var endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=3febb1a2";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
         .uri(URI.create(endereco))
         .build();
    HttpResponse<String> response = client
         .send(request, BodyHandlers.ofString());
    var json = response.body();
    System.out.println(json);
    
    Gson gson = new Gson();
    Titulo meuTitulo = gson.fromJson(json, Titulo.class);
    System.out.println(meuTitulo);

    }
}
