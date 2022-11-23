package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// correccion

		PacienteTerceraEdadH pacienteTE = new PacienteTerceraEdadH();
		pacienteTE.setCedula("12345678");
		pacienteTE.setCodigoIESS("122458");
		pacienteTE.setNombre("Daniel");
		pacienteTE.setTipo("TE");

		MedicoH mh = new MedicoH();
		mh.setCedula("123");
		mh.setNombre("Diana");

		CitaMedicaH cita = new CitaMedicaH();

		cita.agendar("123123", LocalDateTime.of(2022, 12, 2, 8, 30), pacienteTE, mh);

	}

}
