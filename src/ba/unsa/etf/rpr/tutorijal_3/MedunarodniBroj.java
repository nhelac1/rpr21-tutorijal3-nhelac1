package ba.unsa.etf.rpr.tutorijal_3;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public String getDrzava(){
        return drzava;
    }
    public void setDrzava(String drzava){
        this.drzava = drzava;
    }

    public String getBroj(){
        return broj;
    }
    public  void setBroj(String broj) {
        this.broj = broj;
    }
    public MedunarodniBroj(String drzava, String broj){
        this.drzava = drzava;
        this.broj = broj;
    }
    @Override


}
