public class uczen extends Osoba implements Dyzurny{
    //uczen jest klasa pochodnia klasy bazowej osoba
    //dziedziczenie (bierze wszystko i dodaje cudawniaki)
    private int numer_ucznia;
    private static int liczba_uczniow = 0;
    //static = pole klasy a nie obiektu
    public uczen(String imie, int wiek, int numer_ucznia) {
        super(imie, wiek); //wywolanie kontruktora klasy bazwoej
        this.numer_ucznia = numer_ucznia;
        liczba_uczniow ++;
    }

    public uczen() {
        liczba_uczniow++;
        numer_ucznia = liczba_uczniow;
    }

    public uczen(String imie, int wiek) {
        super(imie, wiek);
        liczba_uczniow++;
        numer_ucznia = liczba_uczniow;
    }

    public int getNumer_ucznia() {
        return numer_ucznia;
    }

    public void setNumer_ucznia(int numer_ucznia) {
        this.numer_ucznia = numer_ucznia;
    }

    public static int getLiczba_uczniow() {
        return liczba_uczniow;
    }

    public static void setLiczba_uczniow(int liczba_uczniow) {
        uczen.liczba_uczniow = liczba_uczniow;
    }

    @Override
    public String toString() {
        return "uczen : " +
                "numer_ucznia=" + numer_ucznia +
                ", imie='" + imie +
                " wiek = " + getWiek();
    }

    @Override
    public void wymkonajdyzuz() {
        System.out.println("czysta tablica");
    }
}
