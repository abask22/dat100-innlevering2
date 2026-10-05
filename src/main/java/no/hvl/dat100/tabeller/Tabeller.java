package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
        System.out.println();
    }

    // b)
    public static String tilStreng(int[] tabell) {

        String skrivUt = "[";
        for (int i = 0; i < tabell.length; i++) {
            skrivUt += tabell[i];
            if (i < tabell.length - 1) {
                skrivUt += ",";
            }
        }
        skrivUt += "]";
        return skrivUt;
    }

    // c)
    public static int summer(int[] tabell) {

        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {

        int[] resultat = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            resultat[i] = tabell[tabell.length - 1 - i];
        }
        return resultat;
    }

    // g)
    public static boolean erSortert(int[] tabell) {

        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {

        int[] resultat = new int[tabell1.length +
                tabell2.length];
        int indeks = 0;
        for (int i = 0; i < tabell1.length; i++) {
            resultat[indeks] = tabell1[i];
            indeks++;
        }
        for (int i = 0; i < tabell2.length; i++) {
            resultat[indeks] = tabell2[i];
            indeks++;
        }
        return resultat;

    }
}
