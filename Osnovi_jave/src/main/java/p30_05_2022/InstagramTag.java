package p30_05_2022;

public class InstagramTag {
    private int x;
    private int y;
    private InstagramUser user;

    public InstagramTag(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public InstagramUser getUser() {
        return user;
    }

    public void setUser(InstagramUser user) {
        this.user = user;
    }
    public void stampa () {
        System.out.println(x+ " i "+y);
        System.out.println(getUser().getimeIPrezime());
        System.out.println();
    }
}
