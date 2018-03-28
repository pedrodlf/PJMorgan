package com.pjmorgan.parking.controller.impl;

import com.pjmorgan.parking.controller.AppController;
import com.pjmorgan.parking.model.Entrada;
import com.pjmorgan.parking.model.Salida;
import com.pjmorgan.parking.service.ParkingDataSource;
import com.pjmorgan.parking.service.impl.ParkingDataSourceImpl;
import com.pjmorgan.parking.vistas2.VistaEntrada;
import com.pjmorgan.parking.vistas2.VistaInicioR;
import com.pjmorgan.parking.vistas2.VistaSalida;

public class AppControllerImpl implements AppController {

	private ParkingDataSource dataSource = new ParkingDataSourceImpl();


	@Override
	public void inicio() {
		System.out.println("--------INICIO DEL PROGRAMA------------");
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
		if(dataSource.guardarEntrada(entrada)) return true;
		else return false;
	}

	@Override
	public boolean isSalida(Entrada entrada) {
		if(dataSource.guardarSalida(entrada))return true;
		else return false;
	}

	@Override
	public void fin() {
		System.out.println("--------FIN DEL PROGRAMA------------");
		System.exit(0);
		
	}

}
