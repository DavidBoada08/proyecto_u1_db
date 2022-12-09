package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;

public interface iTransferenciaService {

	public Transferencia buscar(Integer id);

	public void actualizar(Transferencia transferencia);

	public void insertar(Transferencia transferencia);

	public void borrar(Integer id);

	// CONSTRUIR crud

	public List<Transferencia> buscarReporte();

	public void realizar(String numOrigen, String numDestino, BigDecimal monto);

}
