package day007;

public class Lotto {
	public static void main(String[] args) {
		/*
		 * 로또번호 생성 메서드 (1~45 랜덤)
		 * 로또번호 = 사용자번호 6자리 : 자동번호
		 * 당첨번호 = 당첨번호 6자리 + 보너스번호
		 * 
		 * 사용자번호, 당첨번호를 랜덤으로 발생시켜 로또의 등수를 확인
		 * 로또의 등수 확인
		 * 
		 * [메서드]
		 * 1. 번호를 랜덤으로 생성해주는 기능 (1~45)
		 * 2. 랜덤값을 배열에 대입
		 * 3. 배열 출력
		 * 4. 중복 제거
		 * 5. 등수 체크
		 * 		- 6개 일치 = 1등
		 * 		- 5개 + 보너스 : 2등
		 * 		- 5개 : 3등
		 * 		- 4개 : 4등
		 * 		- 3개 : 5등
		 * 		- 나머지 : 꽝
		 */
		int[] lotto = new int[7];
		int[] user = new int[6];
		
		generateLotto(lotto);
		generateLotto(user);
		
		System.out.printf("당첨번호 (7자리) : ");
		printLotto(lotto);
		System.out.printf("사용자번호 (6자리) : ");
		printLotto(user);
		
		int rank = resultLotto(lotto, user);
		
		if (rank == -1) {
			System.out.println("꽝");
		} else {
			System.out.println(rank + "등 당첨");
		}
	}
	
	// 번호 랜덤으로 생성 기능
	public static int randomNumber() {
		return (int) (Math.random() * 45 + 1);		
	}
	
	// 랜덤 번호를 배열에 저장하는 기능
	public static void generateLotto(int[] arr) {
		int i = 0;
		
		while (i < arr.length) {
			int r = randomNumber();
			if (!isContain(arr, r)) {
				arr[i] = r;
				i++;
			}
		}
	}
	
	// 정수 배열을 콘솔에 출력
	public static void printLotto(int[] arr) {
		for (int i : arr) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	
	// 같은값이 들어가지않게 체크
	public static boolean isContain(int[] arr, int random) {
		for (int tmp : arr) {
			if (tmp == random) {
				return true;
			}
		}
		
		return false;
	}
	
	// 로또 결과 확인
	public static int resultLotto(int[] lotto, int[] user) {
		if(lotto.length <= user.length) {
			return -1;
		}
		
		int cnt = 0;
		
		for (int i =0; i < user.length; i++) {
			 if(isContain(user, lotto[i])) {
				 cnt++;
			 }
		}
		
		switch (cnt) {
		case 6:
			return 1;
		case 5:
			if(isContain(user, lotto[lotto.length - 1]) ) {
				return 2;
			} else
				return 3;
		case 4:
			return 4;
		case 3:
			return 5;
		default:
			return -1;
		}
	}
}
