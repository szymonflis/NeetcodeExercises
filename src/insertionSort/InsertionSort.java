package insertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        int len = pairs.size();
        List<List<Pair>> result = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            //second pointer creation.
            int posBefore = i - 1;
            //second pointer loops through each index in the array to compare if greater than the first pointer or not
            //the looping goes right to left to avoid null pointer
            while (posBefore >= 0 && pairs.get(posBefore).key > pairs.get(posBefore + 1).key){
                //Create temp pair to swap the values
                Pair temporaryPair = pairs.get(posBefore);
                pairs.set(posBefore, pairs.get(posBefore + 1));
                pairs.set(posBefore + 1,temporaryPair);
                posBefore --;

            }
            List<Pair> cloneList = new ArrayList<>(pairs);
            result.add(cloneList);
        }
        return result;
    }
    }

