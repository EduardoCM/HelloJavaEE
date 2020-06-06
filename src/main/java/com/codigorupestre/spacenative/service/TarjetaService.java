package com.codigorupestre.spacenative.service;

import java.util.List;

import com.codigorupestre.spacenative.model.Tarjeta;

public interface TarjetaService {
	
	
	public void guardarTarjeta(Tarjeta tarjeta);

	public List<Tarjeta> listarTarjetas();

	public void eliminarId(String numeroTarjeta);

}
