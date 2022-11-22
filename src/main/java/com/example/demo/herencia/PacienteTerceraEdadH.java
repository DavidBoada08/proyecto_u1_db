package com.example.demo.herencia;

public class PacienteTerceraEdadH extends PacienteH {

	private String codigoIESS;

	public Integer carcularDescuento() {

		System.out.println("Paciente Tercera Edad con el 20% de descuento");
		return 20;
	}

	public String getCodigoIESS() {
		return codigoIESS;
	}

	public void setCodigoIESS(String codigoIESS) {
		this.codigoIESS = codigoIESS;
	}

}
