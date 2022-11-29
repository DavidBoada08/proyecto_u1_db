package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	//principal
	public CuentaBancaria buscarPorNumero(String numeroCuenta);
	
	//public void actualizar(CuentaBancaria cuentaBancaria);
	
	
	//Siempre vamos a construir el CRUD
	public CuentaBancaria buscar(Integer id);
	
	//principal
	public void actualizar(CuentaBancaria cuentaBancaria); 
	public void insertar(CuentaBancaria cuentaBancaria);
	public void borrar(Integer id);

}
