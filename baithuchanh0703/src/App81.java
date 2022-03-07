import java.util.Scanner;
public class App81 {
    public static void main (String[] agrs){
        Scanner p =new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("arr["+i+"]["+j+"]");
                arr[i][j]=p.nextInt();
            }
        }
        int max=arr[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("gia tri lon nhat cua mang la: "+max);
    }
}
