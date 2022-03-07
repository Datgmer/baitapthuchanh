import java.util.Scanner;
public class App90 {
    public static void main(String [] agrs){
        Scanner p = new Scanner(System.in);
        String str;
        str = p.nextLine();
        System.out.println("cac ky tu cua chuoi la: ");
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
