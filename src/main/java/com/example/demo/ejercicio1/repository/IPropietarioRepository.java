package com.example.demo.ejercicio1.repository;

import com.example.demo.ejercicio1.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void insertar(Propietario propietario);
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);

}
