package human;

public class online_Student extends Student{
    private String thietbi;

    public online_Student(String name,int age,String masv,String lop,String thietbi){
        super(name,age,masv,lop);
        this.thietbi = thietbi;
    }

    public void setthietbi(String thietbi){
        this.thietbi = thietbi;
    }
    public String getthietbi(){
        return thietbi;
    }
}
