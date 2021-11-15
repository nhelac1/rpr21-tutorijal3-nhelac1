package ba.unsa.etf.rpr.tutorijal_3;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj implements Comparable<MobilniBroj>{
    private int mobilnaMreza;
    String broj;

    MobilniBroj (int mobilnaMreza, String broj){
        super();
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override
    public  String ispisi() {
        if (mobilnaMreza == 60)
            return "060/" + broj;
        else if (mobilnaMreza == 61)
            return "061/" + broj;
        else if (mobilnaMreza == 62)
            return "062/" + broj;
        else if (mobilnaMreza == 63)
            return "063/" + broj;
        else if (mobilnaMreza == 64)
            return "064/" + broj;
        else if (mobilnaMreza == 65)
            return "065/" + broj;
        else if (mobilnaMreza == 66)
            return "066/" + broj;
        return "067/" + broj;
    }

    @Override
    public boolean equals(Objects o) {
        MobilniBroj mob = (MobilniBroj) o;
        if (mob.mobilnaMreza == this.mobilnaMreza && this.broj.equals(mob.broj))
            return true;
        return false;
    }
    @Override
    public int hashCode() {
        return 0;
    }
    @Override
    public int compareTo(MobilniBroj o) {
        return this.ispisi().compareTo(o.ispisi());
    }

}
