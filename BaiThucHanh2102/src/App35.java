import java.util.Scanner;
public class App35 {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int sothu1,sothu2;
        System.out.println("nhap so thu 1: ");
        sothu1 = t.nextInt();
        System.out.println("nhap so thu 2: ");
        sothu2 = t.nextInt();
        int min=sothu1;
        if(min >= sothu2){
            min = sothu2;
        }
        System.out.println("so nho nhat trong 2 chu so la: "+min );
    }
}
