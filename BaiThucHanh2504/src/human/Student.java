package human;

public class Student extends Person {
    private String masv;
    private String lop;

    public Student (String name,int age,String masv,String lop){
        super(name,age);
        this.masv = masv;
        this.lop = lop;
    }

    public String getmasv(){
        return masv;
    }
    public void setmasv(String lop){
        this.lop = lop;
    }
    public String getlop(){
        return lop;
    }
}
