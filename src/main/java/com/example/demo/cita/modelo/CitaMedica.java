package com.example.demo.cita.modelo;

import java.time.LocalDateTime;

public class CitaMedica {
	
	private LocalDateTime fecha;
	private Doctor doctor;
	private Paciente paciente;
	
	
	
	//set y get
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@Override
	public String toString() {
		return "CitaMedica [fecha=" + fecha + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}
	
	
	
	
	

}
