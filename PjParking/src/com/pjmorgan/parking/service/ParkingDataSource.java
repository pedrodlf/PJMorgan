package com.pjmorgan.parking.service;

import java.util.List;

import com.pjmorgan.parking.model.Entrada;
import com.pjmorgan.parking.model.Salida;

public interface ParkingDataSource {

	
	public boolean guardarEntrada(Entrada entrada);
	public boolean guardarSalida(Entrada entrada);
	public boolean BorrarEntrada(Entrada entrada);
	public List<Salida> getAllSalidas();
	
}
