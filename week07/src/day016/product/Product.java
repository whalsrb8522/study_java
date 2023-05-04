package day016.product;

public class Product {
	private String prodName;
	private int prodPrice;

	public Product() {}
	
	public Product(String prodName, int prodPrice) {
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
}
