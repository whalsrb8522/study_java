package JDBC;

import java.util.List;

public interface DAO {
	int insert(Product product);
	List<Product> selectList();
	Product selectDetail(String pname);
	boolean edit_check(String pname);
	int edit(Product product, String old_pname);
}
