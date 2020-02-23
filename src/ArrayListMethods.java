import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMethods {
   private static Scanner scan= new Scanner(System.in);

    public static ArrayList<Integer> numberList() {

        ArrayList<Integer> arrayListVal= new ArrayList<Integer>();
        arrayListVal.add(0);
        arrayListVal.add(-5);
        arrayListVal.add(7);
        arrayListVal.add(12);
        arrayListVal.add(-1);
        System.out.println(arrayListVal.toString());
        arrayListVal.add(10,2);
        arrayListVal.set(1,9);
        System.out.println(arrayListVal.toString());
        arrayListVal.remove(3);
        System.out.println(arrayListVal.toString());
        return arrayListVal;

    }
    public static ArrayList<Double> firstAndLast() {

        ArrayList<Double> arrayListVal= new ArrayList<Double>();

        while ( != 0) {
            System.out.println("Please enter one decimal number(Enter the num 0 to quit): ");
            double users_number = scan.nextDouble();
            arrayListVal.add(users_number);

        }
    }

    public static ArrayList<Double> getNumbers() {

    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {

    }


}
