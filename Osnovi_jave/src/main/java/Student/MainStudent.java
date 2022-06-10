package Student;

public class MainStudent {
    public static void main(String[] args) {
        StudentMaster prvi = new StudentMaster("Jovan Jovanovic",22,4);
        StudentOsnovnih drugi = new StudentOsnovnih("Milica Milic",11,3);

        prvi.cenaSkolarine();
        prvi.naBudzetu();
        prvi.stampa();

        drugi.cenaSkolarine();
        drugi.naBudzetu();
        drugi.stampa();
    }
}
