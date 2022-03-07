import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Appbai10 {
    public static void main(String[] args) {
        var sc=new Scanner(in);
        String str;
        int lanXuatHien=0;
        do {
            out.println("Nhập chuỗi: ");
            str = sc.nextLine();

        }while(str.length()>80);
        out.println("Nhập ký tự cần đếm: ");
        char kyTu=sc.nextLine().charAt(0);
        for(int i =0;i<str.length();i++) {
            if (kyTu == str.charAt(i))
                lanXuatHien++;
        }
        out.println("Số lần xuất hiện kí tự "+ kyTu +" trong chuỗi là: "+lanXuatHien);
    }
}