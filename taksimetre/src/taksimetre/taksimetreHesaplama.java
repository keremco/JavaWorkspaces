package taksimetre;

import java.util.Scanner;

public class taksimetreHesaplama {

	public static void main(String[] args) {
		
		double kmBasina = 2.20;
		int acilisUcret = 10;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Gidilecek Mesafeyi Giriniz: ");
		double gidilecekKm = input.nextDouble();
		
		double totalUcret = acilisUcret + (gidilecekKm * kmBasina);
		double fis = (totalUcret < 20.0)? 20.0 : totalUcret;
		
		System.out.println("Total ücret: " + fis + " TL");

	}

}
