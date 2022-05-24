package slide114;

import java.util.Scanner;

public class SinhVien {
    public String hoten;
    public int masv;
    public String lop;
    public SinhVien(){}
    public SinhVien(String ht,int masv,String lop){
        this.hoten = ht;
        this.masv = masv;
        this.lop = lop;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String ht) {
        this.hoten = ht;
    }
    public String toString() {
        return "Ho ten: "+hoten+"\t"+"Ma sinh vien: "+masv+"\t"+"Lop: "+lop;
    }
    public int getMasv() {
        return masv;
    }
    public void setMasv(int masv) {
        this.masv = masv;
    }
    public String getLop() {
        return lop;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten =sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        masv =sc.nextInt();
        System.out.println("Nhap lop: ");
        lop = sc.nextLine();
    }
}
