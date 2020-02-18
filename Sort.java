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

    public List<T> insertionSort(List<T> list) {
        // iterate over entire list
        for(int i = 0; i < list.size(); i++) {
            // if list is sorted in opposite order, this comparison avoids 2nd loop
            if(list.get(0).compareTo(list.get(i)) > 0) {
                list.add(0, list.remove(i));
                continue;
            }
            // iterate over already sorted list
            for(int j = 0; j < i; j++) {
                // compare current item j with item i
                if(list.get(j).compareTo(list.get(i)) > 0) {
                    // remove current item and place it where it belongs
                    list.add(j, list.remove(i));
                    break;
                }
            }
        }
        return list;
    }



}
