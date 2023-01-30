
package oopatm;

public class Hesap {
   private String kullanıcıAdı;
   private String paraola;
   private int bakiye;

    public Hesap(String kullanıcıAdı, String paraola, int bakiye) {//constractor
        this.kullanıcıAdı = kullanıcıAdı;
        this.paraola = paraola;
        this.bakiye = bakiye;
    }
//getter - setter methodlar
    public String getKullanıcıAdı() {
        return kullanıcıAdı;
    }

    public void setKullanıcıAdı(String kullanıcıAdı) {
        this.kullanıcıAdı = kullanıcıAdı;
    }

    public String getParaola() {
        return paraola;
    }

    public void setParaola(String paraola) {
        this.paraola = paraola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
   //methodlar
   public void paraYatır(int tutar){
       bakiye+=tutar;
       System.out .println("güncel bakiye:"+bakiye);
   }
   public void paraCek(int tutar){
       if(bakiye-tutar<0){
          
       }else{
           bakiye-=tutar;
            System.out.println("bakiye:"+bakiye);
       }
   }
}
