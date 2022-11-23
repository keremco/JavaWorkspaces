package daireHesaplama;

import java.util.Scanner;

public class hesaplama {

	public static void main(String[] args) {
		
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Yarı çap giriniz: ");
		int r = input.nextInt();
		
		float cevre = (float)(2 * r * pi);
		double alan = r * r * pi;
		
		System.out.println("Girilen dairenin");
		System.out.println("Çevresi: " + cevre);
		System.out.println("Alanı: " + alan);

	}

}
