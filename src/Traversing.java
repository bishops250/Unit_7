import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    static Scanner scan= new Scanner(System.in);

    public static ArrayList<String> getStates() {

        ArrayList<String>userStates= new ArrayList<>();
         while(true){
        System.out.println("Enter the name of a state or \"Stop\" to quit: ");
        String userInput= scan.next();
            if(userInput.equals("Stop")) {
                break;
            }
            userStates.add(userInput);
        }
return userStates;

    }
    public static String createList(ArrayList<String> states) {

        ArrayList<String>stateArrayList= states;

        String stringOfStates="";

        for(int i=0;i<stateArrayList.size();i++) {
            if(i==stateArrayList.size()-1) {
                stringOfStates+=stateArrayList.get(i);
            }
            else {
                stringOfStates+=stateArrayList.get(i)+" -> ";
            }
        }
        return stringOfStates;
    }

    public static ArrayList<Integer> largestAndSmallest() throws IOException {

        Scanner presetData= new Scanner(new File("src/numbers.txt"));
        ArrayList<Integer> arrayDataStorage=new ArrayList<>();




        while (presetData.hasNextInt()) {
            arrayDataStorage.add(presetData.nextInt());
        }
        int largestNum=arrayDataStorage.get(0);
        int indexOfSmallestNum=0;
        int smallestNum=arrayDataStorage.get(0);
        int indexOfLargestNum=0;
        for(int i=0; i<arrayDataStorage.size();i++) {


            if(arrayDataStorage.get(i)>smallestNum) {
                smallestNum = arrayDataStorage.get(i);
                indexOfSmallestNum=i;
            }
             if(arrayDataStorage.get(i)<largestNum) {
                largestNum =arrayDataStorage.get(i);
                indexOfLargestNum=i;
            }

        }

        arrayDataStorage.remove(indexOfSmallestNum);
        arrayDataStorage.add(0,largestNum);

        arrayDataStorage.remove(indexOfLargestNum+1);
        arrayDataStorage.add(arrayDataStorage.size(),smallestNum);


        return arrayDataStorage;
    }

}

