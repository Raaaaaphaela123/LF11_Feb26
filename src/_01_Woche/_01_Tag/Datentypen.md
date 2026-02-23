Java Variablen, Konstanten und Datentypen
=========================================

Einleitung
----------

In Java sind Variablen, Konstanten und Datentypen grundlegende Bausteine jeder Anwendung. Dieses Dokument bietet einen Überblick über die wichtigsten Konzepte, praktische Beispiele und ein zusammenfassendes Beispielprogramm.

* * * * *

Variablen
---------

Variablen sind Platzhalter für Werte, die sich im Laufe des Programms ändern können.

### Deklaration und Initialisierung

```
int zahl;             // Deklaration
zahl = 42;            // Initialisierung
int andereZahl = 5;   // Deklaration und Initialisierung in einem Schritt
```

**Best Practice:**

-   Variablen werden in camelCase geschrieben `andereZahl`


### Typisierung

Java ist eine **stark typisierte Sprache**. Der Datentyp einer Variablen muss beim Anlegen bekannt sein und kann sich nicht ändern.

**Vergleich mit Python:** In Python ist die Typisierung dynamisch. Dort könnte man einfach `x = 5` schreiben, und der Typ wird automatisch bestimmt. In Java ist `int x = 5;` zwingend erforderlich.

* * * * *

Konstanten
----------

Konstanten sind Variablen, deren Wert nach der Initialisierung **nicht** mehr geändert werden darf.

### Syntax

```
final double PI = 3.14159;
final int MAX_WERT = 100;
```

**Best Practice:**

-   Konstanten werden üblicherweise in Großbuchstaben mit Unterstrichen geschrieben. `MAX_WERT`

**Vergleich mit Python:** In Python gibt es keine echten Konstanten. Stattdessen wird eine Variable wie `PI = 3.14` einfach per Konvention großgeschrieben. Technisch bleibt sie aber veränderbar.

* * * * *

Primitive Datentypen
--------------------

Java kennt acht primitive Datentypen. Diese speichern einfache Werte direkt im **Stack-Speicher**. Sie sind sehr performant und benötigen wenig Speicher.

### Ganzzahlen

-   `byte` (8 Bit): -128 bis 127

-   `short` (16 Bit): -32.768 bis 32.767

-   `int` (32 Bit): ca. ±2 Milliarden → Standard für Ganzzahlen

-   `long` (64 Bit): sehr große Ganzzahlen (mit `L` am Ende: z. B. `123L`)

### Gleitkommazahlen

-   `float` (32 Bit): einfache Genauigkeit (mit `f` am Ende: z. B. `3.14f`)

-   `double` (64 Bit): doppelte Genauigkeit → Standard für Kommazahlen

### Weitere primitive Typen

-   `char`: einzelnes Unicode-Zeichen (z. B. `'A'`)

-   `boolean`: nur `true` oder `false`

**Best Practice:** Verwende den kleinstmöglichen Typ, der alle benötigten Werte abdeckt. Für Ganzzahlen fast immer `int`, für Kommazahlen `double`.


**Vergleich mit Python:** Python kennt nur einen allgemeinen `int`, der beliebig groß sein kann. Auch `float` entspricht eher Java `double`. Typen wie `byte` oder `char` gibt es dort nicht direkt.

* * * * *

Nicht-primitive Datentypen (Referenztypen)
------------------------------------------

Nicht-primitive Datentypen enthalten **Referenzen auf Objekte**, die im **Heap-Speicher** angelegt werden. Die Variable selbst liegt auf dem Stack und verweist auf das Objekt im Heap.

### Beispiele

-   `String`: Zeichenkette (`String name = "Max";`)

-   Arrays: Felder mit mehreren Werten desselben Typs (`int[] zahlen = {1, 2, 3};`)

-   Eigene Objekte: (`Person p = new Person();`)

-   Listen, Maps und viele weitere aus der Java Collection API

### Unterschiede zu primitiven Typen

-   Müssen (meist) mit `new` erzeugt werden (Ausnahme: `String`-Literale)

-   Können `null` sein (d. h. keine Referenz auf ein Objekt)

-   Haben Methoden (z. B. `name.length()` für einen String)

### Heap vs. Stack

![Heap Stack Example](JavaHeapStack.png)

-   **Primitive Typen:** werden direkt im Stack gespeichert → schneller Zugriff

-   **Referenztypen:** Referenz im Stack, Objekt selbst im Heap → flexibler, aber langsamer

**Best Practice:**

-   Vermeide unnötige Objekterzeugung im Heap (z. B. bei Schleifen)

-   Bevorzuge primitive Typen für einfache Daten (z. B. `int` statt `Integer`), außer wenn z. B. `null` oder Generics benötigt werden


**Vergleich mit Python:** In Python sind alle Werte Objekte und werden als Referenzen behandelt. Eine Unterscheidung wie primitive vs. Referenztypen gibt es dort nicht -- auch `int` oder `str` sind dort Objekte mit Methoden.

* * * * *

Typumwandlung (Casting)
-----------------------

### Implizit (automatisch):

```
int x = 10;
long y = x; // int passt in long
```

### Explizit (manuell):

```
double d = 9.99;
int i = (int) d; // ergibt 9, Nachkommastellen gehen verloren
```

**Best Practice:** Typumwandlung immer bewusst und möglichst nur, wenn notwendig durchführen.

**Vergleich mit Python:** Python übernimmt Casting meist automatisch oder erlaubt es über Funktionen wie `int()` oder `float()`.

* * * * *

Übersicht: Gemeinsamkeiten & Unterschiede
-----------------------------------------

-   **Primitive Typen:**

    -   Direkt im Stack gespeichert

    -   Schnell und speichereffizient

    -   Können nicht `null` sein

    -   Keine Methoden

-   **Nicht-primitive Typen (Referenztypen):**

    -   Verweisen auf Objekte im Heap

    -   Langsamer, dafür flexibel

    -   Können `null` sein

    -   Haben Methoden und zusätzliche Funktionalität

**Vergleich mit Python:** Python kennt keine echte Trennung. Alles ist ein Objekt im Speicher, und jede Variable verweist auf eine Referenz. In Java muss man hingegen immer bewusst entscheiden, ob man mit primitiven oder Referenztypen arbeitet.

* * * * *

Beispielprogramm
----------------

```
public class Uebersicht {
    public static void main(String[] args) {
         // Konstante
		final double MWST = 0.19;

		// Primitive Typen
		byte kleineZahl = 120;
		short kurzeZahl = 32000;
		int alter = 25;
		long grosseZahl = 12345678900L;
		float pi = 3.14f;
		double temperatur = 36.6;
		boolean istKalt = false;
		char geschlecht = 'F';

		// Nicht-primitive Typen
		String name = "Anna";
		int[] noten = { 1, 2, 1, 3 };

		// Ausgabe
		System.out.println("Steuersatz: " + MWST);
		System.out.println("Byte-Wert: " + kleineZahl);
		System.out.println("Short-Wert: " + kurzeZahl);
		System.out.println("Alter: " + alter);
		System.out.println("Long-Wert: " + grosseZahl);
		System.out.println("Float-Wert: " + pi);
		System.out.println("Temperatur: " + temperatur);
		System.out.println("Geschlecht: " + geschlecht);
		System.out.println("Ist kalt? " + istKalt);

		System.out.println("Name: " + name);
		System.out.println("Note 1: " + noten[0]);
    }
}
