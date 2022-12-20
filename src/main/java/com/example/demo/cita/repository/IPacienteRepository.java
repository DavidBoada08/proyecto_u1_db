package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.Paciente;

public interface IPacienteRepository {
	

	public Paciente buscar(String cedula);
	public void insertar(Paciente paciente );

}
