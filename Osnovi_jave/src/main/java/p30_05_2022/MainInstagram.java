package p30_05_2022;

public class MainInstagram {
    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("prvi user", "Jovan Jovanovic","jovan@gmail.com");
        InstagramUser user2 = new InstagramUser("drugi user", "Dusan Nikolic","dusan@gmail.com");
        InstagramUser user3 = new InstagramUser("treci user", "Milos MIlosevic","dusan@gmail.com");

        InstagramTag prvi = new InstagramTag(5,3);
        prvi.setUser(user1);
        InstagramTag drugi = new InstagramTag(4,5);
        drugi.setUser(user2);
        InstagramTag treci = new InstagramTag(2,6);
        treci.setUser(user3);

        InstagramImage slika = new InstagramImage("1080x720", "jdjdjdjdjdj");
        slika.dodajTag(prvi);
        slika.dodajTag(drugi);
        slika.dodajTag(treci);

        InstagramPost post = new InstagramPost("Nova Slika");
        post.dodajSliku(slika);

        user1.stampa();
        prvi.stampa();
        slika.stampa();
        post.stampa();
    }
}
