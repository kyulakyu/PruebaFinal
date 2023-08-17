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
import javax.persistence.Table;


@Entity
@Table(name="citas")
public class Cita  {
	// se crean los atributos de la clase Usuario
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private int id;
    @ManyToOne
    @JoinColumn(name = "Paciente_ID")
    private int pacienteid;

    @ManyToOne
    @JoinColumn(name = "Doctor_ID")
    private int doctorid;

    private String fecha;

    @ManyToOne
    @JoinColumn(name = "Factura_ID")
    private int facturaid;

	
	// se crea el constructor vacio
	public Paciente() {
	}

	public Paciente(int id) {
		this.id = id;
	}
	
	public Paciente(String nombre) {
		this.nombre = nombre;
	}
	
	// se crea el constructor con todos los atributos de la clase
	public Paciente(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public boolean setFechaNacimiento(String fechaNacimiento) {
	    if (fechaNacimiento == null) {
	        return false; // La fecha es nula, formato incorrecto
	    }

	    String formatoFecha = "dd/MM/yyyy";
	    SimpleDateFormat sdf = new SimpleDateFormat(formatoFecha);
	    sdf.setLenient(false); // Evita la flexibilidad en el análisis de fechas

	    try {
	        sdf.parse(fechaNacimiento);
	        this.fechaNacimiento = fechaNacimiento;
	        return true; // La fecha tiene el formato correcto y fue establecida correctamente
	    } catch (ParseException e) {
	        return false; // La fecha no tiene el formato correcto
	    }
	}

	// se crea metodo toString
	public String toString() {
		return "Paciente [nombre=" + nombre + ", fechaDeNacimiento=" + fechaNacimiento + "]";
	}

	public void mostrarEdad() {

		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(fechaNac, ahora);
		int edad = periodo.getYears();
		System.out.println("El Paciente tiene " + edad + " años");
	}
}