import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {

        Scanner fileToBeCompared = new Scanner(new File("sortedData.txt"));

        ArrayList<Integer> fileToBeComparedList = new ArrayList<>();


        while (fileToBeCompared.hasNextInt()) {

            fileToBeComparedList.add(fileToBeCompared.nextInt());
        }
        return fileToBeComparedList;
    }

    public static boolean isSorted(ArrayList<Integer> arr) {



        for(int i=0; i<arr.size()-1;i++) {
            int currentNum= arr.get(i) ;
            int testingNum= arr.get(i+1);
            if(currentNum>testingNum) {
                return false;
            }

        }
        return true;
    }
}
