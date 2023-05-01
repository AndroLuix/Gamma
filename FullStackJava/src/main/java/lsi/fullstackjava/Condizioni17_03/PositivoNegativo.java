/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lsi.fullstackjava.Condizioni17_03;

import java.util.Scanner;



/**
 *
 * @author lui12
 */
public class PositivoNegativo {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Inserisci un numero");
	int x = scanner.nextInt();
	
	try{
		if(x > 0) {
	
		System.out.println("il numero inserito e' Positivo");
	} else if(x < 0) {
		System.out.println("il numero inserito e' Negativo");
	} else {
		System.out.println("il numero inserito e' 0");
	}
	}catch (Exception err){
		System.out.println("Errore, non inserire lettere"+ err.getMessage());
	}
    }
}
