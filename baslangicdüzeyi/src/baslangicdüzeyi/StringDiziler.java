
package baslangicdüzeyi;

public class StringDiziler {
    public static void main(String[] args){
        String mesaj="bugün hava çok güzel";
        System.out.println(mesaj);
        System.out.println(mesaj.isEmpty());
        System.out.println("eleman sayisi:"+mesaj.length());
        System.out.println("dizideki 5. eleman:"+mesaj.charAt(4));
        System.out.println(mesaj.concat("rabia"));
        System.out.println(mesaj.startsWith("h"));
        System.out.println(mesaj.endsWith("k"));
        char[] karakterler=new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf("a"));
        System.out.println(mesaj.replace(' ', '-'));
        String yenimesaj=mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        
        System.out.println(mesaj.substring(2));//2.stringden itibaren parçalıyor
        System.out.println(mesaj.substring(2,5));//2-5 arası stringleri alıyor
                
    }
    
}
