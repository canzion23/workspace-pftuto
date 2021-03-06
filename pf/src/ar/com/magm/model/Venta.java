package ar.com.magm.model;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Venta implements Serializable {

	private static final long serialVersionUID = 8060348552656940209L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private int anio;

	private String cliente;

	private int mes;

	private String mesLetra;

	private double venta;

	private String zona;

	public Venta(String zona, String cliente, int anio, int mes,
			String mesLetra, double venta) {
		super();
		this.zona = zona;
		this.cliente = cliente;
		this.anio = anio;
		this.mes = mes;
		this.mesLetra = mesLetra;
		this.venta = venta;
	}

	public int getAnio() {
		return anio;
	}

	public String getCliente() {
		return cliente;
	}

	public int getMes() {
		return mes;
	}

	public String getMesLetra() {
		return mesLetra;
	}

	public double getVenta() {
		return venta;
	}

	public String getVentaFormat() {
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(venta);
	}

	public String getZona() {
		return zona;
	}
}
