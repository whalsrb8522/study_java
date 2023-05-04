package day013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class Set01 {
	public static void main(String[] args) {
		/*
		 * Set 순서보장X 중복X
		 * HashSet
		 * index가 필요없음
		 */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("홍길동");
		set.add("이순신");
		
		System.out.println(set);
		
		for (String temp : set) {
			System.out.printf("%s ", temp);
		}
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.printf("%s ", string);
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>(set);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		System.out.println(list);
	}
}
