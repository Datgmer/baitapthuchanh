import java.util.Scanner;
public class app47 {
    public static void main(String[] agrs){
        Scanner p = new Scanner(System.in);
        int n,sum=0;
        do{
                System.out.println("nhap so n: ");
                n = p.nextInt();
                sum += n;
        }while (sum>0);
        System.out.println("tong cac so vua nhap= "+ sum);
    }
}
