package day014;

import java.util.Calendar;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		 /*
		  * 날짜시간 클래스
		  * Date
		  * Calendar : 추상 클래스 (new 연산자를 통한 객체 구현 불가능)
		  * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴
		  * 
		  * month : (0월 ~ 11월) + 1
		  * week : 1=일, 2=일 ...
		  * ap_pm : am=0, pm=1
		  */
		
		Date d = new Date();
//		d.getDate();		// depercated : 비권장
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		
		System.out.printf("%04d-%02d-%02d(%s)\n", year, month, day, checkWeek(week));
		System.out.printf("%s %02d:%02d", checkAmPm(ampm), hour, minute);
	}
	
	public static String checkWeek(int num) {
		switch (num) {
		case 1:
			return "일";
		case 2:
			return "월";
		case 3:
			return "화";
		case 4:
			return "수";
		case 5:
			return "목";
		case 6:
			return "금";
		case 7:
			return "토";
		default :
			return null;
		}
	}
	
	public static String checkAmPm(int num) {
		if (num == 0) {
			return "오전";
		} else {
			return "오후";
		}
	}
}
