* * * * *

**Basis-Aufgaben (leicht)**
---------------------------

1. **Menschliche Charaktere auf einer Seite filtern**

    - Nur `species = "Human"` ausgeben.

    - Zeige Name, Status, Herkunft.

2. **Weibliche Charaktere auf einer Seite filtern**

    - Nur `gender = "female"` ausgeben.

    - Zeige Name, Status, Herkunft, Geschlecht.

* * * * *

**Mittel-Aufgaben**
-------------------

1. **Alle lebendigen Aliens auf allen Seiten**

    - Rufe alle Seiten von `/character` ab.

    - Filter: `species = "Alien"` und `status = "Alive"`.

    - Ausgabe: Name, Spezies, Status.

2. **Charaktere nach Status zählen**

    - Zähle, wie viele Charaktere `Alive`, `Dead` und `unknown` sind.

    - Gib eine kleine Statistik aus, z.B.:

      ```
      Alive: 345
      Dead: 181
      Unknown: 74

      ```

3. **Charaktere eines Ortes anzeigen**

    - Aufgabe: Nutzer gibt einen Ort ein (`origin.name`).

    - Gib alle Charaktere aus, die von dort stammen.

    - Optional: Zeige auch Status und Spezies und Ort.

* * * * *

**Fortgeschrittene Aufgaben**
-----------------------------

1. **Episode-Charaktere ausgeben**

    - Rufe `/episode/{id}` ab.

    - Hole die Liste der Charakter-URLs aus der Episode.

    - Gib die Namen aller Charaktere aus, die in dieser Episode vorkommen.

2. **Top 5 Orte mit den meisten Bewohnern**

    - Rufe `/location` ab.

    - Zähle, wie viele Charaktere in jeder Location leben.

    - Sortiere und gib die Top 5 aus.

3. **Interaktive Konsolen-App**

    - Menü:

        1. Charakter nach Name suchen

        2. Alle Episoden eines Charakters anzeigen

        3. Beenden

    - Nutzer gibt Eingabe ein → API abfragen → Ausgabe entsprechend.

* * * * *
