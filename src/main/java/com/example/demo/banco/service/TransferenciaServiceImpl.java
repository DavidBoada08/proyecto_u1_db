package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.iTransferenciaRepository;


@Service
public class TransferenciaServiceImpl implements iTransferenciaService {

	@Autowired
	private iTransferenciaRepository transferencia;

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.transferencia.buscarTodo();
	}

	@Override
	public void realizar(String numOrigen, String numDestino, BigDecimal monto) {
		// ORIGEN
		// paso 1: buscar la cuenta Origen
		// paso 2: Consultar el saldo
		// paso 3: operacion (operacion resta origen)
		// paso 4: actualizar cuenta origen

		CuentaBancaria bancariaOrigen = this.bancariaService.buscarPorNumero(numOrigen);
		BigDecimal SaldoOrigen = bancariaOrigen.getSaldo();
		BigDecimal nuevoSaldo = SaldoOrigen.subtract(monto);
		bancariaOrigen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(bancariaOrigen);
		// DESTINO
		// paso 1: buscar la cuenta Destino
		// paso 2: Consultar el saldo
		// paso 3: operacion (operacion suma origen)
		// paso 4: actualizar cuenta Destino
		CuentaBancaria bancariaDestino = this.bancariaService.buscarPorNumero(numDestino);
		BigDecimal SaldoDestino = bancariaDestino.getSaldo();
		BigDecimal nuevoSaldoD = SaldoDestino.add(monto);
		bancariaDestino.setSaldo(nuevoSaldoD);
		this.bancariaService.actualizar(bancariaDestino);
		this.transferencia.actualizar(null);

		Transferencia trans = new Transferencia();
		trans.setCuentaDestino(numDestino);
		trans.setCuentaOrigen(numOrigen);
		trans.setFecha(LocalDate.now());
		trans.setMonto(monto);
		trans.setNumero("13425");
		this.transferencia.insertar(trans);
	}

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

}
