package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.cita.modelo.Doctor;

@Repository
public class DoctorRepositoryImpl implements IDoctorRepository {

	private static List<Doctor> base = new ArrayList<>();

	@Override
	public Doctor buscar(String cedula) {
		Doctor doctor = null;
		for (Doctor dr : base) {
			if (cedula.equals(dr.getCedula())) {
				doctor = dr;
			}

		}
		return doctor;
	}

	@Override
	public void insertar(Doctor doctor) {
		
		base.add(doctor);
	}

}
