package com.dave.arrayreverser.service.impl;

import com.dave.arrayreverser.service.ArrayFlattener;
import org.springframework.stereotype.Service;


@Service
public class ArrayFlattenerImpl implements ArrayFlattener
{

    @Override
    public Integer[] flatten(Integer[][] input) {
        return new Integer[0];
    }
}
