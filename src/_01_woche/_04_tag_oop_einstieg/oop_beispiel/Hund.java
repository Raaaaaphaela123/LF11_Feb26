package _01_woche._04_tag_oop_einstieg.oop_beispiel;

public class Hund extends Tier {
    // Instanzvariablen
   private String leinenLaenge;

   // Konstruktor

    // muss explizit erstellt werden, wenn wir ihn noch brauche und einen eigenen Konstruktor geschrieben haben
    public Hund() {
    }

    // Konstruktor mit allen Attributen
    public Hund(String name, int alter, String leinenLaenge) {
        super(name, alter);
        this.leinenLaenge = leinenLaenge;
    }

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
    public void spiele(){
        IO.println("Hund spielt");
    }

    public void spiele(String ernsthaftigkeit){
        IO.println("Hund spielt " + ernsthaftigkeit);

    }
}
