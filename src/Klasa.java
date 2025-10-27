import java.util.ArrayList;

public class Klasa {
    private Wychowawca wychowawca;
    private ArrayList<uczen>uczniowie;
    private String nazwaklasy;
    //myslimy co ta klasa powinna wiedziec


    public Klasa(Wychowawca wychowawca, ArrayList<uczen> uczniowie, String nazwaklasy) {
        this.wychowawca = wychowawca;
        this.uczniowie = uczniowie;
        this.nazwaklasy = nazwaklasy;
    }

    public Klasa(String nazwaklasy) {
        this.nazwaklasy = nazwaklasy;
        uczniowie = new ArrayList<>();
    }
}
