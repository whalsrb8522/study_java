package day016.product;

public class Order extends Product {
	private int prodCount;
	private int prodTotal;
	
	public Order() {}

	public Order(int prodCount, int prodTotal) {
		super();
		this.prodCount = prodCount;
		this.prodTotal = prodTotal;
	}

	public int getProdCount() {
		return prodCount;
	}

	public void setProdCount(int prodCount) {
		this.prodCount = prodCount;
	}

	public int getProdTotal() {
		return prodTotal;
	}

	public void setProdTotal(int prodTotal) {
		this.prodTotal = prodTotal;
	}
}
