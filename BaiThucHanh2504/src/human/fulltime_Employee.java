package human;

public class fulltime_Employee extends Employee{
    private int thuong;

    public fulltime_Employee(String name,int age,String manv,int sal,int thuong){
        super(name,age,manv,sal);
        this.thuong = thuong;
    }

    public void setthuong(int thuong){
        this.thuong = thuong;
    }
    public int getthuong(){
        return thuong;
    }
}
