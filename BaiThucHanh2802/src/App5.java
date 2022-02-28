import java.util.Scanner;
public class App5 {
    public static void main (String [] agrs){
        Scanner p = new Scanner(System.in);
        int n,sum=0;
        System.out.println("nhap so nguyen duong n: ");
        n = p.nextInt();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum){
            System.out.println(n +" la so hoan thien");
        }else System.out.println(n+" khong phai la so hoan thien");
    }
}
