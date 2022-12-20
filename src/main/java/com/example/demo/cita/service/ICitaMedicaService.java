package com.example.demo.cita.service;

import java.time.LocalDateTime;

public interface ICitaMedicaService {
	
	public void Agendar(String cedulaDoctor, String cedulaPaciente, LocalDateTime fecha);

}
