package com.example.demo.banco.repository;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	//Siempre vamos a construir el CRUD
			public Transferencia buscar(Integer id);
			
			//principal
			public void actualizar(Transferencia transferencia); 
			public void insertar(Transferencia transferencia);
			public void borrar(Integer id);

	

}
