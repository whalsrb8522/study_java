package day010;

public class 상속02 {
	public static void main(String[] args) {
		/*
		 * 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의하는것
		 * - 부모 클래스의 메서드와 선언부가 일치해야한다.	
		 */
		
		Dog d = new Dog();
		d.info();
		d.setName("뽀삐");
		d.info();
		d.howl();
		
		Cat c = new Cat("야옹이", "고양이과");
		c.info();
		c.howl();
		c.setName("나비");
		c.info();
		
		Tiger t = new Tiger("호랑이", "고양이과");
		t.info();
		t.howl();
	}
}

class Animal {
	private String name;		// 이름
	private String category;	// 종
	
	public Animal() {}
	
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;		
	}
	
	public void info() {
		System.out.println("--------------------");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("분류 : %s\n", category);
	}
	
	public void howl() {
		System.out.printf("%s의 울음소리 : ", name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}

class Dog extends Animal {
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}

	@Override
	public void howl() {
		super.howl();
		System.out.printf("멍멍\n");
	}
}

class Cat extends Animal {
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.printf("야옹\n");
	}
}

class Tiger extends Animal {
	public Tiger(String name, String category) {
		super(name, category);		// 부모클래스의 생성자를 호출
	}

	@Override
	public void howl() {
		super.howl();
		System.out.printf("어흥\n");
	}
}