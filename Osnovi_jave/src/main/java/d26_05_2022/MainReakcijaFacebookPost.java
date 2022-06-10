package d26_05_2022;

public class MainReakcijaFacebookPost {
    public static void main(String[] args) {
        Reakcija prva = new Reakcija(":)","Jovan Jovanovic");
        Reakcija druga = new Reakcija("like", "Milos Milosevic");
        Reakcija treca = new Reakcija("srce", "Marko Markovic");

        FacebookPost objava = new FacebookPost("Milica Milic", "Film");
        objava.reaguj(prva);
        objava.reaguj(druga);

        objava.stampa();
    }

}
