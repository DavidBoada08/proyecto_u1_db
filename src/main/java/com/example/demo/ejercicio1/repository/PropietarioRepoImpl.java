package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepository {

	
	private static List<Propietario> base = new ArrayList<>();
	
	public Propietario buscar(String cedula) {
		Propietario propietario = null;
		for(Propietario p : base) {
			if(p.getCedula().equals(cedula)) {
				propietario=p;
			}
		}
	
		return propietario;
	}
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		base.add(propietario);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(cedula));
	}

}
