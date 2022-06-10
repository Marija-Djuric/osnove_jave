package AtleticarDisciplina;

public class Trkac extends Atleticar{
    public Trkac() {
    }

    public Trkac(String imeIPrezime, double rezultat) {
        super(imeIPrezime, rezultat);
    }

    @Override
    public boolean bolji(Atleticar atleticar) {
        if (rezultat<atleticar.rezultat) {
            return true;
    } return false;
}
}