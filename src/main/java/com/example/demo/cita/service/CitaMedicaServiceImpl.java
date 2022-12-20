package com.example.demo.cita.service;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.CitaMedica;
import com.example.demo.cita.modelo.Doctor;
import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.ICitaMedicaRepository;


@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	@Autowired
	private ICitaMedicaRepository citaMedicaRepository;
	
	@Autowired
	private IPacienteSevice iPacienteSevice;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Override
	public void Agendar(String cedulaDoctor, String cedulaPaciente, LocalDateTime fechaCita) {
		Random random = new Random();
		Doctor doctor = this.doctorService.buscar(cedulaDoctor);
		Paciente paciente = this.iPacienteSevice.buscar(cedulaPaciente);
		
		CitaMedica citaMedica = new CitaMedica();
		
		citaMedica.setDoctor(doctor);
		citaMedica.setPaciente(paciente);
		citaMedica.setFecha(fechaCita);
		this.citaMedicaRepository.insertar(citaMedica);
		System.out.println("\nsU CITA HA SIDO GENERADA");
		System.out.print(citaMedica.toString());
		
	}

}
