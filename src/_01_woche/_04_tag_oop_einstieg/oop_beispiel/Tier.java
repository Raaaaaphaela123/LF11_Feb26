package _01_woche._04_tag_oop_einstieg.oop_beispiel;

public class Tier {
    private String name;
    private int alter;

    // Methode, die später überschrieben werden soll
    public void macheTon() {
        IO.println("Das Tier macht einen Ton");
    }

    // Getter & Setter generieren lassen -> alt + einfg

    // Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
