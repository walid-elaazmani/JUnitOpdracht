package be.intecbrussel;

import java.util.*;
import java.util.stream.Stream;

public class MinNumberInArrayClass {
    private List<Integer> array;

    public int findMinimumNumber(Integer[] array){

        List<Integer> arrayList = Arrays.asList(array);

        arrayList.sort(Integer::compareTo);

        if(arrayList.isEmpty()){
            return 0;
        }
        return arrayList.get(0);
    }
}
