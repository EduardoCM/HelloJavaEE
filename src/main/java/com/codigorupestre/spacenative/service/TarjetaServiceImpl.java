package com.codigorupestre.spacenative.service;

import java.util.List;

import com.codigorupestre.spacenative.dao.TarjetaDAO;
import com.codigorupestre.spacenative.dao.TarjetaDAOImpl;
import com.codigorupestre.spacenative.model.Tarjeta;

public class TarjetaServiceImpl implements TarjetaService {

	private TarjetaDAO dao = new TarjetaDAOImpl();

	@Override
	public void guardarTarjeta(Tarjeta tarjeta) {
		dao.guardarTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> listarTarjetas() {
		return dao.listarTarjetas();
	}

	@Override
	public void eliminarId(String numeroTarjeta) {
		dao.eliminarId(numeroTarjeta);
	}

}
