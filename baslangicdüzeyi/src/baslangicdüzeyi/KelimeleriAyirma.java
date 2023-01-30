
package baslangicdüzeyi;

public class KelimeleriAyirma {
    public static void main (String[] args){
        String mesaj="I LOVE YOU BABY ";
        for( String kelime: mesaj.split(" ")){//Kelimleri boşluğa göre ayır
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
    }
}
