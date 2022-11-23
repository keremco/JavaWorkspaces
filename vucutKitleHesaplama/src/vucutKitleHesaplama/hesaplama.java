package vucutKitleHesaplama;

import java.util.Scanner;

public class hesaplama {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Boyunuzu giriniz (metre cinsinden): ");
		double boy = input.nextDouble();
		
		System.out.println("Kilonuzu giriniz: ");
		double kilo = input.nextDouble();
		
		double indeks = kilo / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz: " + indeks);

	}

}
