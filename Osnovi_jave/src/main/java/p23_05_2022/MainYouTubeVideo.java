package p23_05_2022;

public class MainYouTubeVideo {
    public static void main(String[] args) {
        Video bjesovi = new Video("v6tuOipj5mk","Bjesovi-Aikido",240,
                                  1456, 21,3456);
        bjesovi.pogledaj();
        bjesovi.pogledaj();
        bjesovi.lajkuj();
        bjesovi.lajkuj();
        bjesovi.dislajkuj();

        YoutubePlayer pesma = new YoutubePlayer();
        pesma.ucitajVideo(bjesovi);
        pesma.pojacaj();
        pesma.pojacaj();
        pesma.smanji();
        pesma.postaviKvalitet(5);
        pesma.aktivirajBioskopskiMod();
   //     pesma.premotajUnapred();
        pesma.iscrtajZvuk();
        pesma.iscrtajRezim();
        pesma.iscrtajTrenutnoVreme();
        pesma.iscrtajTimeline();
        pesma.iscitaj();




    }
}
