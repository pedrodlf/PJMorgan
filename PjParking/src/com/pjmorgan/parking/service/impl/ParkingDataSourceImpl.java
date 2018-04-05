package com.pjmorgan.parking.service.impl;

import java.util.List;

import com.mysql.jdbc.PreparedStatement;
import com.pjmorgan.parking.model.Entrada;
import com.pjmorgan.parking.model.Salida;
import com.pjmorgan.parking.service.ParkingDataSource;
import com.pjmorgan.parking.utils.Dbconnection;

public class ParkingDataSourceImpl implements ParkingDataSource{

	

	@Override
	public boolean guardarEntrada(Entrada entrada) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean guardarSalida(Entrada entrada) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean BorrarEntrada(Entrada entrada) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Salida> getAllSalidas() {
		// TODO Auto-generated method stub
		return null;
	}

}
