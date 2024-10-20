package code.community.video.tutorials;

import java.util.List;

import static code.community.video.tutorials.VideoFetcher.getVideos;

public class SpringBootVideos {
    public static String getSpringBootVideos(String[] args) {
        String playlistUrl = "<iframe width=\"560\" height=\"315\" src=\"" +
                "https://www.youtube.com/embed/videoseries?si=gLH8rkFGZaowxlR0&amp;list=PLsyeobzWxl7oA8QOlMtQsRT_I7Rx2hoX4" +
                "\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay;" +
                " clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" " +
                "referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        return playlistUrl;
    }
}
