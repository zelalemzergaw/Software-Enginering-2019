package com.dave.arrayreverser;

import com.dave.arrayreverser.service.ArrayFlattener;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayReversorTest
{

    ArrayFlattener flattener = mock(ArrayFlattener.class);

    ArrayReversor arrayReversor = new ArrayReversor(flattener);

    @Test
    public void reversedandflattened()
    {
        Integer [][] input = {{1,3}, {0}, {4,5,9}};
        when(flattener.flatten(any())).thenReturn(new Integer[]{1,3,0,4,5,9});
        Integer [] expected = new Integer[]{9,5,4,0,3,1};
        assertEquals(expected,arrayReversor.reversedandflattened(input));
    }

    @Test
    public void nulltest()
    {
        when(flattener.flatten(any())).thenReturn(new Integer[]{1,3,0,4,5,9});
        Integer [][] input = {{1,3}, {0}};
        assertNotNull(arrayReversor.reversedandflattened(input));
    }


}