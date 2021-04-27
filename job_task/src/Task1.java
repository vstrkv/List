import java.sql.SQLOutput;
import java.util.*;

public class Task1 {

    static int number_of_repetitions = 5000; // количество добавлений
    static int size_list = 10_000_000;      //размер листов



    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        addLinkedListCreate(linkedList);
        addArrayListCreate(arrayList);   // тут делаем список со size_list значений

        System.out.println("Start");
        System.out.println("LL "+ addLinkedList(linkedList, 0));
        System.out.println("AL "+ addArrayList(arrayList, 0));

        System.out.println("\nMiddle");
        System.out.println("LL "+ addLinkedList(linkedList, linkedList.size()/2 ));
        System.out.println("AL "+ addArrayList(arrayList, arrayList.size()/2));

        System.out.println("\nend");
        System.out.println("LL "+ addLinkedList(linkedList, linkedList.size()));
        System.out.println("AL "+ addArrayList(arrayList, arrayList.size()));

    }

    public static void addArrayListCreate(ArrayList arrayList) {
        for (int i = 0; i < size_list; i++) {
            arrayList.add(i);
            System.out.println(i);
        }
    }

    public static long addArrayList(ArrayList arrayList, int index) {
        long startTime = System.nanoTime();
        for (int i = 0; i < number_of_repetitions; i++) {
            arrayList.add(index,i);
        }
        return System.nanoTime() - startTime;

    }
    public static void addLinkedListCreate(LinkedList linkedList) {

        for (int i = 0; i < size_list; i++) {
            linkedList.add(i);
            System.out.println(i);
        }

    }

    public static long addLinkedList(LinkedList linkedList, int index) {
        long startTime = System.nanoTime();
        for (int i = 0; i < number_of_repetitions; i++) {
            linkedList.add(index,i);
        }
        return System.nanoTime() - startTime;

    }

}
