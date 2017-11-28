/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import flywight.media.Audio;
import flywight.media.Media;
import flywight.media.Video;
import player.PlayList;

/**
 *
 * @author lab7
 */
public class TestePlayer {
    
    public static void main(String ... args){
        
        Audio audio1 = new Audio("foo","foo",2);
        Video video1 = new Video("fooVideo","barVideo",2);
        
        
       
        PlayList pl = new PlayList("felipeRock");
        pl.newMedia(audio1);
        pl.newMedia(video1);
        
        pl.showMedias();
        System.out.println("\t" + pl.randomSelect());
        
        System.out.println(pl.selectMedia("fooVideo"));
        
        
       
    }
    
}
