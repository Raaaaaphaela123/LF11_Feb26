package _01_woche._03_tag_datenstrukturen;

import java.util.Arrays;

public class _03_Zweidimensionale_Arrays {
    public static void main(String[] args) {
        //  Initialisierung mit Größe: 3 Zeilen, 4 Spalten, Werte sind automatisch 0
        // die Länge des äußersten Arrays muss mitgegeben werden
        int[][] array2D = new int[3][4];

        array2D[0][0] = 1;
        array2D[2][3] = 1;

        System.out.println("2D Array mit Größe 3 x 4:");
        // Ausgabe Variante 1

        IO.println("Arrays Klasse Ausgabe");
        System.out.println(Arrays.deepToString(array2D));

        // Ausgabe Variante 2
        for (int[] zeilen : array2D) {
            for (int wertSpalte : zeilen) {
                IO.print(wertSpalte + " ");
            }
            IO.println();
        }

        IO.println("------");

        // Initialisierung mit direkten Werten
        int[][] array2DValues = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        print2DArray(array2DValues);

        // 3. Jagged Array (Zeilen unterschiedlich lang)/unregelmäßig
        int[][] jagged2D = new int[3][];
        jagged2D[0] = new int[2]; // erste Zeile hat 2 Spalten
        jagged2D[1] = new int[4]; // zweite Zeile hat 4 Spalten
        jagged2D[2] = new int[1]; // dritte Zeile hat 1 Spalte
        System.out.println("\n2D Jagged Array:");
        print2DArray(jagged2D);

        // 3D Array
        // Vorstellung:
        // Schichten → Zeilen → Spalten
        int[][][] zahlen = {
                {   // Schicht 1
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {   // Schicht 2
                        {7, 8, 9},
                        {10, 11, 12}
                },
                {   // Schicht 3
                        {13, 14, 15},
                        {16, 17, 18}
                }
        };

        // Zugriff auf ein Element
        // Schicht 2, Zeile 1, Spalte 3 → Wert: 9
        int beispiel = zahlen[1][0][2];

        // Ausgabe
        for (int schicht = 0; schicht < zahlen.length; schicht++) {
            System.out.println("Schicht " + (schicht + 1) + ":");

            for (int zeile = 0; zeile < zahlen[schicht].length; zeile++) {

                for (int spalte = 0; spalte < zahlen[schicht][zeile].length; spalte++) {
                    System.out.print(zahlen[schicht][zeile][spalte] + " ");
                }

                System.out.println(); // Zeilenumbruch
            }

            System.out.println(); // Abstand zwischen Schichten
        }

    }

    // Ausgabe von 2D Arrays
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Ausgabe von 3D-Arrays
    public static void print3DArray(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Schicht " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
