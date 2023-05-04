package day011;

public class 다형성02 {
	/*
	 * 객체지향프로그램
	 * - 프로그램을 독립된 단위의 객체들을 모아서 처리하는 모임
	 * - 각각의 객체는 메시지를 주고 받으면서 데이터를 처리
	 * 
	 * 4가지 특징
	 * - 추상화(Abstraction) : 핵심적인 코드만 보여주기, 불필요한 부분은 숨김 
	 * - 캡슐화(encapsulation) : 
	 * 		. 데이터 보호 (정보 은닉)
	 * 		. 멤버변수와 메서드를 하나로 묶는것
	 * 		. 멤버변수는 숨기고 메서드로 접근
	 * 		. 은닉화 : 객체의 내부의 정보는 숨겨 외부로 드러나지 않게 함,
	 * 				외부에서 데이터를 직접 접근하는 것을 방지 
	 * - 상속(inheritance) : 코드 재사용 (확장)
	 * 		. 클래스를 상속받아 수정하여 사용하게 되면 중복 코드를 줄일 수 있따 
	 * - 다형성(polymorphism) : 객체 변경 용이 
	 */

	public static void main(String[] args) {
		/*
		 * 다형성(polymorphism) : 하나의 코드가 여러 자료형으로 구현되어 실행되는 것
		 * 같은 코드에서 여러 다른 실행결과를 얻을 수 있음
		 * 다형성을 잘 활용하면 유연하고, 확장성있고 유지보수가 편리한 프로그램을 만들 수 있음
		 */
		
		Animal1 hAnimal = new Human();
		Animal1 tAnimal = new Tiger();
		Animal1 eAnimal = new Eagle();
		
		Animal1[] arr = new Animal1[3];
		int cnt = 0;
		arr[cnt] = hAnimal;
		cnt++;
		arr[cnt] = tAnimal;
		cnt++;
		arr[cnt] = eAnimal;
		cnt++;
		
		다형성02 test = new 다형성02();
		System.out.println("==== Down Casting ====");
		test.testDownCasting(arr, cnt);
	}
	
	public void moveAnimal(Animal1[] animal, int cnt) {
		for (int i = 0; i < cnt; i++) {
			animal[i].move();	
		}
	}
	
	public void testDownCasting(Animal1[] list, int cnt){
		for (int i = 0; i < cnt; i++) {
			Animal1 animal= list[i];
			
			if (animal instanceof Human) {
				Human animal_down = (Human) animal;
				animal_down.read();
			} else if (animal instanceof Tiger) {
				Tiger animal_down = (Tiger) animal;
				animal_down.hunting();
			} else if (animal instanceof Eagle) {
				Eagle animal_down = (Eagle) animal;
				animal_down.flying();
			}
		}
	}
}

class Animal1 {
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}

class Human extends Animal1 {
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void read() {
		System.out.println("사람이 공부를 합니다.");
	}
}

class Tiger extends Animal1 {
	@Override
	public void move() {
		System.out.println("호랑이가 어슬렁 거립니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal1 {
	@Override
	public void move() {
		System.out.println("독수리는 하늘을 날아다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 폅니다.");
	}
}