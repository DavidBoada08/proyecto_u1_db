package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteSevice {
	
	public Paciente buscar(String cedula);
	public void agregar (Paciente paciente);

}
