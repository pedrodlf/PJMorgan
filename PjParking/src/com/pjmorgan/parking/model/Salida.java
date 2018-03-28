package com.pjmorgan.parking.model;

public class Salida {

	
	private String matricula;
	private double horas;
	
	public Salida(String matricula, double horas) {
		super();
		this.matricula = matricula;
		this.horas = horas;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}
	
	
	
	
	
	
	
	
	
}
