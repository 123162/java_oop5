
package oopatm;

import java.util.Scanner;

public class Login {
    public  boolean login(Hesap hesap){
        Scanner sn=new Scanner(System.in);
        
        System.out.print("kullanıcı adı:");
        String kullanıcıAdı=sn.nextLine();
        System.out.print("parola:");
        String parola=sn.nextLine();
        
        if(hesap.getKullanıcıAdı().equals(kullanıcıAdı) && hesap.getParaola().equals(parola)){
            return true;
        }else{
            return false;
        }
        
    }
    
}
