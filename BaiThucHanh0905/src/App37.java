import java.util.LinkedList;

public class App37 {
    public static void main(String[] agrs){
        LinkedList<String> list = new LinkedList<>();
        list.add("Trường");
        list.add("là");
        list.add("con");
        list.add("gà");
        showlist(list);
        System.out.println("Ví dụ sử dụng phương thức addAll()");
        System.out.println("===================");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("listA: ");
        showlist(listA);
        System.out.println("\n ví dụ sử dụng phương thức retainAll");
        System.out.println("\t\t\t=======================================");
        LinkedList<String> listB = new LinkedList<>();
        listB.add("Trường");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showlist(listA);
        System.out.println("\n ví dụ sử dụng phương thức removeAll");
        System.out.println("\t\t\t=======================================");
        list.removeAll(listB);
        System.out.println("líst: ");
        showlist(list);
    }
    public static void showlist(LinkedList<String> list){
        for(String obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
