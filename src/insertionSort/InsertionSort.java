package insertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {


    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        int len = pairs.size();
        List<List<Pair>> result = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            int posBefore = i - 1;
            while (posBefore >= 0 && pairs.get(posBefore).key > pairs.get(posBefore + 1).key){
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

