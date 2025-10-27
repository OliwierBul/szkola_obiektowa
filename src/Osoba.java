public abstract class Osoba {
    //klasa z klasy abstrakcyjnej, nie mozna utworzc obiektu tej klasy
    public String imie; //dostepne wszedzie
    private int wiek; // hermetyzacja, dostep tylko w klasie
    //protected w tej klasie i klasach potomnych (tylko w javie w ramach pakietu)
    //brak modyfikatora dostepu - dostep w pakiecie
    //przeciazanie konstruktorow
    public Osoba() {
        imie = "";
        wiek = 0;
    }

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    //metody dostepowe;


    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek < 0 || wiek>100){
            this.wiek = 0;
        } else {
            this.wiek = wiek;
        }
    }
    @Override //wypisywanie poszczegolnych osob:
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
