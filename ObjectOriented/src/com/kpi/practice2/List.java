package com.kpi.practice2;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
public class List {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list1 = new ArrayList();
		list1.add("x");
		list1.add("x");
		list1.add("x");
		list1.add("x");
		list1.add("z");
		list1.add("a");
		list1.add("a");
		list1.add("a");
		list1.add("z");
		System.out.println(list1);
		Set<String> set= new HashSet<String>();
        Set set1 =new HashSet();
        set.add("a");
        set.add("a");
        set.add("a");
        set1.add(1);
        System.out.println(set);
        System.out.println(set1);
        Map<String, Integer> hm= new HashMap<String, Integer>();
        hm.put("a",101);
        hm.put("b",102);
        hm.put("c",103);
        hm.put("d",104);
        hm.put("d",104);
        hm.get("a");
        System.out.println(hm);
        System.out.println(hm.get("a"));
	}
}
