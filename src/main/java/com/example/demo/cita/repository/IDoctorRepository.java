package com.example.demo.cita.repository;

import com.example.demo.cita.modelo.Doctor;

public interface IDoctorRepository {
	
	public Doctor buscar(String cedula);
	public void insertar(Doctor doctor );
	

}
