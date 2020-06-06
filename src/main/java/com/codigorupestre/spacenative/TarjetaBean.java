package com.codigorupestre.spacenative;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.codigorupestre.spacenative.model.Tarjeta;
import com.codigorupestre.spacenative.service.TarjetaService;
import com.codigorupestre.spacenative.service.TarjetaServiceImpl;

/**
 *
 * @author edcastillo
 */
@Named
@RequestScoped
public class TarjetaBean {

	private Tarjeta tarjeta;
	private static List<Tarjeta> tarjetas = new ArrayList<>();

	private TarjetaService tarjetaService = new TarjetaServiceImpl();

	public TarjetaBean() {

		tarjeta = new Tarjeta();

	}

	public void guardarTarjeta() {
		tarjetaService.guardarTarjeta(tarjeta);

		tarjeta = new Tarjeta();

		tarjetas = tarjetaService.listarTarjetas();

	}

	public void listarTarjetas() {
		tarjetas = tarjetaService.listarTarjetas();
	}

	public void eliminarId(String numeroTarjeta) {
		tarjetaService.eliminarId(numeroTarjeta);
	}

	public void buscarId() {

	}

	public void actualizar() {

	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(List<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}

}
