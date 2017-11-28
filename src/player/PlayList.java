package player;

import flywight.media.Media;
import flywight.media.Audio;
import flywight.media.AudioFactory;
import flywight.media.Video;
import flywight.media.VideoFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayList {

    AudioFactory audioFactory;
    VideoFactory videoFactory ;
    
    private String name;
    private List<Media> medias;
    private Media currentMedia;

    public PlayList(String name) {
        medias = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showMedias() {
        System.out.println("PlayList de Som: ");
        medias.stream().
                filter(media -> media instanceof Audio).
                forEach(media -> System.out.println("\t" + media));
        System.out.println("PlayList de Video: ");
        medias.stream().
                filter(media -> media instanceof Video).
                forEach(media -> System.out.println("\t" + media));
        System.out.println("");

    }

    public void newMedia(Media media) {
        medias.add(media);
    }

    //sobreCarga possível
    public Media selectMedia(String name) {
        for (Media m : medias) {
            if (m.getName().equals(name)) {
                this.currentMedia = m;
                return m;
            }
        }
        System.out.println("Midia não encontrada");
        return null;
    }

    public Media randomSelect() {
        System.out.println("Selecionando uma mídia de forma randômica");
        Random r = new Random();
        Media midia = medias.get(r.nextInt(medias.size()));
        this.currentMedia = midia;
        return midia;
    }

    public void showMenu() {
        Scanner in = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1-Mostrar mídias");
            System.out.println("2-Adicionar áudio");
            System.out.println("3-Adicionar vídeo");
            System.out.println("4-Selecionar mídia");
            System.out.println("5-Escolher uma mídia aleatoriamente");
            System.out.println("6-Tocar uma mídia");
            System.out.println("7-Voltar ao menu principal");
            System.out.print("Selecione: ");
            opc = in.nextInt();
            System.out.println("");

            switch (opc) {
                case 1:
                    showMedias();
                    break;
                case 2:
                    System.out.println("AÚDIO: Digite o nome da midia, artista a duração: ");
                    newMedia(new Audio(in.next(), in.next(), in.nextInt()));
                    break;
                case 3:
                    System.out.println("VÌDEO: Digite o nome da midia, artista a duração : ");
                    newMedia(new Video(in.next(), in.next(), in.nextInt()));
                    break;
                case 4:
                    System.out.println("Digite o nome da midia: "); // pleonasmo?
                    currentMedia = selectMedia(in.next());
                    break;
                case 5:
                    currentMedia = randomSelect();
                    System.out.println(currentMedia);
                    break;
                case 6:
                    if (currentMedia == null) {
                        System.out.println("Nenhuma media selecionada! "
                                + "por favor selecione uma media.");
                        System.out.println("");
                        break;
                    }
                    currentMedia.play();
                    System.out.println("");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 7);
        // in.close();
    }

    @Override
    public String toString() {
        return "PlayList{" + "name=" + name + '}';
    }

}
