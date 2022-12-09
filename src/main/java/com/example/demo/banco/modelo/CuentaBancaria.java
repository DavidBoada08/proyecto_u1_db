package com.example.demo.banco.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {
	private String numero;
	private String tipo;
	private BigDecimal saldo;
	private String titular;

	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular
				+ "]";
	}
	//Getter& setter
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	

	
	
	
	
	
	

}
