package d20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {
        FacebookPost zdravo = new FacebookPost("Jovan Jovanović","Miloš Milošević", "Zdravo kako ste?");
        zdravo.lajkovi=10;
        zdravo.brojDeljenja=20;

        zdravo.like();
        zdravo.like();
        zdravo.like();
        System.out.println("Novi broj lajkova je "+zdravo.lajkovi);

        zdravo.dislike();
        zdravo.dislike();
        if (zdravo.lajkovi>=0) {
            System.out.println("Novi broj lajkova je "+zdravo.lajkovi);
        } else {
            System.out.println("Novi broj lajkova je 0");
        }

        zdravo.share();
        zdravo.share();
        System.out.println("Novi broj deljenja je "+zdravo.brojDeljenja);

        System.out.println();
        zdravo.print();
        System.out.println();


        FacebookPost film = new FacebookPost("Jelena Jelić","Ivana Ivić","Odličan film!");
        film.lajkovi=20;
        film.brojDeljenja=2;

        film.like();
        film.like();
        System.out.println("Novi broj lajkova je "+film.lajkovi);

        film.dislike();
        film.dislike();
        film.dislike();
        film.dislike();
        if (film.lajkovi>=0) {
            System.out.println("Novi broj lajkova je "+film.lajkovi);
        } else {
            System.out.println("Novi broj lajkova je 0");
        }

        film.share();
        film.share();
        film.share();
        System.out.println("Novi broj deljenja je "+film.brojDeljenja);

        System.out.println();
        film.print();
    }
}

