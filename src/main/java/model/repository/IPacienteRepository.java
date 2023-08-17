package model.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import model.entity.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Integer>{
	@Query("SELECT p FROM Paciente p")
	List<Paciente> findAllPacientes();

}
