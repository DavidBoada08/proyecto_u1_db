package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.boot.CitaMedicaSB;
import com.example.demo.spring.boot.MedicoSB;
import com.example.demo.spring.boot.PacienteCancerSB;
import com.example.demo.spring.boot.PacienteTerceraEdadSB;

@SpringBootApplication

//ejecucion mediante consola
public class ProyectoU1DbApplication implements CommandLineRunner {

	//taler 4
	
	//inyeccion de Dependencias DI
	@Autowired
	private PacienteTerceraEdadSB pacienteTE;
	
	@Autowired
	private PacienteCancerSB pacienteCancerSB;
	
	
	@Autowired
	private CitaMedicaSB citaMedicaSB;
	
	@Autowired
	private MedicoSB medicoSB;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		
		this.pacienteTE.setCodigoIESS("123364");
		this.pacienteTE.setNombre("Edison");
		this.pacienteTE.setTipo("");
		this.pacienteTE.setCedula("1720030723");
		
		System.out.println(pacienteTE);
		
		this.pacienteCancerSB.setCedula("124578963");
		this.pacienteCancerSB.setNombre("Daniel");
		this.pacienteCancerSB.setTipo("c");
		
		citaMedicaSB.agendar("123123", LocalDateTime.of(2022,12,2,8,30), this.pacienteCancerSB, medicoSB);
		
	}

}
