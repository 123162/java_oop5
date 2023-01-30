
package baslangicdüzeyi;

public class Cokboyutludizi {
    public static void main(String[] args){
        String[][] sehirler=new String[3][3];//3 bölge 3 sehir
        sehirler[0][0]="İstanbul";
        sehirler[0][1]="bursa";
        sehirler[0][2]="tekirdağ";
        sehirler[1][0]="agri";
        sehirler[1][1]="van";
        sehirler[1][2]="kars";
        sehirler[2][0]="kayseri";
        sehirler[2][1]="ankara";
        sehirler[2][2]="tokat";
        
        for(int i=0;i<=2;i++){
            System.out.println("-------------");
            for(int j=0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
