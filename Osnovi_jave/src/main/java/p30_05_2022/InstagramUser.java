package p30_05_2022;

public class InstagramUser {
    private String userName;
    private String imeIPrezime;
    private String email;

    public InstagramUser() {
    }

    public String getUserName() {
        return userName;
    }

    public String getimeIPrezime() {
        return imeIPrezime;
    }

    public String getEmail() {
        return email;
    }


    public InstagramUser(String userName, String imeIPrezime, String email) {
        this.userName = userName;
        this.imeIPrezime = imeIPrezime;
        this.email = email;
    }
    public void stampa () {
        System.out.println(userName);
        System.out.println(imeIPrezime);
        System.out.println(email);
        System.out.println();
    }
    }

