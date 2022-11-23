package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component

public class PacienteCancerSB extends PacienteSB {
	
	public Integer carcularDescuento() {

		System.out.println("Paciente Cancer con el 30% de descuento");
		return 30;
	}

}
