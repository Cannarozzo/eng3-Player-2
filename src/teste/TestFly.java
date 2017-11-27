/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import flywight.media.Audio;
import flywight.media.AudioFactory;
import flywight.media.Media;
import flywight.media.Video;
import flywight.media.VideoFactory;

/**
 *
 * @author lab7
 */
public class TestFly {

    public static void main(String... args) {
        /*
        Video mediaVideo = new Video("yellowLedbetter.mp4", "EddieVeder", 3);
        //  media = new Video("galinhapindadinha.mp4", "galinha", 4);

        VideoFactory videoFactory = VideoFactory.getInstance();

        videoFactory.getVideo(mediaVideo);

        videoFactory.getVideo(mediaVideo);
        videoFactory.getVideo(mediaVideo);
        videoFactory.getVideo(mediaVideo);
        videoFactory.getVideo(mediaVideo);
         */

 /* Sobrecarga
    Audio audio = new Audio("alive.mp3", "Eddie Veder", 2);
    Audio aduio2 = new Audio("foo", "bar", 3);
         */
        AudioFactory audioFactory = AudioFactory.getInstance();

        audioFactory.getAudio("alive.mp3", "Eddie Veder", 2);

        audioFactory.getAudio("alive.mp3", "Eddie Veder", 2);
        audioFactory.getAudio("alive.mp3", "Eddie Veder", 2);

    }

}
