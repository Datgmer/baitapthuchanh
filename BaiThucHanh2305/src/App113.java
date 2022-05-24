import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import static java.lang.System.in;

public class App113 {
    public static void main(String[] agrs){
        HashSet<String> traicay = new HashSet<>();
        String ten;
        int n;
        Scanner p = new Scanner(in);
        System.out.print("nhập số lượng loại trái cây: ");
        n = p.nextInt();
        ten = p.nextLine();
        for(int i = 0 ; i<n;i++){
            System.out.println((i+1)+": ");
            ten = p.nextLine();
            traicay.add(ten);
        }
        System.out.println("Các loại trái cây trong danh sách: "+ traicay);
        String ktra;
        System.out.println("tìm kiếm trái cây trong danh sách: ");
        ktra = p.nextLine();
        if(traicay.contains(ktra)) System.out.println(ktra + " có trong danh sách");
        else System.out.println(ktra + " không có trong danh sách");
        String xoa;
        System.out.println("nhập loại trái cây cần xóa: ");
        xoa = p.nextLine();
        traicay.remove(xoa);
        System.out.println("các loại trái cây còn lại trong danh sách: " + traicay);
        HashSet<String> list = new HashSet<>();
        int m;
        String tenl;
        System.out.println("nhập số lượng loại trái cây trong list: ");
        m = p.nextInt();
        tenl = p.nextLine();
        for(int i= 0;i<m;i++){
            System.out.println((i+1)+": ");
            tenl= p.nextLine();
            list.add(tenl);
        }
        traicay.addAll(list);
        Iterator <String> itr = traicay.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+ "\t");
        }
        traicay.removeAll(list);
        System.out.println();
        System.out.println(traicay);
    }
}
