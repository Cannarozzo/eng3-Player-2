package player;

import flywight.media.Media;
import flywight.media.Audio;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PlayList {

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
                filter(midia -> midia.getClass().getSimpleName().equals("Audio")).
                forEach(midia -> System.out.println("\t" + midia));
        System.out.println("PlayList de Video: ");
        medias.stream().
                filter(midia -> midia.getClass().getSimpleName().equals("Video")).
                forEach(midia -> System.out.println("\t" + midia));
        System.out.println("");
        
    }

    public void newMedia(Media media) {
        medias.add(media);
    }

    public Media selectMedia(String name) {
        for (Media m : medias) {
            if (m.equals(name)) {
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
        return midia;
    }

    public void showMenu() {
        Scanner in = new Scanner(System.in);
        String nome, artista;
        int opc, duracao;
        do {
            System.out.println("1-Mostrar mídias");
            System.out.println("2-Adicionar áudio");
            System.out.println("3-Adicionar vídeo");
            System.out.println("4-Selecionar mídia");
            System.out.println("5-Escolher uma mídia aleatoriamente");
            System.out.println("6-Tocar uma mídia");
            System.out.println("0-Voltar ao menu principal");
            System.out.println("Selecione: ");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    showMedias();
                    break;
                case 2:
                    newMedia(currentMedia);
                    break;
                case 3:
                    newMedia(currentMedia);
                    break;
                case 4:
                    selectMedia(name);
                    break;
                case 5:
                    randomSelect();
                    break;
                case 6:
                    System.out.print("Nome: ");
                    in.nextLine();
                    nome = in.nextLine();
                    System.out.print("Artista: ");
                    in.nextLine();
                    artista = in.nextLine();
                    System.out.print("Duracao: ");
                    in.nextLine();
                    duracao = in.nextInt();
                    Media m = new Audio(nome, artista, duracao);
                    m.play();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 0);
        in.close();
    }
}
