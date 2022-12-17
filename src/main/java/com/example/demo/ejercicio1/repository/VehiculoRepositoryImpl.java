package com.example.demo.ejercicio1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ejercicio1.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {

	
	private static List <Vehiculo> base = new ArrayList<>();
	
	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo = null;
		for(Vehiculo v : base) {
			if(v.getPlaca().equals(placa)) {
				vehiculo = v;
			}
		}
		return vehiculo;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		base.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		Vehiculo vehi = null;
		for(Vehiculo v : base) { //me recorre la base de datos
			if(v.getPlaca().equals(vehiculo.getPlaca())) {
				vehi = v;
			}
	     }
		base.remove(vehi);
		base.add(vehiculo);
		
	}
		

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		base.remove(this.buscar(placa)); //Remove no usa String por ello
	}

}
