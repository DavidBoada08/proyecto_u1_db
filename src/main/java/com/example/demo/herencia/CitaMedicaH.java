package com.example.demo.herencia;

import java.time.LocalDateTime;

public class CitaMedicaH {

	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private MedicoH medicoH;
	private PacienteH pacienteH;

	public void agendar(String numero, LocalDateTime fechaCita, PacienteH ph,  MedicoH mh) {

		this.numero = numero;
		this.fechaCita = fechaCita;
		this.fechaAgenda = LocalDateTime.now();

		Integer valorDescuento = ph.carcularDescuento();
		System.out.println("Valor " + valorDescuento);
		
		this.medicoH = mh;

		this.guardarCita(this);

	}

	private void guardarCita(CitaMedicaH cita) {

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

	public MedicoH getMedicoH() {
		return medicoH;
	}

	public void setMedicoH(MedicoH medicoH) {
		this.medicoH = medicoH;
	}

	public PacienteH getPacienteH() {
		return pacienteH;
	}

	public void setPacienteH(PacienteH pacienteH) {
		this.pacienteH = pacienteH;
	}

	@Override
	public String toString() {
		return "CitaMedicaH [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medicoH=" + medicoH + ", pacienteH=" + pacienteH + "]";
	}

	// SET y GET

}
