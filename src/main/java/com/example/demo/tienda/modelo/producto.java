package com.example.demo.tienda.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class producto {
	
	private String codigoBarras;
	private String nombre;
	private String tipo;
	private BigDecimal precio;
	private Integer cantidad;
	private LocalDateTime fechaCaducidad;
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDateTime fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	@Override
	public String toString() {
		return "producto [codigoBarras=" + codigoBarras + ", nombre=" + nombre + ", tipo=" + tipo + ", precio=" + precio
				+ ", cantidad=" + cantidad + ", fechaCaducidad=" + fechaCaducidad + "]";
	}
	
	

}


