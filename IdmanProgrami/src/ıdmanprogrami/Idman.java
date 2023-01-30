
package ıdmanprogrami;


public class Idman {
    private int purpee;
    private int pushup;
    private int situp;
    private int squat;

    public Idman(int purpee, int pushup, int situp, int squat) {
        this.purpee = purpee;
        this.pushup = pushup;
        this.situp = situp;
        this.squat = squat;
    }

    public int getPurpee() {
        return purpee;
    }

    public void setPurpee(int purpee) {
        this.purpee = purpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }
    
    public void hareketYap(String hareketTuru,int sayi){
        if (hareketTuru.equals(purpee)){
            burpeeYap(sayi);
        }else if(hareketTuru.equals(pushup)){
            pushYap(sayi);
            
        }else if(hareketTuru.equals(situp)){
            situpYap(sayi);
            
        }else if(hareketTuru.equals(squat)){
            squatYap(sayi);
            
        }else{
            System.out.print("geçersiz hareket");
        }
        
        
    }
    public void purpeeYap(int sayi){
        if(purpee==0){
            System.out.print("yapacak bişey kalmadı");
        }
    }
    
}
