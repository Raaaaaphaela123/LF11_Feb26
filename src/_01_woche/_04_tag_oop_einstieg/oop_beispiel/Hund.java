package _01_woche._04_tag_oop_einstieg.oop_beispiel;

public class Hund extends Tier {
   private String leinenLaenge;

    public String getLeinenLaenge() {
        return leinenLaenge;
    }

    public void setLeinenLaenge(String leinenLaenge) {
        this.leinenLaenge = leinenLaenge;
    }

    @Override
    public void macheTon() {
        IO.println("Der Hund bellt");
    }

    // Methoden überladen
    public void macheSound(){
        IO.println("Bellt");
    }

    public void macheSound(String lautstaerke){
        IO.println("Bellt " + lautstaerke);

    }
}
