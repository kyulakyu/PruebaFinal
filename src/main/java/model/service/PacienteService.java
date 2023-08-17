package model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.entity.Paciente;

import model.repository.IPacienteRepository;

@Service
public class PacienteService {
    @Autowired
    private IPacienteRepository usRepo;

    public PacienteService() {
        super();
    }

    public List<Paciente> getUsuarios() {
        return usRepo.findAll();
    }

    public Paciente crearUsuario(Paciente p) {
    	Paciente usuarioGuardado = null;

        if (p instanceof Paciente) {
            usuarioGuardado = usRepo.save((Paciente) p);
        } else {
            // Aquí puedes manejar cualquier otro tipo de usuario que puedas tener.
            throw new IllegalArgumentException("Tipo de usuario no válido.");
        }

        return usuarioGuardado;
    }

    public List<Paciente> getAllPacientes() {
        return usRepo.findAll();
    }

}

