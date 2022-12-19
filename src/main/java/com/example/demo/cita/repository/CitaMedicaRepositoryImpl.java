package com.example.demo.cita.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.cita.modelo.CitaMedica;


public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	
	private static List<CitaMedica> base = new ArrayList<>();

	@Override
	public void insertar(CitaMedica cita) {
		// TODO Auto-generated method stub
		base.add(cita);
		
	}
	
	
	
}