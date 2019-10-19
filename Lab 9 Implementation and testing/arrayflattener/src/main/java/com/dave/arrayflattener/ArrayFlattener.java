package com.dave.arrayflattener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayFlattener
{


    /**
     * @author Dawit Anbessie
     * @param arrays the 2D array
     * @return flattened array
     */

    public Integer [] flattenArray(Integer [][] arrays)
    {
        if(arrays == null || arrays.length == 0) return  null;
        List<Integer> list = new ArrayList<>();
        for (Integer[] array : arrays) {
            Arrays.stream(array)
                    .forEach(list::add);
        }
        return list.stream().toArray(Integer[] ::new);
    }






}
