
package baslangicdüzeyi;

import java.util.Scanner;

public class labornek1 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin  girin:");
        String metin=input.nextLine();
 
        String cevrilen = cevir(metin);
        System.out.println("Çevrilen Yazı: " + cevrilen);
    }
 
    public static String cevir(String metin)
    {
        if (metin.isEmpty())
            return metin;
 
        return cevir(metin.substring(1)) + metin.charAt(0);
    }
}
