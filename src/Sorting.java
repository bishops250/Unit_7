/*
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {

        Scanner fileToBeCompared = new Scanner(new File(""));

        ArrayList<Integer> fileToBeComparedList = new ArrayList<>();


        while (fileToBeCompared.hasNextInt()) {

        }
    }

    public static boolean isSorted(ArrayList<Integer> arr) throws IOException {

        ArrayList<Integer> sortedFIleCompareList = new ArrayList<>();
        Scanner sortedFileCompare = new Scanner(new File(""));

        while (sortedFileCompare.hasNextInt()) {
            sortedFIleCompareList.add(sortedFileCompare.nextInt());
        }

        for(int i=0; i<arr.size();i++) {
            int currentNum= arr.get(i) ;
            int testingNum= sortedFIleCompareList.get(i);
            if(currentNum!=testingNum) {
                return false;
            }

        }
        return true;
    }
}
*/
