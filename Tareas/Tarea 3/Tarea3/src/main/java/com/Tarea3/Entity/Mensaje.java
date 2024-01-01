package com.Tarea3.Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mensajes")
public class Mensaje
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "m_id")
    private Integer m_id;
	
	@Column(name = "destinatario")
	private String destinatario;
	
	@Column(name = "remitente")
	private String remitente;
	
	@Column(name = "copia")
	private String copia;
	
	@Column(name = "texto")
	private String texto;
	
	@Column(name = "fecha")
	private String fecha;

	public Mensaje() {}

	public Mensaje(Integer m_id, String destinatario, String remitente, String texto, String copia,String fecha)
	{
	  this.m_id = m_id;
	  this.remitente = remitente;
	  this.copia = copia;
	  this.destinatario = destinatario;
	  this.texto = texto;
	  this.fecha = fecha;
	}

	public Integer getM_id() {
		return m_id;
	}

	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCopia() {
		return copia;
	}

	public void setCopia(String copia) {
		this.copia = copia;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setFecha( String fecha )
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		fecha = dtf.format(LocalDateTime.now());
	}

	public String getFecha()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		fecha = dtf.format(LocalDateTime.now());
		return this.fecha;
	}
	  
}
