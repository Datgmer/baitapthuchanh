import java.util.Scanner;
import java.util.Date;
import static java.lang.System.out;
public class App2103 {
    public static void main(String[] agrs){
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapchieudai();
        hcn.nhapchieurong();
        out.println("chu vi: "+ hcn.chuvi());
        out.println("diện tích: "+ hcn.dientich());
        person ps = new person();
        ps.nhapThongTin();
        ps.hienThi();
        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.hienThi();
        dieukien dk=new dieukien();
        dk.nhappt();
        dk.kiemtra();
    }
}
class HinhChuNhat{
    float dai,rong,cv,dt;
    void nhapchieudai(){
        out.print("nhập chiều dài: ");
        Scanner p = new Scanner(System.in);
        dai = p.nextFloat();
    }
    void nhapchieurong(){
        out.print("nhập chiều rộng: ");
        Scanner p = new Scanner(System.in);
        rong = p.nextFloat();
    }
    float chuvi(){
        cv = (dai + rong)*2;
        return cv;
    }
    float dientich() {
        dt = dai * rong;
        return dt;
    }
}
class person {
    String PersonID;
    String PersonName;
    boolean Gender;
    String Address;

    public String getPersonID() {
        return PersonID;
    }

    public void setPersonID(String PersonName) {
        this.PersonID = PersonID;
    }

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public void hienThi() {
        System.out.println("\tId: " + PersonID);
        System.out.println("\tHo ten: " + PersonName);
        System.out.println("\tGioi tinh: " + Gender);
        System.out.println("\tDia chi: " + Address);
    }
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap id: ");
        PersonID = sc.nextLine();
        System.out.print("\tNhap ho ten: ");
        sc.nextLine();
        PersonName = sc.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        Gender = sc.nextBoolean();
        System.out.print("\tNhap dia chi: ");
        Address = sc.nextLine();
    }
}
class SinhVien{
    String MaSV;
    String HoTen;
    Boolean GioiTinh;
    String DiaChi;
    Date NgaySinh;

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public boolean getGioiTinhr() {
        return GioiTinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    public void hienThi() {
        System.out.println("\tId: " + MaSV);
        System.out.println("\tHo ten: " + HoTen);
        System.out.println("\tGioi tinh: " + GioiTinh);
        System.out.println("\tDia chi: " + DiaChi);
        System.out.println("\tngay sinh: " + NgaySinh);

    }
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\tNhap id: ");
        MaSV = sc.nextLine();
        System.out.print("\tNhap ho ten: ");
        sc.nextLine();
        HoTen= sc.nextLine();
        System.out.print("\tNhap gioi tinh: ");
        GioiTinh = sc.nextBoolean();
        System.out.print("\tNhap dia chi: ");
        DiaChi = sc.nextLine();
        System.out.print("\tNhap ngay sinh: ");

    }
}
class phuongtrinh
{
    public float a,b,c;
    double x1,x2;
    double delta;
    Scanner input=new Scanner(System.in);
    public void nhap()
    {
        System.out.print("nhap a: ");
        this.a=input.nextFloat();
        System.out.print("nhap b: ");
        this.b=input.nextFloat();
        System.out.print("nhap c: ");
        this.c=input.nextFloat();
    }
    public double tinhdelta()
    {
        delta=((Math.pow(b, 2))-4*a*c);
        return delta;
    }
    public double nghiemduynhat()
    {
        x1=-c/b;
        return x1;
    }
    public double nghiemkep()
    {
        x1=-b/(2*a);
        return x1;
    }
    public void nghiemphanbiet()
    {
        x1=((-b+Math.sqrt(delta))/(2*a));
        x2=((-b-Math.sqrt(delta))/(2*a));
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
    }
}

class dieukien
{
    phuongtrinh pt=new phuongtrinh();
    public void nhappt()
    {
        pt.nhap();
    }
    public void kiemtra()
    {
        if(pt.a==0)
        {
            if(pt.b==0)
            {
                System.out.print("phuong trinh vo so nghiem");
            }
            else
            {

                System.out.print("phuong trinh co nghiem duy nhat: "+pt.nghiemduynhat());
            }
        }
        else
        {
            if (pt.tinhdelta()<0)
            {
                System.out.print("phuong trinh vo nghiem");
            }

            else
            {
                if(pt.tinhdelta()==0)
                {
                    System.out.print("phuong trinhg co nghiem kep: "+pt.nghiemkep());
                }
                else
                {
                    System.out.println("phuong trinh co 2 nghiem phan biet: ");
                    pt.nghiemphanbiet();
                }
            }
        }
    }
}
