package com.pjmorgan.parking.Models;

import java.sql.Date;

public class Entrada {

	private String matricula;
	private String marca;
	private Date horaEntrada;
	
	public Entrada(String matricula, String marca, Date horaEntrada) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.horaEntrada = horaEntrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	
	
}
