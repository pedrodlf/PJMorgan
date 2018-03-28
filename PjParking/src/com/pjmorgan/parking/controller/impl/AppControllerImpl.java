package com.pjmorgan.parking.controller.impl;

import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.model.Entrada;
import com.pjmorgan.parking.model.Salida;
import com.pjmorgan.parking.vistas2.VistaEntrada;
import com.pjmorgan.parking.vistas2.VistaInicioR;
import com.pjmorgan.parking.vistas2.VistaSalida;

public class AppControllerImpl implements AppController {

	


	@Override
	public void inicio() {
		VistaInicioR vInicio = new VistaInicioR();
		vInicio.setVisible(true);

	}

	@Override
	public void nuevaEntrada() {
		VistaEntrada vEntrada = new VistaEntrada();
		vEntrada.setVisible(true);
		
	}

	@Override
	public void nuevaSalida() {
		VistaSalida salida = new VistaSalida();
		salida.setVisible(true);
	}

	@Override
	public void recuperarVehiculosApacados() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recuperarVehiculosFacturados() {
		// TODO Auto-generated method stub

	}



	@Override
	public boolean isEntrada(Entrada entrada) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSalida(Salida salida) {
		// TODO Auto-generated method stub
		return false;
	}

}
