import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class CopilotService {
    private String apiKey;
    private String apiUrl;

    public CopilotService(String apiKey, String apiUrl) {
        this.apiKey = apiKey;
        this.apiUrl = apiUrl;
    }

    public String callCopilotApi(String prompt) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Bearer " + apiKey);
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String jsonInputString = String.format("{ \"prompt\": \"%s\" }", prompt);

        try (java.io.OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        if (connection.getResponseCode() == 200) {
            java.io.InputStream is = connection.getInputStream();
            return new java.util.Scanner(is, StandardCharsets.UTF_8).useDelimiter("\\A").next();
        } else {
            throw new IOException("Error: " + connection.getResponseCode());
        }
    }
}