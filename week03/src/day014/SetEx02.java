package day014;

import java.util.NavigableSet;
import java.util.TreeSet;

public class SetEx02 {
	public static void main(String[] args) {
		/*
		 * 
		 */
		int[] score = {80, 98, 75, 48, 95, 62, 57, 80};
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int tmp : score) {
			set.add(tmp);
		}
		
		System.out.printf("가장 작은 값 : %d\n", set.first());
		System.out.printf("가장 큰 값 : %d\n", set.last());
		
		System.out.println(set.tailSet(80));		// 80보다 큰 객체
		System.out.println(set.headSet(80));		// 80보다 작은 객체
		System.out.println(set.subSet(70, 90));		// 70~90 사이의 값 (이상~미만)
		
		NavigableSet<Integer> desSet = set.descendingSet();		// 내림차순
		System.out.println(desSet);
	}
}
