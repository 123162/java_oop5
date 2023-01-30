
package baslangicdüzeyi;

import java.util.Scanner;

public class Baslangicdüzeyi {
    
    public static void ozelSayiBulma(){

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3 basamakli sayi giriniz:");
		 int sayi = scanner.nextInt();
		 
		 int birler = sayi %10;
		 int onlar = (sayi%100) /10;
		 int yuzler = sayi/100;
		 int ozelSayi = (int) ((int) Math.pow(birler,3) + Math.pow(onlar, 3) + Math.pow(yuzler,3));
		 
		 boolean OzelSayidir = true;
		 boolean OzelSayiDegildir = false;
		 
		 if(ozelSayi == sayi)
		 {
			 System.out.println(OzelSayidir);
		 }
		 else {
			 System.out.println(OzelSayiDegildir);
			 
		 }
		 
	}


	public static void main(String[] args) {
		
		ozelSayiBulma();
	}
    
}
