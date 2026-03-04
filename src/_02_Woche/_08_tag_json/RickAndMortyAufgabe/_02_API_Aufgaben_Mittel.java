package _02_Woche._08_tag_json.RickAndMortyAufgabe;

import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class _02_API_Aufgaben_Mittel {
    public static void main(String[] args) throws Exception {
        getAllAliveAliens(1);
        countCharactersByStatus();
        getCharactersByOrigin("Earth (C-137)");
    }

    private static void getAllAliveAliens(int page) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        int totalPages;

        do {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://rickandmortyapi.com/api/character/?page=" + page + "&species=Alien&status=Alive"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

            totalPages = result.info.pages;

            for (Character character : result.results) {
                System.out.println(character.name + " | " + character.species + " | " + character.status);
            }

            page++;
        } while (page <= totalPages);
    }

    private static void countCharactersByStatus() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        int alive = 0;
        int dead = 0;
        int unknown = 0;

        int page = 1;
        int totalPages;

        do {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://rickandmortyapi.com/api/character/?page=" + page))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Wenn Seite nicht existiert → abbrechen
            if (response.statusCode() != 200) {
                break;
            }

            CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

            totalPages = result.info.pages;

            for (Character character : result.results) {
                switch (character.status) {
                    case "Alive" -> alive++;
                    case "Dead" -> dead++;
                    default -> unknown++;
                }
            }

            page++;
        } while (page <= totalPages);

        System.out.println("\nStatus-Statistik:");
        System.out.println("Alive: " + alive);
        System.out.println("Dead: " + dead);
        System.out.println("Unknown: " + unknown);
    }


    private static void getCharactersByOrigin(String originName) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        int page = 1;
        int totalPages;

        System.out.println("\nCharaktere von: " + originName);

        do {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://rickandmortyapi.com/api/character/?page=" + page))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Wenn Seite nicht existiert → abbrechen
            if (response.statusCode() != 200) {
                break;
            }

            CharacterResponse result = mapper.readValue(response.body(), CharacterResponse.class);

            totalPages = result.info.pages;

            for (Character character : result.results) {
                if (character.origin.name.equalsIgnoreCase(originName)) {
                    System.out.println(character.name + " | " + character.status + " | " + character.species + " | " + character.origin.name);
                }
            }

            page++;
        } while (page <= totalPages);
    }
}
