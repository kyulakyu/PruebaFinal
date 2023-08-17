package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="especialidades")
public class Especialidad  {
	// se crean los atributos de la clase Usuario
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
	private String nombre;
	
	// se crea el constructor vacio
	public Especialidad() {
	}

	public Especialidad(int id) {
		this.id = id;
	}
	
	public Especialidad(String nombre) {
		this.nombre = nombre;
	}

	
	// se crea el constructor con todos los atributos de la clase
	public Especialidad(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// se crean los metodos de acceso y modificadores de yodos los atributos
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Especialidad [nombre=" + nombre + "]";
	}
}