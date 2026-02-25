# 20-Minuten Code-Review

## Zeitplan (Stoppuhr nutzen!)
* **3 Min.  | Intro:** Der Autor erklärt kurz: Was ist das Ziel? Wo gab es Probleme?
* **5 Min.  | Deep Dive:** Der Reviewer liest den Code schweigend und notiert 2-3 Punkte.
* **10 Min. | Austausch:** Gemeinsames Durchgehen der Checkliste (siehe unten).
* **2 Min.  | Wrap-up:** Festlegen der wichtigsten 1-2 Änderungen oder Erkenntnisse.

---

## Die Checkliste

### 1. Logik & Sauberkeit
* **Anforderung:** Tut der Code, was er soll? (Grenzfälle bedacht?)
* **Naming:** Sind Namen sprechend? (z.B. `berechneNetto` statt `doIt`)
* **Struktur:** Sind die Methoden kurz und strukturiert?

### 2. Code-Basics
* **Konventionen:** Klassen `PascalCase`, Methoden/Variablen `camelCase`
* **Sichtbarkeit:** Sind Variablen `private`? (Datenkapselung)
* **Scanner/Resources:** Werden Scanner oder Dateien wieder geschlossen?

### 3. Fehlerresistenz
* Werden Eingaben (z.B. durch `Scanner`) validiert, bevor damit gerechnet wird?
* Gibt es Stellen, an denen das Programm abstürzen könnte (z.B. Division durch 0)?

---

## Feedback-Etikette (Kurzform)
* **Nicht:** "Das ist falsch/schlecht."
* **Sondern:** "Ich glaube, an dieser Stelle könnte X passieren. Was hältst du davon, Y zu probieren?"
* **Ziel:** Den Code verbessern, nicht den Programmierer kritisieren.

---

> **Tipp:** Schafft ihr nicht alles? Konzentriert euch auf die **eine** wichtigste Verbesserung der Lesbarkeit. Code-Qualität ist ein Marathon, kein Sprint!

---

## Beispiel "Verbesserungswürdiger Code"

```java
public class rechner {
    public int x;
    public void Berechne() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(10 / a);
    }
}
```



