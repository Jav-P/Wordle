package co.edu.poli.wordle.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	Connection con = null;
	private String CONTROLADOR = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://localhost:3306/wordle";
	private String USUARIO = "root";
	private String CONTRA = "Hola";

	public Connection conectar() {
		try {
			Class.forName(CONTROLADOR);
			con = DriverManager.getConnection(URL, USUARIO, CONTRA);
			System.out.println("Conexion OK");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error al conectar: " + e.toString());
		}
		return con;
	}

	public void cerrar() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar conexion" + e.toString());
		}
	}

}
