/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import player.Player;

/**
 *
 * @author lab7
 */
public class TestPlayer {
    
    
    public static void main(String ... args){
        Player player = new Player();
        
        player.newPlayList("felipeRock");
        player.newPlayList("raquelRock");
        player.newPlayList("AndrewHaskell");
        player.showPlayLists();
        
        System.out.println("");
        
        System.out.println(player.selectPlayList("felipRock"));
               
    }
}
