package model.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import model.entity.Historial;

@Repository
public interface IHistorialRepository extends JpaRepository<Historial, Integer> {

    @Query("SELECT h FROM Historial h JOIN FETCH h.paciente p JOIN FETCH h.doctor d ORDER BY h.id ASC")
    List<Historial> findAllOrderByAscId();

}
