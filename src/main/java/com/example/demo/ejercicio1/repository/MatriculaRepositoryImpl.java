package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl  implements IMatriculaRepository{

	private static List<Matricula> base = new ArrayList<>();
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		base.add(matricula);
		
	}

}
