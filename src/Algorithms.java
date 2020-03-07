import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Algorithms {
    public static ArrayList<Integer> fileDuplicates() throws IOException {
        Scanner file1= new Scanner(new File("file1.txt"));
        Scanner file2= new Scanner(new File("file2.txt"));
        ArrayList<Integer> file1List= new ArrayList();
        ArrayList<Integer> file2List= new ArrayList();
        ArrayList<Integer> duplicateList= new ArrayList();


        while (file1.hasNextInt()) {
        file1List.add(file1.nextInt());
        }
        while (file2.hasNextInt()) {
            file2List.add(file2.nextInt());
        }

        for(int i=0; i<file1List.size(); i++) {
            int currentNum = file1List.get(i);

            for(int i2=0;i2<file2List.size();i2++) {
                int testingNum=file2List.get(i2);
                if(currentNum==testingNum) {
                    duplicateList.add(currentNum);
                }
            }
        }

        return duplicateList;
    }

    public static ArrayList<String> fileDuplicatesTwo() throws IOException {

        Scanner presetData= new Scanner(new File("names.txt"));
        ArrayList<String> namesList = new ArrayList<>();

        while (presetData.hasNext()) {
            namesList.add(presetData.next());
        }
        System.out.println(namesList);

        for(int i=0; i<namesList.size();i++) {
            String currentString= namesList.get(i);
            for(int i2=i+1; i2<namesList.size();i2++) {
                String testingString= namesList.get(i2);
                if(currentString.equals(testingString)) {
                    namesList.remove(i2);
                    i2--;

                }
        }
    }

        return namesList;
}


    public static ArrayList<Integer> orderedList() throws IOException{
        Scanner file1= new Scanner(new File("file1.txt"));
        ArrayList<Integer> createdOrderedList= new ArrayList();
        

        while (file1.hasNextInt()) {



                int currentNum = file1.nextInt();

                if (createdOrderedList.size() == 0) {

                    createdOrderedList.add(currentNum);

                }
                else {
                    for (int i = 0; i < createdOrderedList.size(); i++) {

                        int testingNum=createdOrderedList.get(i);
                        if (testingNum > currentNum) {
                            createdOrderedList.add(i, currentNum);
                            break;
                        }
                        else if (testingNum<currentNum) {
                            createdOrderedList.add(i,currentNum);
                            break;
                        }
                    }

                    }
        }
        return createdOrderedList;

        }



}

