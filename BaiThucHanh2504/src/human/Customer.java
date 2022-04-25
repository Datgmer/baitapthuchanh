package human;

public class Customer extends Person{
    private String dichvu;
    private int sogiosudung;

    public Customer(String name,int age,String dichvu,int sogiosudung){
        super(name,age);
        this.dichvu = dichvu;
        this.sogiosudung = sogiosudung;
    }

    public void setdichvu(String dichvu){
        this.dichvu = dichvu;
    }
    public String getdichvu(){
        return dichvu;
    }
    public void setsogiosudung(int sogiosudung){
        this.sogiosudung = sogiosudung;
    }
    public int getsogiosudung(){
        return sogiosudung;
    }
}
