import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static java.lang.System.in;

public class App110 {
    public static void main(String[] agrs){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner p = new Scanner(in);
        int number;
        System.out.print("nhập số phần tử của mảng: ");
        int n = p.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("nhập phần tử "+ i + ":");
            number = p.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        for(int i=1;i<n;i++){
            while(max<arrListInteger.get(i)){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: "+max);
        int num;
        System.out.print("Nhập số cần xóa: ");
        num = p.nextInt();
        for(int i=0;i<arrListInteger.size();i++){
            if(num==arrListInteger.get(i))arrListInteger.remove(i);
        }
        System.out.println("số phần tử còn lại trong mảng: " + arrListInteger);
        arrListInteger.sort(Comparator.naturalOrder());
        System.out.println("Mảng sắp xếp theo thứ tự tăng dần: " + arrListInteger);
        arrListInteger.sort(Comparator.reverseOrder());
        System.out.println("Mảng sắp xếp theo thứ tự giảm dần: " + arrListInteger);
    }
}
