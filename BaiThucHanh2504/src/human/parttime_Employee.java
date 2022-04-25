package human;

public class parttime_Employee extends Employee{
    private int tonggiolam;

    public parttime_Employee(String name,int age,String manv,int sal,int tonggiolam){
        super(name,age,manv,sal);
        this.tonggiolam = tonggiolam;
    }

    public void settonggiolam(int tonggiolam){
        this.tonggiolam = tonggiolam;
    }
    public int gettonggiolam(){
        return tonggiolam;
    }
}
