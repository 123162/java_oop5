
package oopatm;

import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
      Login login=new Login();
      Scanner sn=new Scanner(System.in);
      System.out.println("Bankamıza hoşgeldiniz....");
      System.out.println("***************....");
      System.out.println("kullanıcı girişi");
      
      int girisHakki=3;
      while(true){
          if(login.login(hesap)){
              System.out.println("giriş başarılı");
              break;
          }else{
              System.out.println("basarısız giriş");
              girisHakki-=1;
              System.out.println("kalan giriş:"+girisHakki);
          }if(girisHakki==0){
              System.out.println("giriş hakkınız bitti");
              return;
          }
      
      }
          System.out.println("********************");
          String islemler="3-para çekme\n"
                  + "2-para yatırma\n"
                  + "1-çıkış için q ya basın";
          
          System.out.println(islemler);
          System.out.println("***************");
          
          
          while(true){
              System.out.println("işlemi seçiniz:");
              String islem=sn.nextLine();
              if(islem.equals("q")){
                  break;
              }else if(islem.equals("1")){
                  System.out.println("bakiye:"+hesap.getBakiye());
                  
              }else if(islem.equals("2")){
                  System.out.println("yatırmak istediğiniz tutar:");
                  int tutar=sn.nextInt();
                  sn.nextLine();
                  hesap.paraYatır(tutar);
              }else if(islem.equals("3")){
                  System.out.println("çekmek istediğiniz tutarı giriniz");
                  int tutar=sn.nextInt();
                  sn.nextLine();
                  hesap.paraCek(tutar);
              }else{
                  System.out.println("geçersiz işlemr");
              }
                  
      }
    
}}
