package com.example.demo.ejercicio1.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ejercicio1.modelo.Vehiculo;
import com.example.demo.ejercicio1.repository.IVehiculoRepository;

@Service("liviano")
public class MatriculaNuevaLivianoServiceImpl implements IMatriculaNuevaService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Override
	public BigDecimal matricular(BigDecimal precio) {
		// TODO Auto-generated method stub

		BigDecimal valor = precio.multiply(new BigDecimal(0.10));
	    return valor;
	}

}
