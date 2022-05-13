import java.util.ArrayList;
public class App17 {
    public static void main(String [] agrs){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(0);
        arrListInteger.add(7);
        arrListInteger.add(8);
        arrListInteger.add(10);
        System.out.println("Các phần tử có trong arrListInteger là: ");
        for(int number : arrListInteger){
            System.out.print(number + " ");
        }
    }
}
