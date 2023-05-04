package day013;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {
	public static void main(String[] args) {
		/*
		 * 하루 일과를 저장하는 리스트 생성
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("일어나기");
		list.add("씻기");
		list.add("옷입기");
		list.add("지하철타기");
		list.add("출석찍기");
		list.add("공부하기");
		list.add("점심먹기");
		list.add("공부하기");
		list.add("퇴근하기");
		list.add("지하철타기");
		list.add("저녁먹기");
		list.add("씻기");
		list.add("놀기");
		list.add("잠자기");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		for(String tmp : list) {
			System.out.println(tmp );
		}
		
		Collections.sort(list);
		System.out.println(list);

		list.sort(new Test());
		System.out.println(list);
	}
}

class Test implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		//comparTo 메서드 활용
		return o2.compareTo(o1);
	}
}