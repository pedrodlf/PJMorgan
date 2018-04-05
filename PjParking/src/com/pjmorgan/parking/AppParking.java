package com.pjmorgan.parking;



import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.controller.impl.AppControllerImpl;
import com.pjmorgan.parking.utils.ConnectionDataBase;


public class AppParking {

	public static void main(String[] args) {
	AppController controller = new AppControllerImpl();
	controller.inicio();
	
	ConnectionDataBase database = new ConnectionDataBase();
     database.newConnection();
	
	}

}


