package ucgenHesaplama;

import java.util.Scanner;

public class hesaplama {

	public static void main(String[] args) {
		
		Scanner	input = new Scanner(System.in);
		
		System.out.println("Dik kenarları girin: ");
		int kenarA = input.nextInt();
		int kenarB = input.nextInt();
		
		double kenarC = Math.sqrt((kenarA*kenarA)+(kenarB*kenarB));
		
		System.out.println("Hipotenüs = " + kenarC);

	}

}
