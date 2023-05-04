package day018;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		// 문자열 리스트 생성 후, 스트림 생성
		// 스트림을 정렬하여 생성
		
		ArrayList<String> strList = new ArrayList<String>();
		strList.add("Q");
		strList.add("A123");
		strList.add("Z");
		strList.add("W");
		strList.add("S");
		strList.add("X");
		strList.add("E");
		strList.add("D");
		strList.add("C123");
		strList.add("R");
		strList.add("F");
		strList.add("V");
		strList.add("T");
		strList.add("G");
		strList.add("B123");
		strList.add("Y");
		strList.add("H");
		strList.add("N");
		strList.add("U");
		strList.add("J");
		strList.add("M");
		strList.add("I");
		strList.add("K");
		strList.add("O");
		strList.add("L");
		strList.add("P");
		
		Stream<String> strStream = strList.stream();
		strStream.sorted().forEach(System.out::print);
		
		System.out.println();
		
		strList.stream().sorted().forEach(System.out::print);

		System.out.println();
		
		strList.stream().filter(a -> a.length() >= 4).forEach(System.out::print);
		
		strList.stream().map(a -> a.length()).forEach(System.out::println);
	}
}
