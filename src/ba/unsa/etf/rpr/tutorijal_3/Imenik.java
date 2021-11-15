package ba.unsa.etf.rpr.tutorijal_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik;
    Imenik() {
        imenik = new HashMap<>();
    }
    void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }
    String dajIme(TelefonskiBroj br) {
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            TelefonskiBroj broj = entry.getValue();
            String povratni = entry.getKey();
            if (broj.equals(br))
                return povratni;
        }
        return "";
    }
    String naSlovo(char s){
        String vraca = "";
        int brojac = 1;
        for (String ime : imenik.keySet()) {
            if (ime.charAt(0) == s) {
                vraca = vraca + brojac + "." + ime + imenik.get(ime).ispisi();
                brojac = brojac + 1;
            }
        }
        return vraca;
    }
    Set<String> izGrada(FiksniBroj.Grad s) {
        TreeSet<String> povrat = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            TelefonskiBroj pomocni = entry.getValue();
            if (pomocni instanceof FiksniBroj) {
                FiksniBroj br = (FiksniBroj) pomocni;
                povrat.add(entry.getKey());
            }
        }
        return povrat;
    }
    Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        TreeSet<TelefonskiBroj> povrat = new TreeSet<TelefonskiBroj>();
        for (Map.Entry<String, TelefonskiBroj> par : imenik.entrySet()) {
            TelefonskiBroj pomocna = par.getValue();
            if (pomocna instanceof FiksniBroj) {
                FiksniBroj pom2 = (FiksniBroj) pomocna;
                if (pom2.getGrad() == g)
                    povrat.add(pom2);
            }
        }
        return povrat;
    }

}
