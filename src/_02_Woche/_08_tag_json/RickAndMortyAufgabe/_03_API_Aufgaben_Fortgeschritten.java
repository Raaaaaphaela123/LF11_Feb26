package _02_Woche._08_tag_json.RickAndMortyAufgabe;

import tools.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_API_Aufgaben_Fortgeschritten {
    public static void main(String[] args) throws Exception {

        getCharactersByEpisode(4);
        top5Locations();
        interactiveConsole();
    }

    private static void getCharactersByEpisode(int episodeId) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        // Episode abrufen
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://rickandmortyapi.com/api/episode/" + episodeId))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            System.out.println("Episode nicht gefunden!");
            return;
        }

        Episode episode = mapper.readValue(response.body(), Episode.class);

        System.out.println("\nEpisode: " + episode.name + " | " + episode.episode);
        System.out.println("Charaktere in dieser Episode:");

        for (String characterURL : episode.characters) {
            HttpRequest charRequest = HttpRequest.newBuilder()
                    .uri(new URI(characterURL))
                    .GET()
                    .build();

            HttpResponse<String> charResponse = client.send(charRequest, HttpResponse.BodyHandlers.ofString());
            if (charResponse.statusCode() != 200) continue;

            Character character = mapper.readValue(charResponse.body(), Character.class);
            System.out.println(character.name);
        }
    }

    private static void top5Locations() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        int page = 1;

        // Map<Ort, Anzahl Bewohner>
        Map<String, Integer> locationCount = new HashMap<>();

        while (true) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://rickandmortyapi.com/api/location/?page=" + page))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) break;

            LocationResponse result = mapper.readValue(response.body(), LocationResponse.class);

            for (Location location : result.results) {
                locationCount.put(location.name, location.residents.length);
            }

            page++;
        }

        // Top 5 nach Anzahl Bewohner sortieren
        locationCount.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + " | Bewohner: " + e.getValue()));
    }

    private static void interactiveConsole() throws Exception {
        Scanner sc = new Scanner(System.in);
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();

        while (true) {
            System.out.println("\n--- Menü ---");
            System.out.println("1. Charakter nach Name suchen");
            System.out.println("2. Alle Episoden eines Charakters anzeigen");
            System.out.println("3. Beenden");
            System.out.print("Eingabe: ");
            String input = sc.nextLine();

            switch (input) {
                case "1" -> {
                    System.out.print("Name eingeben: ");
                    String name = sc.nextLine();
                    HttpRequest req = HttpRequest.newBuilder()
                            .uri(new URI("https://rickandmortyapi.com/api/character/?name=" + name.replace(" ", "%20")))
                            .GET()
                            .build();

                    HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
                    if (res.statusCode() != 200) {
                        System.out.println("Kein Charakter gefunden.");
                        continue;
                    }

                    CharacterResponse characters = mapper.readValue(res.body(), CharacterResponse.class);
                    for (Character c : characters.results) {
                        System.out.println(c.name + " | " + c.status + " | " + c.species);
                    }
                }
                case "2" -> {
                    System.out.print("Name eingeben: ");
                    String name = sc.nextLine();
                    HttpRequest req = HttpRequest.newBuilder()
                            .uri(new URI("https://rickandmortyapi.com/api/character/?name=" + name.replace(" ", "%20")))
                            .GET()
                            .build();

                    HttpResponse<String> res = client.send(req, HttpResponse.BodyHandlers.ofString());
                    if (res.statusCode() != 200) {
                        System.out.println("Kein Charakter gefunden.");
                        continue;
                    }

                    CharacterResponse characters = mapper.readValue(res.body(), CharacterResponse.class);
                    for (Character character : characters.results) {
                        System.out.println("\n" + character.name + " tritt auf in Episoden:");
                        for (String episodeURL : character.episode) {
                            HttpRequest epReq = HttpRequest.newBuilder()
                                    .uri(new URI(episodeURL))
                                    .GET()
                                    .build();
                            HttpResponse<String> epRes = client.send(epReq, HttpResponse.BodyHandlers.ofString());

                            if (epRes.statusCode() != 200) continue;

                            Episode ep = mapper.readValue(epRes.body(), Episode.class);
                            System.out.println(ep.episode + ": " + ep.name);
                        }
                    }
                }
                case "3" -> {
                    System.out.println("Beenden...");
                    return;
                }
                default -> System.out.println("Ungültige Eingabe!");
            }
        }
    }


}
