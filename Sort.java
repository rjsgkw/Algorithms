/*
Sorting methods using Generics.
 */

import java.util.List;

public class Sort<T extends Comparable<T>> {

    public List<T> bubbleSort(List<T> list) {
        // loop through the entire list
        for(int i = 0; i < list.size(); i++) {
            int count = 0;
            // loop through remaining list
            while (count != list.size()-1-i) {
                // compare adjacent items
                if(list.get(count).compareTo(list.get(count+1)) > 0) {
                    T temp = list.get(count);
                    list.remove(count);
                    list.add(count+1, temp);
                }
                count++;
            }
        }
        return list;
    }

    public List<T> selectionSort(List<T> list) {
        // loop through the entire list
        for(int i = 0; i < list.size(); i++) {
            T min = list.get(i);
            int minIndex = i;
            // loop through remaining list
            for(int j = i; j < list.size()-1; j++) {
                // find the minimum
                if(min.compareTo(list.get(j+1)) > 0) {
                    //set new minimum
                    min = list.get(j+1);
                    minIndex = j+1;
                }
            }
            if(min != list.get(i)) {
                // insert minimum at the beginning of remaining list
                list.remove(minIndex);
                list.add(i, min);
            }
        }
        return list;
    }



}
