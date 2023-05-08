package JDBC;

import java.util.List;

public interface Service {
	int register(Product product);
	List<Product> list();
	Product detail(String pname);
	boolean edit_check(String pname);
	int edit(Product product, String old_pname);
}
