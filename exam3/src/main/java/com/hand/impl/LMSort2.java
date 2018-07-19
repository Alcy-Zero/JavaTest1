package com.hand.impl;

import com.hand.LMSort;

import java.util.*;

public class LMSort2 implements LMSort {
    @Override
    public List createList(){
        List list = new ArrayList();
        for(int i=0;i<100;i++){
            list.add((int)Math.random()*100);
        }
        return list;
    }

    @Override
    public Map createMap(){
        Map map = new HashMap();
        return map;
    }
}
