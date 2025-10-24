package insertionSort;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortRunner {

    public static void main(String[] args) {

        List<Pair> pairs = new ArrayList<>();
        pairs.add(new Pair(5, "apple"));
        pairs.add(new Pair(2, "banana"));
        pairs.add(new Pair(9, "cherry"));

        InsertionSort insertionSort = new InsertionSort();
        List<List<Pair>> resultList = insertionSort.insertionSort(pairs);
        for (List<Pair> result : resultList) {
            for (Pair i : result){
                System.out.print(i.key + " ");
                System.out.print(i.value + " ");
            }
            System.out.println();
        }


//
    }
}