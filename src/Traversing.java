import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Traversing {
    static Scanner scan= new Scanner(System.in);
    public static ArrayList<String> getStates() {

        ArrayList<String>userStates= new ArrayList<>();

        System.out.println("Enter the name of a state or \"Stop\" to quit: ");
        String userInput= scan.next();
        while (!userInput.equals("Stop")) {
            System.out.println("Next state or \"Stop\": ");
            userInput= scan.next();
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

        for(int i=0;i<stateArrayList.size()-1;i++) {
            stringOfStates+=stateArrayList.get(i)+" -> ";
        }
        return stringOfStates;
    }

    public static ArrayList<Integer> largestAndSmallest() throws IOException {
        int largestNum=Integer.MIN_VALUE;
        int smallestNum=Integer.MAX_VALUE;
        ArrayList<Integer> arrayDataStorage=new ArrayList<>();
        Scanner presetData= new Scanner(new File("src/data.txt"));

        while (presetData.hasNext()) {
            arrayDataStorage.add(presetData.nextInt());
        }
        for(int i:arrayDataStorage) {
            if(i>smallestNum) {
                smallestNum=i;
            }
            else if(i<largestNum) {
                largestNum=i;

            }

        }
        return arrayDataStorage;
    }


}
