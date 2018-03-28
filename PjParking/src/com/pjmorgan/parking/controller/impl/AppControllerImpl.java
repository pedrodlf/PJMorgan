package com.pjmorgan.parking.controller.impl;

import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.vistas2.VistaEntrada;
import com.pjmorgan.parking.vistas2.VistaInicioR;

public class AppControllerImpl implements AppController {

	@Override
	public void inicio() {
		VistaInicioR inicioR = new VistaInicioR();
			inicioR.setVisible(true);

	}

	@Override
	public void nuevaEntrada() {
		VistaEntrada entrada = new VistaEntrada();
		entrada.setVisible(true);

	}

	@Override
	public void nuevaSalida() {
		// TODO Auto-generated method stub

	}

	@Override
	public void entradaOk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void entradaFail() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salidaOk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void salidaFail() {
		// TODO Auto-generated method stub

	}

}
