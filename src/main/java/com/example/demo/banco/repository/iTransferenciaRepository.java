package com.example.demo.banco.repository;

import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface iTransferenciaRepository {

	// CRUD: siempre hasta tener experiencia

	public Transferencia buscar(Integer id);

	public void actualizar(Transferencia tranferencia);

	public void insertar(Transferencia tranferencia);

	public void borrar(Integer id);

	public List<Transferencia> buscarTodo();
}
