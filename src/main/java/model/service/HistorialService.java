package model.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Historial;
import model.repository.IHistorialRepository;

@Service
public class HistorialService {

    private final IHistorialRepository adRepo;

    @Autowired
    public HistorialService(IHistorialRepository adRepo) {
        this.adRepo = adRepo;
    }

    public List<Historial> getAllHistorias() {
        return adRepo.findAll();
    }

    public void update(Historial h) {
		adRepo.save(h);
	}
    @Transactional
    public Historial getHistorialWithProperties(int id) {
    	Historial historial = adRepo.findById(id).orElse(null);
        
        if (historial != null) {
            // Cargar propiedades relacionadas adicionales aquí
        	historial.getId();
            
            // Puedes hacer más operaciones para cargar otras propiedades
            
            return historial;
        } else {
            throw new EntityNotFoundException("Historial con id " + id + " no encontrado");
        }
    }
}