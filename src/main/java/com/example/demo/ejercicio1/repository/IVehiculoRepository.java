package com.example.demo.ejercicio1.repository;

import com.example.demo.ejercicio1.modelo.Vehiculo;

public interface IVehiculoRepository {

	
	public Vehiculo buscar(String placa);
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public void borrar(String placa);
}
