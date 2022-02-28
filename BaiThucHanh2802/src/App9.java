import java.util.Scanner;
public class App9 {
    public static void main (String [] agrs){
        Scanner p = new Scanner(System.in);
        int n,tam=0,t;
        System.out.println("nhap so nguyen duong n:");
        n = p.nextInt();
        while(n>0){
            t=n%10;
            tam = tam*10 + t;
            n/=10;
        }
        System.out.println(tam);
    }
}
