import java.util.Scanner;
public class App30 {
    private static Scanner p = new Scanner(System.in);
    public static void main(String[] args){
        int n,tong=0,tam ;
        System.out.println("nhap n>0: ");
        n= p.nextInt();
        while(n>0){
            tam= n%10;
            tong += tam;
            n/=10;
        }
        System.out.println("tong cac chu so= "+tong);
    }
}
