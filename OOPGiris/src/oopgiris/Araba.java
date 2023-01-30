
package oopgiris;


public class Araba {
    private String renk;
    private int kapılar;
    private int tekerlekler;
    private String motor;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapılar() {//kapılar değişkenini çağırı
        return kapılar;
    }

    public void setKapılar(int kapılar) {//kapılar değişkeni üzerinde değişiklik yapar
        if(kapılar<0){
            System.out.println("değre 0 dan küçük olamaz.");
        }
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
    
}
