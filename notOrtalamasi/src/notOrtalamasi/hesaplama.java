package notOrtalamasi;

import java.util.Scanner;

public class hesaplama {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notu : ");
		int mat = input.nextInt();
		
		System.out.println("Fizik Notu : ");
		int fiz = input.nextInt();
		
		System.out.println("Kimya Notu : ");
		int kim = input.nextInt();
		
		System.out.println("Türkçe Notu : ");
		int tur = input.nextInt();
		
		System.out.println("Tarih Notu : ");
		int tar = input.nextInt();
		
		System.out.println("Müzik Notu : ");
		int muz = input.nextInt();
		
		double ort = (mat + fiz + kim + tur + tar + muz) / 6;
		
		String sonuc = (ort < 60)? "Sınıfta Kaldı." : "Sınıfı Geçti.";
		
		System.out.println(sonuc);

	}

}
