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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPacienteid() {
		return pacienteid;
	}

	public void setPacienteid(int pacienteid) {
		this.pacienteid = pacienteid;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getFacturaid() {
		return facturaid;
	}

	public void setFacturaid(int facturaid) {
		this.facturaid = facturaid;
	}

    
}