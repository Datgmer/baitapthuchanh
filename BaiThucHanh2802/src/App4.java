import java.util.Scanner;
import java.lang.Math;
public class App4 {
    public static int ktrangto(int a){
        if(a<2){
            return 0;
        }
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                return 0;
            }
        }
        return 1;
    }
    public static void main (String [] agrs){
        Scanner p = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen duong n: ");
        n = p.nextInt();
        System.out.println("cac so nguyen to nho hon "+n+" la: ");
        if(n>=2){
            System.out.println("2 ");
        }
        for(int i=3;i<n;i+=2){
                if(ktrangto(i)==1){
                    System.out.println(i);
                }
            }
        }
}
