package com.company;

public class InsertionSort {

    public static void main(String[] args) {
        // Initialisation du tableau avec le meme nombre d'argument passé au programme.
        int[] sorted = new int[args.length];

        System.out.println("Tableau d'arguments : ");
        afficherTableau(args);
        System.out.println("Tableau sorted : ");
        afficherTableau(sorted);

        for (int i = 0; i < args.length; i++) {
            int argument = Integer.parseInt(args[i]);
            System.out.println("Element à insérer : " + argument);
            int dest = 0;

            // Etape 1
            // Trouvez l'emplacement dest auquel il faut insérer l'argument courant dans le tableau sorted.
            // Pour cela, il suffit de trouver le premier élément qui est plus grand que l'argument à insérer.
            for (int j = 0; j < i; j++) {
                if (sorted[j] > argument) {
                    dest = j;
                    break; /** Instruction permettant de sortir de la boucle sans la terminer **/
                }
            }
            System.out.println("Destination : " + dest);
            // Etape 2
            // Décalez d'un cran à droite la partie se trouvant à droite de dest
            int k;
            if (i + 1 >= sorted.length) {
                k = i;
            } else {
                k = i + 1;
            }
            for (; k > dest; k--) {
                sorted[k] = sorted[k-1];
            }

            // Etape 3
            // Insérez le nouvel élément à l'emplacement dest
            sorted[dest] = argument;
            System.out.println("Tableau après insertion de " + argument);
            afficherTableau(sorted);
        }

    }

    public static void afficherTableau(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
        System.out.println();
    }

    public static void afficherTableau(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
        System.out.println();
    }

    public static int countElement(int[] tab) {
        int count = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                count++;
            }
        }

        return count;
    }
}
