package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcExample {
	public static void main(String[] args) {
		Connection con = null;
		try {
//			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			con = DriverManager.getConnection(url, "hr", "hr");
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:hr.db");
			System.out.println(con);

//			Statement stmt = con.createStatement();
			String sql = "insert into employees values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, 301);
			stmt.setString(2, "Jinyoung");
			stmt.setString(3, "Kim");
			stmt.setString(4, "KIMJY");
			stmt.setString(5, "010-222-3333");
			stmt.setDate(6, new java.sql.Date(System.currentTimeMillis()));
			stmt.setString(7, "IT_PROG");
			stmt.setDouble(8, 8000);
			stmt.setDouble(9, 0);
			stmt.setInt(10, 103);
			stmt.setInt(11, 60);
			stmt.executeUpdate(); // insert, update, delete 구문을 실행
			System.out.println("데이터가 입력되었습니다.");
//
//			ResultSet rs = stmt.executeQuery("select * from employees");
//			while (rs.next()) {
//				System.out.print(rs.getInt("employee_id") + "\t");
//				System.out.print(rs.getString("first_name") + "\t");
//				System.out.print(rs.getString("last_name") + "\t");
//				System.out.println(rs.getString("email") + "\t");
//			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				con.close();
			} catch (Exception e) {

			}
		}
	}
}