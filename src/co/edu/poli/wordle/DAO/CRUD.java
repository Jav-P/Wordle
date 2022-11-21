
package co.edu.poli.wordle.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class CRUD {

	java.sql.Statement st;
	java.sql.ResultSet rs;
	DatabaseConnection con;
	
	public CRUD() {
		con = new DatabaseConnection();
	}

	public String palabra() throws SQLException {

		String palabra = "";
		Connection conexion = con.conectar();
		st = conexion.createStatement();
		int num = (int) (Math.random() * 4 + 1);
		String sql = "SELECT * FROM wordle.palabra where id_palabra =" + num;
		System.out.println(sql);
		rs = st.executeQuery(sql);
		while (rs.next()) {
			palabra = rs.getString(2);
		}
		return palabra;
	}

}