package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ejercicio1.modelo.Propietario;
import com.example.demo.ejercicio1.service.IPropietarioService;

@SpringBootApplication
public class ProyectoU1DbApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService iPropietarioService;
	

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//
		Propietario propietario = new Propietario();
		propietario.setApellido("Boada");
		propietario.setCedula("1720030723");
		propietario.setFechaNacimiento(LocalDateTime.of(1991, 7, 5, 12, 15));

	}

}
