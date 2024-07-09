import java.util.ArrayList;
import java.util.Arrays;

public class WelcomeClass {
    public static void main(String[] args) {
        System.out.println("\nHello :) \n");

        int[] array = {1, 2, 3, 7, 0};

        printArray(array);
        swap(1, 2);
        printArray(array);

        swap(array, 1, 2);
        printArray(array);

        Arrays.sort(array);
        printArray(array);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(1, 2);
        System.out.println(list);

    }

    private static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[b];
        array[b] = array[a];
        array[a] = temp;

    }

    private static void printArray(int[] array) {
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//      System.out.println("-------------------");

//        System.out.println(Arrays.toString(array));
    }
}
