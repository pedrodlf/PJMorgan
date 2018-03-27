package com.pjmorgan.parking;

import java.util.ResourceBundle.Control;

import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.controller.impl.AppControllerImpl;
import com.pjmorgan.parking.vistas2.VistaInicioR;

public class AppParking {

	public static void main(String[] args) {
	AppController controller = new AppControllerImpl();
	controller.inicio();
	}

}
