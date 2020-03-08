import java.util.ArrayList;

/**
 *                                                      SelfAdjusting
 * @author Aron D. Bishop
 * @since March 7, 2020
 * @version 1.0
 *
 * The Java class SelfAdjusting is an algorithm
 *
 */

public class SelfAdjusting {

    private ArrayList<Integer> queryArrayList;

    public SelfAdjusting(ArrayList<Integer>queryArrayList) {
        this.queryArrayList= queryArrayList;
    }

    public ArrayList<Integer> getQueryArrayList() {
        return queryArrayList;
    }
    public static void adjustList(ArrayList<Integer> searchArrayList) {

        ArrayList<Integer> arrayListToBeSearched_Modified= new ArrayList<>();
        arrayListToBeSearched_Modified.add(2);
        arrayListToBeSearched_Modified.add(4);
        arrayListToBeSearched_Modified.add(6);
        arrayListToBeSearched_Modified.add(8);
        arrayListToBeSearched_Modified.add(10);
        arrayListToBeSearched_Modified.add(12);
        arrayListToBeSearched_Modified.add(14);
        arrayListToBeSearched_Modified.add(16);
        arrayListToBeSearched_Modified.add(18);
        arrayListToBeSearched_Modified.add(20);
        System.out.println(arrayListToBeSearched_Modified);

        for(int i= 0; i<searchArrayList.size();i++) {
            int currentNum= searchArrayList.get(i);
            int indexOfCurrentNum= i;
            for(int i2=0; i2<arrayListToBeSearched_Modified.size();i2++) {
                int indexOfSearchNum=i2;
                int testingNum=arrayListToBeSearched_Modified.get(i2);

                if(currentNum==testingNum) {
                    if(indexOfCurrentNum==indexOfSearchNum) {
                        break;
                    }
                    else if(indexOfCurrentNum!=indexOfSearchNum) {
                        arrayListToBeSearched_Modified.add(0,testingNum);
                        arrayListToBeSearched_Modified.remove(indexOfSearchNum+1);
                        break;
                    }
                }

            }
        }

    }
}
