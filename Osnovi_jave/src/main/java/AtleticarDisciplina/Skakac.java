package AtleticarDisciplina;

public class Skakac extends Atleticar{

    public Skakac() {
    }

    public Skakac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean bolji(Atleticar atleticar) {
        if (rezultat>atleticar.rezultat) {
            return true;
        } else return false;
    }
}
