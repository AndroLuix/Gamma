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
public class IlDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	
	double media = 0;
	double somma = 0;
	int num=0;
	int i=0;
	
	do{
		System.out.println("Dammi un numero");
		
		num = input.nextInt();
		
		
		somma = somma+num;
		
		
		i++;//ci permette di dire che la media è 0
		
		
	}while (num!=0);
	
	if(i>1) {
		media = somma/(i-1);
	}
	System.out.println("La media e' "+media);
	
	}
    }
    

