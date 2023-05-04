package day004;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 배열3 {
	public static void main(String[] args) {
		/*
		 * 5명의 점수를 입력받아서 배열에 저장,
		 * 점수의 합계와 평균을 출력
		 * 합계 : 
		 * 평균 : 
		 */
		Scanner sc = new Scanner(System.in);
		
		int pNum = 5;		// 인원수
		int sum = 0;		// 점수 합계
		int max = 0;		// 최고 점수
		int min = 999;		// 최소 점수
		double avg = 0;		// 점수 평균
		int[] arr = new int[pNum];		// 인원수만큼 배열 선언
		
		for (int i = 0; i < arr.length; i++) {
			try {
				System.out.printf("%d번째 인원 점수 입력 : ", i + 1);
				arr[i] = sc.nextInt();
				sum += arr[i];
//				if (arr[i] > max)
//					max = arr[i];
				max = Math.max(max, arr[i]);
				min = Math.min(min, arr[i]);
			} catch (InputMismatchException e) {
				System.err.printf("숫자만 입력해주세요.\n");
				sc.nextLine();
				i--;
				continue;
			}
		}
		
		avg = (double) sum / 5;
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 인원 점수 : %d\n", i + 1, arr[i]);
		}
//		int index = 0;
//		for (int i : arr) {
//			System.out.printf("%d번째 인원 점수 : %d\n", index += 1, i);
//		}
		System.out.println();
		
		System.out.printf("합계 : %d점\n", sum);
		System.out.printf("평균 : %.1f점\n", avg);
		System.out.printf("최고점수 : %d점\n", max);
		System.out.printf("최소점수 : %d점", min);
		
		sc.close();
	}
}
