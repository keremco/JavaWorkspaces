package kdvHesaplama;

import java.util.Scanner;

public class kdvHesap {

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		System.out.println("Fiyat Giriniz: ");
		double fiyat = input.nextDouble();
		
		double kdvOran = (fiyat < 1000.0) ? 1.18 : 1.08;
		
		System.out.println("KDV'siz fiyat: " + fiyat);
		System.out.println("KDV'li fiyat: " + fiyat * kdvOran);
		System.out.println("KDV Oranı: " + kdvOran);

	}

}
