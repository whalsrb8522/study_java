package day010;

public class Product {
	private String name;
	private int price;
	
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}	
	
	public void printProduct() {
		System.out.printf("상품 이름 : %s, ", this.name);
		System.out.printf("상품 가격 : %d", this.price);
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}