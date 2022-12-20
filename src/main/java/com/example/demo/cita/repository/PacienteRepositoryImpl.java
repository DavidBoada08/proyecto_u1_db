package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.Paciente;

@Repository

public class PacienteRepositoryImpl implements IPacienteRepository {
	
	private List<Paciente> base = new ArrayList<>();
	

	@Override
	public Paciente buscar(String cedula) {
		Paciente paciente = null;
		for (Paciente pa : base) {
			if (cedula.equals(pa.getCedula())) {
				paciente = pa;
			}
			
		}
		return paciente;
	}

	@Override
	public void insertar(Paciente paciente) {
		base.add(paciente);
		
	}

}
