package org.example.J8;

import com.fasterxml.jackson.databind.*;
import java.net.URL;
import java.net.URI;
import java.io.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exe {
    public static void execute() {
        try(
                HttpClient client = HttpClient.newBuilder()
                        .version(HttpClient.Version.HTTP_1_1)
                        .followRedirects(HttpClient.Redirect.NORMAL)
                        .build()
        )
        {
            /*
            curl -L \
              -H "Accept: application/vnd.github+json" \
              -H "X-GitHub-Api-Version: 2022-11-28" \
              https://api.github.com/users/miyabilink
             */
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://api.github.com/users/miyabilink"))
                    .header("Accept", "application/vnd.github+json")
                    .header("X-Github-Api-Version", "2022-11-28")
                    .GET()
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
//            System.out.println(body);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(body);
            JsonNode blog = root.get("blog");
            System.out.println(blog.textValue());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void execute2() {
        try {
            URL url = URI.create("https://dokojava.jp/favicon.ico").toURL();

            try (
                    InputStream is = url.openStream();
                    FileOutputStream fos = new FileOutputStream("icon.ico")
            ) {
                fos.write(is.readAllBytes());
                fos.flush();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
