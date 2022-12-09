package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoriImpl implements ICuentaBancariaRepository {

	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();

	@Override
	public CuentaBancaria buscarPorNumero(String numCuenta) {
		// TODO Auto-generated method stub
		// SELECT *FROM CUENTA C WHERE C.NUMERO = numCuenta
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNumero(numCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		cuenta.setTitular("Serghy C.");
		for (CuentaBancaria cb : baseCuentas) {
			if (cb.getNumero().equals(numCuenta)) {
				cuenta = cb;
			}
		}

		System.out.println("se actualiza la cuenta: " + numCuenta);

		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {

		System.out.println("se esta buscando la cuenta: " + id);
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {

		CuentaBancaria cuenta = null;
		for (CuentaBancaria cb : baseCuentas) {
			if (cb.getNumero().equals(cuentaBancaria.getNumero())) {
				cuenta = cb;
			}
		}
		
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		System.out.println("se actualiza la cuenta: " + cuentaBancaria);

	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		System.out.println("se inserta la cuenta: " + cuentaBancaria);

		// TODO Auto-generated method stub
		baseCuentas.add(cuentaBancaria);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("se actualiza la cuenta: " + id);

	}

}
