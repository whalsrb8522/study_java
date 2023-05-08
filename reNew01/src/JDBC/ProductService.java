package JDBC;

import java.util.List;

public class ProductService implements Service {
	// Service -> DAO 요청
	private DAO dao;
	
	public ProductService() {
		dao = new ProductDAO();
	}
	
	@Override
	public int register(Product product) {
		// 실제 DAO에 요청 처리 로직
		System.out.println("register service 진입");
		return dao.insert(product);
	}

	@Override
	public List<Product> list() {
		System.out.println("list service 진입");
		return dao.selectList();
	}

	@Override
	public Product detail(String pname) {
		System.out.println("detail service 진입");
		return dao.selectDetail(pname);
	}

	@Override
	public boolean edit_check(String pname) {
		return dao.edit_check(pname);
	}

	@Override
	public int edit(Product product, String old_pname) {
		return dao.edit(product, old_pname);
	}
}
