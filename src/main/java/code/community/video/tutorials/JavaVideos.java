package code.community.video.tutorials;

import java.util.List;

import static code.community.video.tutorials.VideoFetcher.getVideos;

public class JavaVideos {
    public static String getJavaVideos(String[] args) {
        String playlistUrl = "<iframe width=\"560\" height=\"315\" src=\"" +
                "https://www.youtube.com/embed/videoseries?si=cDt0UNTCcLCNXgO8&amp;list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5\"" +
                " title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; " +
                "clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" " +
                "referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        return playlistUrl;
    }
}
