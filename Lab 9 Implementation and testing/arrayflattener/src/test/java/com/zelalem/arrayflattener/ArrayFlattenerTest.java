package com.dave.arrayflattener;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayFlattenerTest
{

    ArrayFlattener arrayFlattener = new ArrayFlattener();

    @Test
    public void flattenArray()
    {
        Integer [][] input = {{1,3}, {0}, {4,5,9}};
        Integer [] expected = {1,3,0,4,5,9};
        assertEquals(expected,arrayFlattener.flattenArray(input));
    }

    @Test
    public void nulltest()
    {
        Integer [][] input = {};
        assertNull(arrayFlattener.flattenArray(input));
    }

}