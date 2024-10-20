package code.community.video.tutorials;

import java.util.List;

import static code.community.video.tutorials.VideoFetcher.getVideos;

public class HTMLVideos {
    public static String getHtmlVideos(String[] args) {
        String playlistUrl = "<iframe width=\"560\" height=\"315\" src=\"" +
                "https://www.youtube.com/embed/videoseries?si=lFJipVq5BoBV3mBT&amp;list=PLr6-GrHUlVf_ZNmuQSXdS197Oyr1L9sPB\"" +
                " title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; " +
                "encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=" +
                "\"strict-origin-when-cross-origin\" allowfullscreen></iframe>";
        return playlistUrl;
    }
}
