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
		
		double priceKm;
		
		
		//condizioni
		if(age<18) {
			priceKm=((kmDistance*price)*80)/100;
		}else if(age>65) {
			priceKm=((kmDistance*price)*60)/100;
		}else {
			priceKm=kmDistance*price;
		}
		
		System.out.print("Il prezzo è di "+priceKm+" €");
		scanner.close();
	}

}
