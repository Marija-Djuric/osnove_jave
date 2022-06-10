package Student;

public class StudentOsnovnih extends Student_{

    public StudentOsnovnih() {
    }

    public StudentOsnovnih(String imeIPrezime, int brojIndeksa, int godinaStudija) {
        super(imeIPrezime, brojIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean naBudzetu() {
        if (godinaStudija<5)  {
            return true;
        }
        return false;
    }

}
