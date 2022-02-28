import java.util.Scanner;
public class App2 {
    public static void main (String [] agrs){
        Scanner p = new Scanner(System.in);
        float a,b,c;
        System.out.println("nhap so do 3 canh cua tam giac: ");
        a= p.nextFloat();
        b= p.nextFloat();
        c= p.nextFloat();
        if(a+b>c&&a+c>b&&b+c>a){
            if(a*a==b*b+c*c || a*a+b*b==c*c || a*a+c*c==b*b){
                System.out.println("day la tam giac vuong");
            }else if(a==b&&b==c){
                System.out.println("day la tam giac deu");
            }else if(a==b || b==c || a==c){
                System.out.println("day la tam giac can");
            }else if(a*a>b*b+c*c || a*a+b*b<c*c || a*a+c*c<b*b){
                System.out.println("day la tam gia tu");
            }else System.out.println("day la tam giac nhon");
        }else{
            System.out.println("3 canh khong phai 1 tam giac");
        }
    }
}
