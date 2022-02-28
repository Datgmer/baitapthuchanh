import java.util.Scanner;
public class App3 {
    public static void main (String [] agrs){
        Scanner p = new Scanner(System.in);
        int a,ch=0;
        System.out.println("nhap so nguyen duong a: ");
        a = p.nextInt();
        if(a<2){
            ch = 1;
        }
        for(int i=2;i<a-1;i++){
            if(a%i==0){
                ch = 1;
                break;
            }else ch = 0;
        }
        if(ch == 0){
            System.out.println(a+" la so nguyen to");
        }else if(ch == 1){
            System.out.println(a+"khong phai la so nguyen to");
        }
    }
}
