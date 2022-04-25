package human;

public class VIP_Customer extends Person{
    private String dacquyen;
    private String dichvu;

    public VIP_Customer(String name,int age, String dichvu,String dacquyen){
        super(name,age);
        this.dichvu = dichvu;
        this.dacquyen = dacquyen;
    }

    public void setdichvu(String dichvu){
        this.dichvu = dichvu;
    }
    public String getdichvu(){
        return dichvu;
    }
    public void setdacquyen(String dacquyen){
        this.dacquyen = dacquyen;
    }
    public String getdacquyen(){
        return dacquyen;
    }
}
