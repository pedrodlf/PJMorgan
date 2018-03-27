package com.pjmorgan.parking.datasource;



import java.util.List;

import com.pjmorgan.parking.Models.Entrada;

public interface DataSource {

	public void guardarEntrada(Entrada entrada);
	public List<Entrada> getVehiculosAparcados();
    
	
}
