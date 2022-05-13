import java.util.ArrayList;
public class App16 {
    public static void main(String [] agrs) {
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("Hưng");
        arrListString.add("óc");
        arrListString.add("chó");
        System.out.println("Các phần tử có trong arrListString là: ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + " ");
        }
    }
}
