import java.util.Scanner;
public class App7 {
    public static void main ( String[] agrs){
        Scanner p = new Scanner(System.in);
        float x=1,max=0;
        while(x!=0){
            System.out.println("nhap so thuc x: ");
            x = p.nextFloat();
            if(max<x)max=x;
        }
        System.out.println("so thuc lon nhat da nhap la: "+max);
    }
}
