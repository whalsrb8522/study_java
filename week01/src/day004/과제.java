package day004;

public class 과제 {
	public static void main(String[] args) {
		/*
		 * 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1~6까지의 랜덤수
		 * 
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 21칸 남았습니다.
		 * ...
		 * 도착, 총 n몇 움직였습니다.
		 */	
		
		int random = 0;		// 랜덤 주사위
		int total = 30;		// 이동해야하는 칸수
		int cnt = 0;		// 움직인 횟수
		int[] arr = new int[total];	// 주사위 값 저장을 위한 배열
		
		do {
			random = (int) (Math.random() * 6) + 1;
			total -= random;
			
			arr[cnt] = random;
			cnt++;
			
			System.out.printf("%d번째 주사위 : %d\n", cnt, random);
			if (total <= 0) { 
				System.out.printf("도착, 총 %d번 움직였습니다.\n", cnt);
				break;
			} else {
				System.out.printf("%d칸 전진 => %d칸 남았습니다.\n", random, total);				
			}
			System.out.println();
		} while (total > 0);
		System.out.printf("\n");
		
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%02d번째 주사위의 수 : %d\n", i + 1, arr[i]);
		}
	}
}
