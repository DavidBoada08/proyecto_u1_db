package com.example.demo.cita.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.cita.modelo.Paciente;
import com.example.demo.cita.repository.IPacienteRepository;

@Service
public class PacienteServiceImpl implements IPacienteSevice{

	@Autowired
	private IPacienteRepository pacienteRepository;
	@Override
	public Paciente buscar(String cedula) {
		
		return this.pacienteRepository.buscar(cedula);
	}

	@Override
	public void agregar(Paciente paciente) {
		this.pacienteRepository.insertar(paciente);
		System.out.println("El paciente fue agregado exitosamente");
		System.out.println(paciente.toString());
	}

}
