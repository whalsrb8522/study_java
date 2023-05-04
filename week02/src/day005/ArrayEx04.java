package day005;

public class ArrayEx04 {
	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * 자료형[][] 배열명 =new 자료형[길이][길이];
		 */
		
		int[][] arr = new int[5][3];
		int cnt = 1;
		
		for (int i = 0; i < arr.length; i++) {				// 행처리
			for (int j = 0; j <arr[0].length; j++) {		// 열처리
				arr[i][j] = cnt;
				cnt++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
