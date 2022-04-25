package Car;

public class TaxiCar implements Car{
    public void move(){
        System.out.println("50km/h - 70km/h");
    }
    public void stop(){
        System.out.println("traffic light");
    }
    public void turnRight(){
        System.out.println("Right to Thanh Xuân");
    }
    public void turnLeft(){
        System.out.println("Left to Đống Đa");
    }
    public void Reverse(){
        System.out.println("see cops, Run!!!");
    }
}
