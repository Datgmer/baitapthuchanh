import java.util.Scanner;
public class App11 {
    public static void main (String[] agrs){
        Scanner p = new Scanner(System.in);
        int m=10000,n=50000,h=20000,s;
        System.out.println("truong hop: ");
        for(int i=0;i<=4;i++){
            for(int j=0;j<=10;j++){
                for(int k=0;k<=20;k++){
                    s=n*i+h*j+m*k;
                    if(s==200000)System.out.println(n+"*"+i+"+"+h+"*"+j+"+"+m+"*"+k);
                }
            }
        }
    }
}
