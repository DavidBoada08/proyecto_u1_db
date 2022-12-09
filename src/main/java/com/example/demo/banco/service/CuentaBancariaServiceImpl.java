package com.example.demo.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Override
	public CuentaBancaria buscarPorNumero(String numCuenta) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscarPorNumero(numCuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub

		this.bancariaRepository.actualizar(cuentaBancaria);

	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.insertar(cuentaBancaria);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.bancariaRepository.borrar(id);

	}

}
