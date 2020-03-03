/*
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public static ArrayList<Integer> getUnsorted() throws IOException {
        Scanner unsortedData = new Scanner(new File());
        Scanner presetSortedData = new Scanner(new File("sortedData.txt"));
        ArrayList<Integer> unsortedDataList = new ArrayList<>();
        ArrayList<Integer> presetSortedDataList = new ArrayList<>();

        while (unsortedData.hasNextInt()) {
            unsortedDataList.add(unsortedData.nextInt());
        }

        while (presetSortedData.hasNextInt()) {
            presetSortedDataList.add(presetSortedData.nextInt());

        }
        for(int i = 0; i<presetSortedDataList.size();i++){
           int testingNum= presetSortedDataList.get(i);
            for(int i2=i+1; i<presetSortedDataList.size();i2++) {
                if(testingNum==presetSortedDataList.get(i2)) {
                    presetSortedDataList.remove(i2);
                    i2--;
                    i--;
                }
            }
        }

    }



    public static boolean isSorted(ArrayList<Integer> arr) {
        return true;
    }

}
*/
