import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.removeAt(0);
        array.removeAt(3);
        array.print();

        System.out.println("indexOf 10: " + array.indexOf(10));
        System.out.println("indexOf 40: " + array.indexOf(40));
        System.out.println("indexOf 100: " + array.indexOf(100));
    }
}