public class Main {
    public static void main(String[] args) {

        Osoba osoba = new uczen();
        System.out.println(osoba.imie);
        osoba.imie = "Jan";
        System.out.println(osoba.imie);
        osoba.setWiek(12);
        System.out.println("wiek " + osoba.getWiek());
        System.out.println(osoba);
        System.out.println("liczba uczniow " + uczen.getLiczba_uczniow());
        uczen uczen = new uczen("Jadwiga", 16, 123);
        uczen uczen2 = new uczen("Janusz", 17, 21);
        System.out.println("liczba uczniow " + uczen.getLiczba_uczniow());
        System.out.println(uczen);
        System.out.println(uczen2);
        nauczyciel nauczyciel1 = new nauczyciel("Marzena", 19, "WF");
        System.out.println(nauczyciel1);
        System.out.println("proba");
        nauczyciel1.wymkonajdyzuz();
        uczen2.wymkonajdyzuz();


    }
}