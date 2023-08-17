package model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;


import model.entity.Historial;
import model.service.HistorialService;

@Controller
public class EditarController {
	@Autowired
	private HistorialService hs ;
	
	 
	  @GetMapping("/EditarHistorial")
	  public String editarHistorial(@RequestParam("id") int id, Model model) {
	     
	         
	          Historial historial = hs.getHistorialWithProperties(id);
	          if (historial != null) {
	              
	              model.addAttribute("historial", historial);
	              return "editarHistorial"; // Nombre de la página de edición JSP
	          } else {
	              return "redirect:/"; // Redirigir si no se encuentra el administrativo
	          }
	      
	  }
	 
	    @PostMapping("/GuardarEdicionHistorial")
	    public String guardarEdicionHistorial(@ModelAttribute Historial historial) {
	        hs.update(historial);
	        return "redirect:/ListarUsuarios"; // Redirigir después de guardar los cambios
	    }
	    
}
