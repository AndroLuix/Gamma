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
public class FincheZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        int num = 1;
        int num2 = 2;
        
	while(!(num2==0) || !(num==0)){
             
            System.out.println("Inserisci prima cifra per la somma");
            num = scanner.nextInt();
            
            System.out.println("Inserisci seconda cifra per la somma");
            num2 = scanner.nextInt();
            
            int somma = num+num2;
            System.out.println(num+ " + "+ num2+ " = "+ somma);
                
        }
    }
    
}
