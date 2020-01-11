public class Kursant {
    String imie;
    int wzrostWCm;

    public Kursant(String imie, int wzrost) {
        this.imie = imie;
        if (wzrost < 0) {
            System.out.println("Oj, coś niski kursant");
        }
        this.wzrostWCm = wzrost;
    }

    public String getImie() {
        return imie;
    }

    public int getWzrostWCm() {
        return wzrostWCm;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setWzrostWCm(int wzrostNaKtoreMaszToUstawic) {
        this.wzrostWCm = wzrostNaKtoreMaszToUstawic;
    }
}
