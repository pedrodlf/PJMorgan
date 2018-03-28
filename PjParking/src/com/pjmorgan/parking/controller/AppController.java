package com.pjmorgan.parking.controller;

import com.pjmorgan.parking.model.Entrada;
import com.pjmorgan.parking.model.Salida;

public interface AppController {

	/**
	 * nos lleva a la vista de inicio
	 */
	public void inicio();

	/**
	 * Nos lleva a la vista de nueva entrada
	 */
	public void nuevaEntrada();

	/**
	 * nos lleva a la vista de nueva salida
	 */
	public void nuevaSalida();

	/**
	 * boolean
	 * 
	 * @return true si la entrada se ha realizado con exito
	 */
	public boolean isEntrada(Entrada entrada);

	/**
	 * boolean
	 * 
	 * @return true si la salida se ha realizado con exito
	 */
	public boolean isSalida(Entrada entrada);

	public void recuperarVehiculosApacados();

	public void recuperarVehiculosFacturados();
	
	public void fin();
}
