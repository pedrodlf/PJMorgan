package com.pjmorgan.parking.model;

import java.util.Date;

public class Entrada {

	
	private String tipo;
	private String marca;
	private String matricula;
	private String modelo;
	private Date horaEntrada;
	
	public Entrada() {
	}

	public Entrada(String tipo, String marca, String matricula, String modelo, Date horaEntrada) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.matricula = matricula;
		this.modelo = modelo;
		this.horaEntrada = horaEntrada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
}
