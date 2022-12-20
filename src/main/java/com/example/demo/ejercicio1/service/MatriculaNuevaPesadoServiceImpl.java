package com.example.demo.ejercicio1.service;

import org.springframework.stereotype.Service;

@Service("pesado")

//debemos dentro de las comillas doble el nombre (identificador)
public class MatriculaNuevaPesadoServiceImpl implements IMatriculaNuevaService {

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		
		System.out.println("Matriculado pesado");
		
	}

}
