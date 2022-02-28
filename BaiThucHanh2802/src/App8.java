import java.util.Scanner;
public class App8 {
    public static void main (String[] agrs){
        Scanner p = new Scanner(System.in);
        int x=1,M=0;
        while(x!=0){
            System.out.println("nhap so nguyen x: ");
            x=p.nextInt();
            if(x%5==0){
                if(M<x)M=x;
            }
        }
        System.out.println("so nguyen chia het cho 5 lon nhat la: "+M );
    }
}
