package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinioH extends PacienteSB {
	
	private String pesoNacimiento;

	public String getPesoNacimiento() {
		return pesoNacimiento;
	}

	public void setPesoNacimiento(String pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}
	
	public  Integer carcularDescuento(){
		
		System.out.println("Paciente Niño con el 10% de descuento");
		return 10;
	}
	

}
