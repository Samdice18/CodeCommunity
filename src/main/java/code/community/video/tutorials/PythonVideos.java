package code.community.video.tutorials;

import java.util.List;

import static code.community.video.tutorials.VideoFetcher.getVideos;

public class PythonVideos {
    public static String getPythonVideos(String[] args) {
        String playlistUrl = "<iframe width=\"560\" height=\"315\" src=\"" +
                "https://www.youtube.com/embed/videoseries?si=SAQRN2uJ9PuKvnCc&amp;list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3\"" +
                " title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay;" +
                " clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" " +
                "referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        return playlistUrl;
    }
}
