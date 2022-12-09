package com.example.demo.banco.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements iTransferenciaRepository {

	private List<Transferencia> baseDatos = new ArrayList<>();

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub

		return null;
	}

	@Override
	public void actualizar(Transferencia tranferencia) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertar(Transferencia tranferencia) {
		// TODO Auto-generated method stub
		baseDatos.add(tranferencia);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Transferencia> buscarTodo() {
		// TODO Auto-generated method stub
		return baseDatos;
	}

}
