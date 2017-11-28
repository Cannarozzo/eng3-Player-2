package player;

import java.util.ArrayList;
import java.util.List;


public class Player {

    private List<PlayList> playLists;

    public Player() {
        playLists = new ArrayList<>();
    }

    public void showPlayLists() {
        for(PlayList pl : playLists){
            System.out.println("Lista de PlayLists: ");
            System.out.println("\t" + pl);
        }
        System.out.println("");
    }

    public void newPlayList(String name) {
        playLists.add(new PlayList(name));
    }

    public PlayList selectPlayList(String name) {       
        for(PlayList pl : playLists){
            if(pl.getName().equals(name)){
                return pl;
            }
        }
        
        System.out.println("Não existe nenhuma playlist com este nome");
        return null;
    }
}
