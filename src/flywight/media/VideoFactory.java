package flywight.media;

import java.util.HashMap;
import java.util.Map;

public class VideoFactory {

    public Map<String, Video> videoPool;
    private static VideoFactory instance = null;

    private VideoFactory() {
        videoPool = new HashMap<>();
    }

    public static VideoFactory getInstance() {
        if (instance == null) {
            instance = new VideoFactory();
        }

        return instance;
    }

    public Video getVideo(String name, String artist, int duration) {
        Video video = new Video(name, artist, duration);
        if (videoPool.containsValue(video)) {
            return videoPool.get(video.getName());
        }

        videoPool.put(video.getName(), video);
        return video;
    }

    public Video getVideo(Video video) {
        if (videoPool.containsValue(video)) {
            System.out.println("retornando objeto vídeo");
            return videoPool.get(video.getName());
        }

        System.out.println("Criando objeto video");
        videoPool.put(video.getName(), video);
        return video;
    }
}
