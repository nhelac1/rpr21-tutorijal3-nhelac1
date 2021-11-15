package ba.unsa.etf.rpr.tutorijal_3;

public class FiksniBroj extends TelefonskiBroj implements Comparable<FiksniBroj> {
    public enum Grad {TRAVNIK, ORASJE, ZENICA, SARAJEVO, LIVNO, TUZLA, MOSTAR, BIHAC, GORAZDE, SIROKI_BRIJEG, BRCKO};
    private String broj;
    private Grad grad;

    FiksniBroj(Grad grad, String broj) {
        super();
        this.broj = broj;
        this.grad = grad;
    }

    @Override
    public String ispisi(){
        if (grad.equals(Grad.TRAVNIK))
            return "030/"+broj;
        else if (grad.equals(Grad.ORASJE))
            return "031/" + broj;
        else if (grad.equals(Grad.ZENICA))
            return "032/" + broj;
        else if (grad.equals(Grad.SARAJEVO))
            return "033/" + broj;
        else if (grad.equals(Grad.LIVNO))
            return "034/" + broj;
        else if (grad.equals(Grad.TUZLA))
            return "035/" + broj;
        else if (grad.equals(Grad.MOSTAR))
            return "036/" + broj;
        else if (grad.equals(Grad.BIHAC))
            return "037/" + broj;
        else if (grad.equals(Grad.GORAZDE))
            return "038/" + broj;
        else if (grad.equals(Grad.SIROKI_BRIJEG))
            return "039/" + broj;
        else if (grad.equals(Grad.BRCKO))
            return "049/" + broj;
        return "036/" + broj;
    }
    public Grad getGrad() {
        return grad;
    }
    @Override
    public boolean equals(Object o) {
        FiksniBroj fiksni = (FiksniBroj) 0;
        if (fiksni.grad == this.grad && this.broj.equals(fiksni.broj))
            return true;
        return false;
    }
    @Override
    public int compareTo(FiksniBroj o) {
        return this.ispisi().compareTo(o.ispisi());
    }
    public int hashCode(){
        return 0;
    }
}
