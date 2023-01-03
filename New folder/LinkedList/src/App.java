import java.util.*;

public class App {
    public static void main(String[] args) {
        LinkedList <String> java = new LinkedList<String>();
        java.addFirst("java1");
        System.out.println("kuyruk" + java);
        java.addFirst("java2");
        System.out.println("kuyruk" + java);
        java.addFirst("java3");
        System.out.println("kuyruk" + java);

        while (!java.isEmpty()) {
            System.out.println("Silinen = "+java.removeLast());
            System.out.println("kuyruk" + java);
        }
    }
}
//20.12.2022 ders