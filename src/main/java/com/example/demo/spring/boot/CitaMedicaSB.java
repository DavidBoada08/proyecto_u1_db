package com.example.demo.spring.boot;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service

public class CitaMedicaSB {

	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoSB medicoH;
	private PacienteSB pacienteH;

	public void agendar(String numero, LocalDateTime fechaCita, PacienteSB ph,  MedicoSB mh) {

		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();

		Integer valorDescuento = ph.carcularDescuento();
		System.out.println("Valor " + valorDescuento);
		
		this.medicoH = mh;
		this.guardarCita(this);

	}

	private void guardarCita(CitaMedicaSB cita) {

		// Insertar en la base de datos, guardar cita
		System.out.println(cita);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}

	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}

	public MedicoSB getMedicoH() {
		return medicoH;
	}

	public void setMedicoH(MedicoSB medicoH) {
		this.medicoH = medicoH;
	}

	public PacienteSB getPacienteH() {
		return pacienteH;
	}

	public void setPacienteH(PacienteSB pacienteH) {
		this.pacienteH = pacienteH;
	}

	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medicoH=" + medicoH + ", pacienteH=" + pacienteH + "]";
	}

	// SET y GET

}
