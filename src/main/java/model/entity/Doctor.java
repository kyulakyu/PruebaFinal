package model.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="doctores")
public class Doctor  {
	// se crean los atributos de la clase Usuario
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	
	private String nombre;
	
    @ManyToOne
    @JoinColumn(name = "Especialidad_ID")
	private int especialidadId;
    
	private int experiencia;
	
	// se crea el constructor vacio
	public Doctor() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEspecialidadId() {
		return especialidadId;
	}

	public void setEspecialidadId(int especialidadId) {
		this.especialidadId = especialidadId;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean setNombre(String nombre) {
		this.nombre = nombre;
		if (nombre != null && !nombre.isEmpty()) {
			return true; // El nombre se estableció correctamente
		} else {
			return false; // El nombre es inválido
		}
	}

	
	// se crea metodo toString
	public String toString() {
		return "Doctor [nombre=" + nombre + ", Especialidad=" + especialidadId + ", experiencia=" + experiencia + "]";
	}
}