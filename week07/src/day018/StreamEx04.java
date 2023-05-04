package day018;

import java.util.ArrayList;
import java.util.Comparator;

// 여행 상품
// 15세 이상은 100만원
// 15세 미만은 50만원
// 고객 3명 (class로 선언 후 ArrayList에 저장)
// 1. 비용 계산
// 2. 고객 명단 출력
// 이름: 이순신, 나이: 40, 비용: 100
// 이름: 신사임당, 나이: 35, 비용: 100
// 이름: 이아들, 나이: 10, 비용: 50
// 총 여행비용: 250

public class StreamEx04 {
	public static void main(String[] args) {
		ArrayList<Customer> cList = new ArrayList<Customer>();

		cList.add(new Customer("이순신", 40));
		cList.add(new Customer("신사임당", 35));
		cList.add(new Customer("이아들", 10));

//		cList.stream().forEach(customer -> {
//			int price = 0;
//
//			if (customer.getAge() >= 15)
//				price = 100;
//			else if (customer.getAge() < 15)
//				price = 50;
//
//			System.out.printf("이름: %s, 나이: %s, 비용: %d\n", customer.getName(), customer.getAge(), price);
//		});
//
//		System.out.printf("총 여행비용: %d\n", cList.stream().map(customer -> {
//			if (customer.getAge() >= 15)
//				return 100;
//			else
//				return 50;
//		}).mapToInt(price -> price.intValue()).sum());

		cList.stream().forEach(customer -> {
			System.out.printf("이름: %s, 나이:%s, 비용: %s\n", customer.getName(), customer.getAge(), customer.getPrice());
		});

		System.out.printf("총 여행 비용: %s\n",
				cList.stream().map(customer -> customer.getPrice()).mapToInt(price -> price.intValue()).sum());

		// 20세 이상만 이름을 정렬하여 출력
//		cList.stream().sorted(new Comparator<Customer>() {
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		}).filter(customer -> customer.getAge() >= 20).forEach(customer -> {
//			System.out.printf("이름: %s, 나이: %s, 비용:%s\n", customer.getName(), customer.getAge(), customer.getPrice());
//		});

		cList.stream().filter(customer -> customer.getAge() >= 20).map(customer -> customer.getName()).sorted()
				.forEach(name -> {
					System.out.println(name);
				});
	}
}

class Customer {
	private String name;
	private int age;
	private int price;

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.setPrice(this.age >= 15 ? 100 : 50);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
