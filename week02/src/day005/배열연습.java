package day005;

import java.util.Scanner;

public class 배열연습 {
	public static void main(String[] args) {
		/*
		 * 5명의 점수를입력받아 배열에 저장
		 * 점수의 합계 평균 최대 최소값을 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int pNum = 5;		// 인원수
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		int[] arr = new int[pNum];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 인원의 점수를 입력해주세요.", i + 1);
			arr[i] = sc.nextInt();
			
			if (arr[i] < 0 || arr[i] > 100) {
				System.out.printf("다시 입력해주세요. (1~100)\n");
				--i;
				continue;
			}
			
			sum += arr[i];						// 합계
//			if (arr[i] > max) max = arr[i];		// 최대
//			if (arr[i] < min) min = arr[i];		// 최소
			max = Math.max(arr[i], max);		// 최대
			min = Math.min(arr[i], min);		// 최소
		}
		avg = (double) sum / arr.length;		// 평균
		System.out.println();
		
		System.out.printf("합계 : %d\n", sum);
		System.out.printf("평균 : %.1f\n", avg);
		System.out.printf("최대 : %d\n", max);
		System.out.printf("최소 : %d\n", min);
		
		sc.close();		
	}
}
