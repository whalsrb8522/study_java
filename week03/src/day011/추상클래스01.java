package day011;

public class 추상클래스01 {
	public static void main(String[] args) {
		Dog d = new Dog("바둑이", "개");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("나비", "고양이");
		c.printInfo();
		c.howl();		
	}
}

abstract class Animal {		// 추상 클래스
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.printf("----------\n");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("분류 : %s\n", category);
	}
	
	abstract public void howl();		// 추상 메소드
}

class Dog extends Animal {
	public Dog() {}
	
	public Dog(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.printf("%s : 멍멍\n", super.name);
	}
}

class Cat extends Animal {
	public Cat() {}
	
	public Cat(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.printf("%s : 야옹", super.name);
	}
}
