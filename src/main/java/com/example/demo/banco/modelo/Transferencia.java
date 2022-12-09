package com.example.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transferencia {
	@Override
	public String toString() {
		return "Transferencia [cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino + ", monto=" + monto
				+ ", fecha=" + fecha + ", numero=" + numero + "]";
	}
	private String cuentaOrigen;
	private String cuentaDestino;
	private BigDecimal monto;
	private LocalDate fecha;
	private String numero;

	//GETTER & SETTER
	public String getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(String cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public String getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(String cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	

	
	
	
	
}
