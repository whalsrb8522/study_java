package day017;

// 제네릭: 결정되지 않은 파라미터를 처리할 때 사용
// 실제 객체를 사용할 때 파라미터 타입을 결정 
//	<T> <K> <V> 

public class Sale<K, V> {
	// 멤버변수 menu, price
	private K menu;
	private V price;

	public Sale() {
	}

	public Sale(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}

	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "제품명: " + menu + ", 가격: " + price + "";
	}
}
