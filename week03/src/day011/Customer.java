package day011;

public class Customer {
	/*
	 * 일반고객 / Gold 고객 / Vip 고객
	 * 
	 * [멤버변수]
	 * 고객ID : customerID
	 * 고객이름 : customerName
	 * 고객등급 : customerGrade
	 * 보너스포인트 : bonusPoint
	 * 보너스포인트적립비율 : bonusRatio
	 * 
	 * [객체]
	 * customerGrade = Silver
	 * bonusRatio = 1%
	 * 
	 * customerGrade = Gold
	 * bonusRatio = 2%
	 * 구매금액 10% 할인
	 * 
	 * customerGrade = Vip
	 * bonusRatio = 5%
	 * 구매금액 10% 할인, 전담 상담사
	 * 
	 * [메서드]
	 * 보너스 적립 계산 : calcPrice
	 * 		- 구매 금액을 주고, 적립 보너스를 계산, bonusPoint에 누적
	 * 출력 : customerInfo
	 * ex) 홍길동 님의 등급은 VIP이며, 보너스포인트는 1000원입니다.
	 */
	
	protected int customerID;	// => ex) 1001
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {}
	
	public Customer(int id, String name) {
		customerID = id;
		customerName = name;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += (int) price * bonusRatio;
		return price;
	}
	
	public String customerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}