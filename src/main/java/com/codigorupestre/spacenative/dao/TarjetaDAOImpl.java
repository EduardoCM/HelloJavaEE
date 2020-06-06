package com.codigorupestre.spacenative.dao;

import java.util.ArrayList;
import java.util.List;

import com.codigorupestre.spacenative.model.Tarjeta;

public class TarjetaDAOImpl implements TarjetaDAO {

	private static List<Tarjeta> tarjetas = new ArrayList<>();

	public void guardarTarjeta(Tarjeta tarjeta) {
        tarjetas.add(tarjeta);
	}

	public List<Tarjeta> listarTarjetas() {
		return tarjetas;
	}

	public void eliminarId(String numeroTarjeta) {
		tarjetas.remove(tarjetas.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get());
	}

}
