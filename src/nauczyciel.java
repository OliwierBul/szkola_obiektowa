public sealed class nauczyciel extends Osoba implements Dyzurny permits Wychowawca{
    private String przedmiot= "";

    public nauczyciel(String imie, int wiek, String przedmiot) {
        super(imie, wiek);
        this.przedmiot = przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    @Override
    public String toString() {
        return "nauczyciel{" +
                "przedmiot='" + przedmiot + '\'' +
                "} " + super.toString();
    }

    @Override
    public void wymkonajdyzuz() {
        System.out.println("spacer po korytarzu");
    }
}
