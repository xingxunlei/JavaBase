package com.xingxunlei.example05.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Remove {

    public static void main(String[] args) {
        String ids = "1,2,3,4,5,6,7,8,9";
        List<String> list = new ArrayList<>(Arrays.asList(ids.split(",")));
        doIt(list);
        System.out.println(list);
    }

    private static void doIt(List<String> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("5".equals(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
