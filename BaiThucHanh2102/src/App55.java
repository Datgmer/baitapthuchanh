import java.util.Scanner;
public class App55 {
    public static void main(String[] agrs){
        Scanner p = new Scanner(System.in);
        System.out.println("cac so chia het cho 5 tu 0-20 la: ");
        for(int i=0;i<=20;i++){
            if(i%5==0)System.out.println(i);
        }
    }
}
