package day014;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {
	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr);
		System.out.println(curr.substring(0, curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T") + 1, curr.indexOf(".")));
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dft.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30);
		System.out.println(sDate);
	}
}
