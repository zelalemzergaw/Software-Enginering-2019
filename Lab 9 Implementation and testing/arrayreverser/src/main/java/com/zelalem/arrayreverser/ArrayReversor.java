package com.dave.arrayreverser;


import com.dave.arrayreverser.service.ArrayFlattener;
import org.springframework.beans.factory.annotation.Autowired;

public class ArrayReversor
{

    ArrayFlattener arrayFlattener;

    public ArrayReversor(ArrayFlattener arrayFlattener)
    {
        this.arrayFlattener = arrayFlattener;
    }


    public Integer [] reversedandflattened(Integer [][] input)
    {
        if(input == null || input.length == 0) return  null;
        Integer [] flattened = arrayFlattener.flatten(input);  // call to the service
        Integer[] result = new Integer[flattened.length];
        int j = flattened.length;
        for (int i = 0; i < flattened.length; i++) {
            result[j - 1] = flattened[i];
            j = j - 1;
        }
        return result;
    }






}
