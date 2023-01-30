
package oopatm;

public class OOPAtm {

  
    public static void main(String[] args) {
        ATM atm=new ATM();
        Hesap hesap=new Hesap("rabia","1234",1000);
        atm.calis(hesap);
        hesap.setBakiye(3000);
        System.out.println("atm den çıkılıyor...");
    }
    
}
