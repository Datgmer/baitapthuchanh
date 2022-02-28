import java.util.Scanner;
public class App6 {
    public static int ktrahoanthien(int a){
        int sum=0;
        for(int i=1;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(sum==a){
            return 1;
        }
        return 0;
    }
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        int n;
        System.out.println("nhap so nguyen duong n: ");
        n=p.nextInt();
        System.out.println("cac so hoan thien nho hon n: ");
        for(int i=1;i<n;i++){
            if(ktrahoanthien(i)==1){
                System.out.println(i);
            }
        }
    }
}
