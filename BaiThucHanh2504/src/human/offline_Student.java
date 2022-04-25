package human;

public class offline_Student extends Student {
    private String phuongtien;

    public offline_Student(String name,int age,String masv,String lop,String phuongtien){
        super(name,age,masv,lop);
        this.phuongtien = phuongtien;
    }

    public void setphuongtien(String phuongtien){
        this.phuongtien = phuongtien;
    }
    public String getphuongtien(){
        return phuongtien;
    }
}
