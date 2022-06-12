package Student;

public class StudentMaster extends Student_{
    public StudentMaster() {
    }

    public StudentMaster(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean naBudzetu() {
        if (godinaStudija<2)  {
            return true;
        }
        return false;
    }
}
