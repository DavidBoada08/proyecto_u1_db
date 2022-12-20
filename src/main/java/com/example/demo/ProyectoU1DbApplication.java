package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.cita.modelo.Doctor;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.service.ICitaMedicaService;
import com.example.demo.cita.service.IDoctorService;
import com.example.demo.cita.service.IPacienteSevice;

@SpringBootApplication
public class ProyectoU1DbApplication implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteSevice iPacienteSevice ;
	
	@Autowired
	private ICitaMedicaService citaMedicaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Doctor doctor = new Doctor();
		doctor.setApellido("Ruiz");
		doctor.setCedula("1720030723");
		doctor.setNombre("Clare");
		
		this.doctorService.agregar(doctor);
		
		Paciente paciente = new Paciente() ;
		paciente.setApellido("Boada");
		paciente.setCedula("1723116974");
		paciente.setNombre("David");
		
		this.iPacienteSevice.agregar(paciente);
		
		this.citaMedicaService.Agendar("1720030723", "1723116974", LocalDateTime.of(1991, 7, 5, 15, 18));
		
		
		
		
		
		
		
	}
		

}
