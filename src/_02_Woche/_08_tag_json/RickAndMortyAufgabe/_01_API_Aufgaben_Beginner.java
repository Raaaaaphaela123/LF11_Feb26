package _02_Woche._08_tag_json.RickAndMortyAufgabe;

import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class _01_API_Aufgaben_Beginner {
    public static void main(String[] args) throws Exception {
        getCharactersByPage(1);
        getCharacterByID(1);

        getHumansByPage(1);
        getFemalesByPage(1);
    }

    /**
     * LEICHTE AUFGABEN
     **/

    /* Aufgabe 1: Menschliche Charaktere auf einer Seite filtern */
    private static void getHumansByPage(int page) throws URISyntaxException, IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://rickandmortyapi.com/api/character/?page=" + page + "&species=Human"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

        System.out.println("Menschen auf Seite " + page);
        for (Character character : result.results) {
            System.out.println(character.name + " | " + character.status + " | Herkunft: " + character.origin.name);
        }

    }

    /* */
    private static void getFemalesByPage(int page) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://rickandmortyapi.com/api/character/?page=" + page + "&gender=female"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

        System.out.println("\nWeibliche Charaktere auf Seite " + page + ":");
        for (Character character : result.results) {
            System.out.println(character.name + " | " + character.status + " | " + character.origin.name + " | " + character.gender);
        }
    }


    private static void getCharactersByPage(int page) throws Exception {
        // HTTP-Client erstellen
        HttpClient client = HttpClient.newHttpClient();

        // URL -> Charaktere (Seite 1)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://rickandmortyapi.com/api/character/?page=" + page))
                .GET()
                .build();

        // Request ausführen
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        // JSON ausgeben
        System.out.println("RAW JSON:");
        System.out.println(response.body());

        // JSON → Java-Objekte
        ObjectMapper mapper = new ObjectMapper();
        CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

        System.out.println("\nInfo:");
        System.out.println("Treffer: " + result.info.count);
        System.out.println("Seiten: " + result.info.pages);

        System.out.println("\nCharaktere:");
        for (Character character : result.results) {
            System.out.println(character.id + ": " + character.name + " (" + character.status + ")");
        }
    }

    private static void getCharacterByID(int id) throws Exception {
        // HTTP-Client erstellen
        HttpClient client = HttpClient.newHttpClient();

        // URL -> Charaktere (Seite 1)
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://rickandmortyapi.com/api/character/" + id))
                .GET()
                .build();

        // Request ausführen
        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());

        // JSON ausgeben
        System.out.println("RAW JSON:");
        System.out.println(response.body());

        // JSON → Java-Objekte
        ObjectMapper mapper = new ObjectMapper();
        Character character = mapper.readValue(response.body(), Character.class);
        System.out.println("\nCharakter:");
        System.out.println(character.id + ": " + character.name + " (" + character.status + ")");
    }
}
