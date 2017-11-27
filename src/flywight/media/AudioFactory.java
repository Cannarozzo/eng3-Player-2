package flywight.media;

import java.util.HashMap;
import java.util.Map;

public class AudioFactory {

    private Map<String, Audio> audioPool;
    private static AudioFactory instance = null;

    private AudioFactory() {
        audioPool = new HashMap<>();
    }

    public static AudioFactory getInstance() {
        if (instance == null) {
            instance = new AudioFactory();
        }
        return instance;
    }

    public Audio getAudio(String name, String artist, int duration) {
        Audio audio = new Audio(name, artist, duration);
        if (audioPool.containsValue(audio)) {
             System.out.println("Retornando audio");
            return audioPool.get(audio);
        }
         System.out.println("Criando audio");
        audioPool.put(audio.getName(), audio);
        return audio;
    }
    
     public Audio getAudio(Audio audio) {      
        if (audioPool.containsValue(audio)) {
            System.out.println("Retornando audio");
            return audioPool.get(audio);
        }
         System.out.println("Criando Audio");
        audioPool.put(audio.getName(), audio);
        return audio;
    }
}
