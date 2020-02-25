import java.util.Scanner;
import java.util.ArrayList;

// Note The Tests do Not Work Example cGetNumbers the website said it should be listed numerical orders.

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
        arrayListVal.add(2,10);
        arrayListVal.set(1,9);
        System.out.println(arrayListVal.toString());
        arrayListVal.remove(4);
        System.out.println(arrayListVal.toString());
        return arrayListVal;

    }


    public static ArrayList<Double> firstAndLast() {

        ArrayList<Double> arrayListVal= new ArrayList<>();
        ArrayList<Double> arrayListNewArray= new ArrayList<>();

        double users_number=1;

        while (true) {

            System.out.println("Please enter one decimal number(Enter the num 0 to quit): ");
            users_number = scan.nextDouble();
            if(users_number==0.0){
                break;
            }
            arrayListVal.add(users_number);

        }

        arrayListNewArray.add((double) arrayListVal.size());
        arrayListNewArray.add(arrayListVal.get(0));
        arrayListNewArray.add(arrayListVal.get(arrayListVal.size()-1));

        return arrayListNewArray;
    }

    public static ArrayList<Double> getNumbers() {
        ArrayList<Double> arrayListVal= new ArrayList<Double>();
        for(int i=0; i<3;i++) {
            System.out.println("Please enter one decimal number(Enter the num 0 to quit): ");
            double users_number = scan.nextDouble();
            arrayListVal.add(users_number);
        }
        return arrangeList(arrayListVal);

    }

    public static ArrayList<Double> arrangeList(ArrayList<Double> numbers) {
        ArrayList<Double> arrangedArrayList= numbers;
        double temp;

        for(int i=0; i<arrangedArrayList.size()-1;++i) {
            temp=arrangedArrayList.get(i);
            if(arrangedArrayList.get(i)<arrangedArrayList.get(i+1)) {
                arrangedArrayList.set(i,arrangedArrayList.get(i+1));
                arrangedArrayList.set(i+1,temp);
            }

        }
        return arrangedArrayList;
    }


}
