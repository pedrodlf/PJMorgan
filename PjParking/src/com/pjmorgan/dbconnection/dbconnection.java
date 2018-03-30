package com.pjmorgan.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class dbconnection {

	private String driver = "com.mysql.jdbc.Driver";
	private String cadenaConexion = "jdbc:mysql://127.0.0.1/jacobomil";
	private String usuario = "jacobomil";
	private String contrasena = "pjmorgan";
	public Connection con;

	public dbconnection() {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(cadenaConexion, usuario, contrasena);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"No se ha podido establecer conexión con la base de datos" + e.getMessage());
		}
	}

}
