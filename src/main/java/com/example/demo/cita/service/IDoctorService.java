package com.example.demo.cita.service;

import com.example.demo.cita.modelo.Doctor;

public interface IDoctorService {
	
	public Doctor buscar(String cedula);
	public void agregar(Doctor doctor);

}
