package com.example.demo.tradicional;

import java.time.LocalDateTime;

import javax.annotation.processing.SupportedSourceVersion;

public class CitaMedica {

	   private String numero;
	    private LocalDateTime fechaCita;
	    private LocalDateTime fechaAgenda;
	    private Medico medico;
	    private Paciente paciente;
	


	   public void agendar(String numero, LocalDateTime fechaCita, String nombreMedico, String cedMedico,
	            String nombrePaciente, String cedulaPaciente, String tipo) {

	       	this.numero=numero;
	        this.fechaCita=fechaCita;
	        this.fechaAgenda = LocalDateTime.now();
	        
	        Medico medObjeto = new Medico();
	        medObjeto.setCedula(cedMedico);
	        medObjeto.setNombre(nombreMedico);
	        
	        this.medico= medObjeto;
	       
	        //Tercera edad (TE) ninio (n)
	        if(tipo.equals("TE")) {
	        	PacienteTerceraEdad pacienteTE = new PacienteTerceraEdad();
	        	pacienteTE.setCodigoIESS("234234");
	        
	        	pacienteTE.setTipo("TE");
	        	        	
	        	this.paciente = pacienteTE;
	        	
	        	System.out.println("Paciente con Descuento");
	        } if (tipo.equals("N")) {
	        	PacienteNinio pacienteNinio = new PacienteNinio();
	        	pacienteNinio.setPesoNacimiento("5");
	        
	        	pacienteNinio.setTipo("N");
	        	
	        	this.paciente = pacienteNinio;
	        	System.out.println("Paciente sin Descuento");
	        } else {
	        	PacienteCancer pc = new  PacienteCancer();
	        	
	        	
	        	
	        }
	        	
	        
	        this.paciente.setNombre(nombrePaciente);
	        this.paciente.setCedula(cedulaPaciente);
	  
	        this.guardarCita(this);
	        
	    }



	   private void guardarCita(CitaMedica cita) {
	        
	        //Insertar en la base de datos, guardar cita
	        System.out.println(cita);
	    }
	    
	    @Override
	    public String toString() {
	        return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
	                + ",\n\tMEDICO" + medico + "\tPACIENTE" + paciente ;
	    }



	   // SET y GET
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



	   public Medico getMedico() {
	        return medico;
	    }



	   public void setMedico(Medico medico) {
	        this.medico = medico;
	    }



	   public Paciente getPaciente() {
	        return paciente;
	    }



	   public void setPaciente(Paciente paciente) {
	        this.paciente = paciente;
	    }


	
	
	
	
}
