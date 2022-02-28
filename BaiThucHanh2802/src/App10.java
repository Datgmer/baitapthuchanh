import java.util.Scanner;
public class App10 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        int n,dem=0,a;
        System.out.println("nhap so nguyen duong n: ");
        n =p.nextInt();
        while(n>0){
            a=n%10;
            n/=10;
            dem++;
        }
        System.out.println(dem);
    }
}
