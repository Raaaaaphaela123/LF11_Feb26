package _02_Woche._08_tag_json;

import tools.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MeineApp {
    static void main() {
        getCharactersFromPage1();
        getCharacterById(1);
    }

    public static void getCharacterById(int id) {
        HttpClient client = HttpClient.newHttpClient();

        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://rickandmortyapi.com/api/character/" + id))
                    .GET()
                    .build();

            // Request ausführen
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //JSON
            IO.println(response.body());

            ObjectMapper mapper = new ObjectMapper();
            Character character = mapper.readValue(response.body(), Character.class);

            // Ausgabe des Characters
            IO.println(character); // formatiert, weil wir in Character die toString überschrieben haben

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void getCharactersFromPage1() {
        // HTTP-Client erstellen
        HttpClient client = HttpClient.newHttpClient();

        try {
            // Request erstellen für Charaktere Seite 1
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://rickandmortyapi.com/api/character/?page=1"))
                    .GET()
                    .build();

            // Request ausführen
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //JSON ausgeben
            IO.println(response.body());

            // JSON -> Java Objekte mappen
            ObjectMapper mapper = new ObjectMapper();
            CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

            // Ausgabe der gezählten Charakter
            IO.println("Gezählte Charakter gesamt: " + result.info.count);

            // Charaktere ausgeben
            for (Character character : result.results) {
                IO.println("ID: " + character.id + ", Name: " + character.name + ", Status: " + character.status);
            }

        } catch (URISyntaxException e) {
            IO.println("Da ist was schief gegangen");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
