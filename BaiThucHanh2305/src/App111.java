import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class App111 {
    public static void main(String[] agrs){
        LinkedList<Integer> linkedListInteger = new LinkedList<>();
        int n;
        Scanner p = new Scanner(in);
        System.out.println("Nhập số phần tử trong LinkedList: ");
        n = p.nextInt();
        for(int i = 0; i<n ; i++){
            System.out.println("Nhập phần tử thứ "+(i+1)+":");
            int number;
            number = p.nextInt();
            linkedListInteger.add(number);
        }
        int tong=0,dem=0,tbc=0;
        System.out.println("Danh sách linkedlist: "+ linkedListInteger);
        for(int i = 0; i<linkedListInteger.size();i++){
            if(linkedListInteger.get(i)%2==0){
                tong += linkedListInteger.get(i);
                dem++;
            }
            tbc = tong/dem;
        }
        System.out.println("Trung bình cộng các phần tử số chẵn trong linkedlist: "+ tbc);
    }
}
