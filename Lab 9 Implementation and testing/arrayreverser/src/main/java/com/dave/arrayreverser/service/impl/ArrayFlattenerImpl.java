package com.dave.arrayreverser.service.impl;

import com.dave.arrayreverser.service.ArrayFlattener;
import org.springframework.stereotype.Service;


@Service
public class ArrayFlattenerImpl implements ArrayFlattener
{

    /**
     * @author Dawit Anbessie
     * @param input
     * @return
     *
     *      this method is going to be mocked so no definition of the method is needed.
     */

    @Override
    public Integer[] flatten(Integer[][] input) {
        return new Integer[0];
    }
}
