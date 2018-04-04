package com.pjmorgan.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Dbconnection {

	private String _user = "root";
	private String _pasw = "root";
	private String driver = "com.mysql.jdbc.Driver";
	static String _url = "jdbc:mysql://localhost:3306/jacobomil";
	public Connection con;

	public void newConnection() {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(_url, _user, _pasw);
			JOptionPane.showMessageDialog(null, "Conectado con la BBDD");

		}catch(Exception e) {

		JOptionPane.showMessageDialog(null, "No se ha podido establecer conexión " + e.getMessage());
	}
	}
}

