package org.generation.italy;

import java.util.Scanner;

public class BigliettoDelTreno {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		//var
		int age;
		int kmDistance;
		double price=0.21;
		
		System.out.print("Kilometri da percorrere: ");
		kmDistance=scanner.nextInt();
		System.out.print("Età: ");
		age=scanner.nextInt();
		
		double priceKm=price*kmDistance;
		double discountOver65=(priceKm*60)/100.00;
		double discountTeen=(priceKm*80)/100.00;
		
		//condizioni
		if(age<18) {
			System.out.print("Il prezzo è di "+ discountTeen+" €");
		}else if(age>65) {
			System.out.print("Il prezzo è di "+ discountOver65+" €");
		}else {
			System.out.print("Il prezzo è di "+ priceKm+" €");
		}
		scanner.close();
	}

}
