package model.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.entity.Historial;
import model.service.HistorialService;

@Controller
public class HistorialController {

    @Autowired
    private HistorialService cs;

    @Autowired
    private RestPacienteController restPacienteController; // Inyectar el servicio RestPacienteController

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     * 
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
    @RequestMapping(path = "/CrearHistorial", method = RequestMethod.GET)
    public ModelAndView mostrarCrearHistorial() {
        return new ModelAndView("crearHistorial");
    }

    @RequestMapping(path = "/ListarHistorial", method = RequestMethod.GET)
    public ModelAndView mostrarListarHistorial() {
        try {
            List<Historial> Historial = cs.getAllHistorias();

            ModelAndView modelAndView = new ModelAndView("listarHistorial", "Historial", Historial);
            return modelAndView;
        } catch (EntityNotFoundException ex) {
            // Handle the exception (e.g., show an error message)
            return new ModelAndView("errorPage", "errorMessage", "Historial not found");
        }
    }

	public RestPacienteController getRestPacienteController() {
		return restPacienteController;
	}

	public void setRestPacienteController(RestPacienteController restPacienteController) {
		this.restPacienteController = restPacienteController;
	}
}
