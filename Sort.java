/*
Sorting methods using Generics.
 */

import java.util.List;

public class Sort<T extends Comparable<T>> {

    public List<T> bubbleSort(List<T> list) {
        for(int i = 0; i < list.size(); i++) {  // loop through the entire list
            int count = 0;
            while (count != list.size()-1-i) {
                if(list.get(count).compareTo(list.get(count+1)) > 0) { // compare adjacent items
                    T temp = list.get(count);
                    list.remove(count);
                    list.add(count+1, temp);
                }
                count++;
            }
        }
        return list;
    }



}
