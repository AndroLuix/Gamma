/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsi.fullstackjava.Loop2003;

import java.util.Scanner;

/**
 *
 * @author lui12
 */
public class MediaArtimetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli numero");
        int numero = input.nextInt();

        System.out.println("Soglia da non superare");
        int soglia = input.nextInt();

        int i = 0; //contatore dichiarato

        if (numero > 0) {

            do {

                i++; //contatore

                System.out.println("Scegli numero");

                numero = input.nextInt();
                if (numero > soglia) {

                }

            } while (numero > soglia);
        } else {
            System.out.println("Devessere numero maggor0");
        }

    }

}
