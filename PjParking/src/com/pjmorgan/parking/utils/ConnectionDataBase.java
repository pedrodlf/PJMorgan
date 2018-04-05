package com.pjmorgan.parking.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionDataBase {

	private String _user = "root";
	private String _pasw = "root";
	private String driver = "com.mysql.jdbc.Driver";
	static String _url = "jdbc:mysql://localhost:3306/jacobomil";
	public Connection cn;

	public void newConnection() {

		try {
			Class.forName(driver);
			cn = DriverManager.getConnection(_url, _user, _pasw);
			JOptionPane.showMessageDialog(null, "Conectado con la BBDD");
			

		}catch(Exception e) {

		JOptionPane.showMessageDialog(null, "No se ha podido establecer conexión " + e.getMessage());
	}
	}
	
	public Connection getConnection() {
		return cn;
	}
	
}

