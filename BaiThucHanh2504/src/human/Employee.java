package human;

public class Employee extends Person{
    private String manv;
    private int sal;

    public Employee (String name,int age,String manv,int sal){
        super(name,age);
        this.manv = manv;
        this.sal = sal;
    }

    public void setmanv(String manv) {
        this.manv = manv;
    }
    public String getmanv(){
        return manv;
    }
    public void setsal(int sal){
        this.sal = sal;
    }
    public int getsal(){
        return sal;
    }
}
