import java.util.ArrayList;
public class App20 {
    public static void main(String[] agrs){
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("Trường");
        arrListString.add("chơi");
        arrListString.add("game");
        arrListString.add("ngu");
        arrListString.add("vãi");
        arrListString.add("luyện");
        for(String Number : arrListString){
            System.out.print(Number + " ");
        }
        arrListString.remove("luyện");
        arrListString.set(3,"hay");
        System.out.println();
        for(String number : arrListString){
            System.out.print(number + " ");
        }
    }
}
