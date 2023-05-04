package day011;

public class CumstomerMain {
	public static void main(String[] args) {

		Customer[] customerList = new Customer[10];
		
		Customer c = new Customer(1001, "홍길동");
		Customer g = new GoldCustomer(1002, "아무개");		// 업캐스팅 (부모 클래스로 형변환, 묵시적인 형변환 가능)
		Customer v = new VipCustomer(1003, "거북이", "토끼");
				
		/*
		 * v.getConsultantName();   // 사용 불가
		 * 
		 * 다운캐스팅 (반드시 명시적으로 형변환 해야함)
		 * 부모클래스로 자식클래스 객체를 만들었을때, 자식클래스의 메소드를 사용할 수 없음
		 * 
		 * Parent p = new Child() {}
		 *  
		 * instanceof : 원래 인스턴스의 형이 맞는지 체크 (true or false)
		 */
		if (v instanceof VipCustomer) {
			VipCustomer v_org = (VipCustomer) v;		// 다운캐스팅(명시적 형변환)
			v_org.getConsultantName();		// 정상 사용 가능
		} else if (v instanceof GoldCustomer) {
			GoldCustomer v_org = (GoldCustomer) v;		// 다운캐스팅(명시적 형변환)
		} else {
			System.out.println("error");
		}
		
		int cnt = 0;
		customerList[cnt] = c;
		cnt++;
		customerList[cnt] = g;
		cnt++;
		customerList[cnt] = v;
		cnt++;
		
		System.out.println("==== 고객 정보 출력 ====");
		for(int i = 0; i < cnt; i++) {
			System.out.println(customerList[i].customerInfo());
		}
		
		System.out.println("==== 할인율과 포인트 계산 ====");
		int price = 100000;
		for (int i = 0; i < cnt; i++) {
			System.out.printf("%s님이 지불하실 금액은 %d원입니다.\n", customerList[i].getCustomerName(), customerList[i].calcPrice(price));
			System.out.printf("%s님의 현재 포인트는 %d입니다.\n", customerList[i].getCustomerName(), customerList[i].bonusPoint);
		}
			
		
//		int price = 100000;
//		int cost = c.calcPrice(price);
//		System.out.printf("%s\n", c.customerInfo());
//		System.out.printf("%s님이 지불하실 금액은 %d원입니다.\n", c.getCustomerName(), cost);
//		System.out.printf("%s님의 현재 포인트는 %d입니다.\n", c.getCustomerName(), c.bonusPoint);
//		System.out.println();
//		
//		price = 200000;
//		cost = g.calcPrice(price);
//		System.out.printf("%s\n", g.customerInfo());
//		System.out.printf("%s님이 지불하실 금액은 %d원입니다.\n", g.getCustomerName(), cost);
//		System.out.printf("%s님의 현재 포인트는 %d입니다.\n", g.getCustomerName(), g.bonusPoint);
//		System.out.println();
//		
//		price = 200000;
//		int cost = v.calcPrice(price);
//		System.out.printf("%s\n", v.customerInfo());
//		System.out.printf("%s님이 지불하실 금액은 %d원입니다.\n", v.getCustomerName(), cost);
//		System.out.printf("%s님의 현재 포인트는 %d입니다.\n", v.getCustomerName(), v.bonusPoint);
	}
}
