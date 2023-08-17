package model.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.entity.Historial;
import model.entity.Paciente;
import model.service.HistorialService;
import model.service.PacienteService;


@RestController
public class RestPacienteController {

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private HistorialService historialService; // Inyectar el servicio CapacitacionService

    @RequestMapping(value="/api/pacientes", headers="Accept=application/json")
    public List<Paciente> getAllPacientes(){
        return pacienteService.getAllPacientes();
    }
    
    @RequestMapping(value="/api/historias", headers="Accept=application/json")
    public List<Historial> getAllHistorias(){
        return historialService.getAllHistorias();
    }

}
