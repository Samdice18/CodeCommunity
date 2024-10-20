package code.community.video.tutorials;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VideoFetcher {

    public static List<String> fetchVideoIds(String playlistUrl) throws IOException {
        List<String> videoIds = new ArrayList<>();

        // Open a connection to the playlist URL
        URL url = new URL(playlistUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Get the content of the page
        InputStream inputStream = connection.getInputStream();
        Scanner scanner = new Scanner(inputStream);
        String content = scanner.useDelimiter("\\A").next();
        scanner.close();

        // Regex pattern to match YouTube video IDs
        String regex = "watch\\?v=([a-zA-Z0-9_-]{11})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);

        // Find and store unique video IDs
        while (matcher.find()) {
            String videoId = matcher.group(1);
            if (!videoIds.contains(videoId)) {
                videoIds.add(videoId);
            }
        }

        return videoIds;
    }

    // Method to generate embedded video HTML
    public static String generateEmbedHtml(String videoId) {
        return "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/" + videoId +
                "\" frameborder=\"0\" allowfullscreen></iframe>";
    }

    public static List<String> getVideos(String url){
        try {
            /// Fetch video IDs from the playlist
            List<String> videoIds = fetchVideoIds(url);
            List<String> HtmlString = new ArrayList<>();

            /// Add embedHtml string to list
            for (String videoId : videoIds) {
                String embedHtml = generateEmbedHtml(videoId);
                HtmlString.add(embedHtml);
            }
            return HtmlString;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
