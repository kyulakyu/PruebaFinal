package model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Historia_Clinica")
public class Historial  {
	// se crean los atributos de la clase Usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn(name = "Paciente_ID")
    private int pacienteId;

    @JoinColumn(name = "Doctor_ID")
    private int doctorId;

    @Column(name = "Fecha_Cita")
    private String fechaCita;

    private String sintomas;
    private String diagnostico;
    private String tratamiento;
    
	// se crea el constructor vacio
	public Historial() {
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPacienteid() {
		return pacienteId;
	}
	public void setPacienteid(int pacienteid) {
		this.pacienteId = pacienteid;
	}
	public int getDoctorid() {
		return doctorId;
	}
	public void setDoctorid(int doctorid) {
		this.doctorId = doctorid;
	}
	public String getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}


    
}