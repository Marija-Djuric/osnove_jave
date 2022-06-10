package p18_05_2022;

public class MainSlackMessage {
    public static void main(String[] args) {
        SlackMessage x = new SlackMessage();
        x.tekst="kdjskjdfhskjfhkjhf";
        x.imeIPrezime="Jovan Jovanović";
        x.datumIVreme="26.08.2021 18:55";

        System.out.println(x.imeIPrezime + " - " + x.datumIVreme);
        System.out.println(x.tekst);
    }
}
