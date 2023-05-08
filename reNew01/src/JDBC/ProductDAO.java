package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO implements DAO {
	// DB Connection
	private Connection conn;

	// PreparedStatement 클래스를 사용하여 객체 생성후 사용
	private PreparedStatement pst;

	// query문을 저장하기 위한 변수
	private String query = "";

	public ProductDAO() {
		DatabaseConnector dbc = DatabaseConnector.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public int insert(Product product) {
		// pname, price, madeby
		query = "insert into product(pname, price, madeby) values(?, ?, ?)";
		try {
			pst = conn.prepareStatement(query);
			// pst.set자료형(순번, 값)
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			// excuteUpdate() : 값이 업데이트 되어야 하는 상황 (insert, update, delete)
			// excuteQuery() : select 경우 => DB의 값이 변하지 않는 상황
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert eror");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Product> selectList() {
		List<Product> list = new ArrayList<Product>();

		query = "select pno, pname, regdate from product";
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				list.add(new Product(
						rs.getInt("pno"), 
						rs.getString("pname"), 
						rs.getString("regdate")
				));
			}
			return list;
		} catch (SQLException e) {
			System.out.println("selectlist error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Product selectDetail(String pname) {
		Product detail = null;
		
		query = "select * from product where pname=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, pname);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				detail = new Product(
					rs.getInt("pno"), 
					rs.getString("pname"), 
					rs.getInt("price"),
					rs.getString("regdate"),
					rs.getString("madeby")
				);
			}
			return detail;
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean edit_check(String pname) {
		query = "select * from product where pname=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, pname);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return true;
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public int edit(Product product, String old_pname) {
		query = "update product set pname=?, price=?, madeby=? where pname=?";
		try {
			pst = conn.prepareStatement(query);
			// pst.set자료형(순번, 값)
			pst.setString(1, product.getPname());
			pst.setInt(2, product.getPrice());
			pst.setString(3, product.getMadeby());
			pst.setString(4, old_pname);
			// excuteUpdate() : 값이 업데이트 되어야 하는 상황 (insert, update, delete)
			// excuteQuery() : select 경우 => DB의 값이 변하지 않는 상황
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert eror");
			e.printStackTrace();
		}
		return 0;
	}
}
