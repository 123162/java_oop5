
package oopgiris;


public class OOPGiris {

  
    public static void main(String[] args) {
        Araba araba1=new Araba();//araba1 nesnesi tanımladık
      
        araba1.setModel("BMV");
        System.out.println("arabanın modeli:"+araba1.getModel());
        araba1.setKapılar(-3);
    }
    
}
