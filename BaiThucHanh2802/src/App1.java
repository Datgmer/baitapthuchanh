import java.util.Scanner;
public class App1 {
    public static void main (String [] args){
        Scanner p = new Scanner(System.in);
        int a,b;
        System.out.println("nhap 2 so a va b: ");
        a=p.nextInt();
        b=p.nextInt();
        System.out.println("uoc chung lon nhat la: ");
        if(a==0||b==0){
            System.out.println(a);
        }
        while(a!=b){
            if(a>b){
                a-=b;
            }else{
                b-=a;
            }
        }
        System.out.println(a);
    }
}
