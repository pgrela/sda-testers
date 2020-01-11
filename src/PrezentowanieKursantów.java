public class PrezentowanieKursantów {
    public static void main(String[] args) {
        Kursant kursantkaZosia =
                new Kursant("Zosia",172);
        Kursant kursantStefan =
                new Kursant("Stefanek",164);

        zaprezentujKursanta(kursantStefan);
        zaprezentujKursanta(kursantkaZosia);
    }

    static void zaprezentujKursanta(Kursant kursant) {
        System.out.printf("Proszę Państwa oto %s o wzroście %d!\n",
                kursant.getImie(),
                kursant.getWzrostWCm());
    }
}
