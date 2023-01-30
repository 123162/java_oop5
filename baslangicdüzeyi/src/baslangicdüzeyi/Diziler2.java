
package baslangicdüzeyi;

public class Diziler2 {
    public static void main(String[] args){
        double[] mylist={1.2,2.3,3.4,5.0};
        double total =0;
        double max=mylist[0];
        for(double number:mylist){
            if(max<number){
                max=number;
            }
            total=total+number;
            System.out.println(number);
            System.out.println("toplam:"+total);
            System.out.println("max sayi:"+number);
        }
    }
}
