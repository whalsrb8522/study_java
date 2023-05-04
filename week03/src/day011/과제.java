package day011;

import java.util.Iterator;
import java.util.Scanner;

public class 과제 {
	public static void main(String[] args) {
		/*
		 * 5개의 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일중에 이미지 파일(jpg, png, gif, jpeg)를 검색, 출력하는 코드
		 * String[] fileName = {"java.txt", "String.jpg", "method.png", "String.pdf", "java.pdf"};
		 */
		
		Scanner sc = new Scanner(System.in);

		String[] imgExtension = {"jpg", "png", "gif", "jpeg"};		// 이미지 확장자 배열

		String[] fileName = new String[5];		// 파일이름 배열
		
		for (int i = 0; i < fileName.length; i++) {		// 파일이름 배열에 입력 
			System.out.printf("입력 : ");
			fileName[i] = sc.next();
		}
		
		System.out.printf("== 이미지 파일 검색==\n");
		for (String tmp : fileName) {
			String search = tmp.substring(tmp.indexOf(".") + 1);
			
			if (isContain(imgExtension, search)) {
				System.out.printf("%s\n",tmp);
			}
		}
		
		sc.close();
	}
	
	public static boolean isContain(String arr[], String search) {
		if(arr == null || arr.length == 0) {
			return false;
		}
		
		if (search == null) {
			return false;
		}
		
		for (String tmp : arr) {
			if (tmp.equals(search)) {
				return true;
			}
		}
		
		return false;
	}
}
