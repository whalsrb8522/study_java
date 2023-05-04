package day011;

public class GoldCustomer extends Customer{
	double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += (int) price * bonusRatio;
		return price -= (int) price * saleRatio;
	}
}
