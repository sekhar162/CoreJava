package com.demo.staticblock;

import java.util.ArrayList;
import java.util.List;

public class MyStaticBlock {
	 
    private static List<String> list;
     
    static{
        list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
    }
     
    public void testList(){
        System.out.println(list);
    }
     
    public static void main(String a[]){
        MyStaticBlock msb = new MyStaticBlock();
        msb.testList();
    }
}
