package com.codigorupestre.spacenative.dao;

import java.util.List;

import com.codigorupestre.spacenative.model.Tarjeta;

public interface TarjetaDAO {

	public void guardarTarjeta(Tarjeta tarjeta);

	public List<Tarjeta> listarTarjetas();

	public void eliminarId(String numeroTarjeta);

}
