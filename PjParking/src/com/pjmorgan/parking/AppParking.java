package com.pjmorgan.parking;



import com.pjmorgan.dbconnection.Dbconnection;
import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.controller.impl.AppControllerImpl;


public class AppParking {

	public static void main(String[] args) {
	AppController controller = new AppControllerImpl();
//	controller.inicio();
	
	Dbconnection database = new Dbconnection();
     database.newConnection();
	
	}

}


