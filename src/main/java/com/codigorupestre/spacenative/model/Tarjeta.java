package com.codigorupestre.spacenative.model;

public class Tarjeta {

	private String nombreTitular;

	private String entidad;

	private String numeroTarjeta;

	private String marca;

	private String cvv;

	private String fechaCauducidad;
	
	

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getFechaCauducidad() {
		return fechaCauducidad;
	}

	public void setFechaCauducidad(String fechaCauducidad) {
		this.fechaCauducidad = fechaCauducidad;
	}

	@Override
	public String toString() {
		return "Tarjeta [nombreTitular=" + nombreTitular + ", entidad=" + entidad + ", numeroTarjeta=" + numeroTarjeta
				+ ", marca=" + marca + ", cvv=" + cvv + ", fechaCauducidad=" + fechaCauducidad + "]";
	}

}
