package pe.senati.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pe.senati.entity.Neumatico;
import pe.senati.service.NeumaticoService;

@Controller
public class NeumaticoController 
{
	@Autowired
	private NeumaticoService neumaticoService;
	
	public NeumaticoController() {}
	
	@GetMapping("/neumaticos")
	public String listar_GET(Map<String, Collection<?>> map)
	{
		map.put("bNeumaticos", neumaticoService.findAll());
		
		return "Neumatico/listar";
	}
	
	@GetMapping("/neumatico/registrar")
	public String registrar_GET(Model model)
	{
		Neumatico neumaticoNull = new Neumatico();
		model.addAttribute("Neumatico", neumaticoNull);
		
		return "Neumatico/registrar";
	}
	
	@PostMapping("/neumatico/registrar")
	public String registrar_POST(Neumatico neumatico)
	{
		neumaticoService.insertar(neumatico);
		
		return "redirect:/neumaticos";
	}
	
	@GetMapping("/neumatico/editar/{neumaticoId}")
	public String editar_GET(Model model,@PathVariable Integer neumaticoId)
	{
		Neumatico neumaticoBD = neumaticoService.findById(neumaticoId);
		model.addAttribute("neumatico", neumaticoBD);
		
		return "Neumatico/editar";
	}
	
	@PostMapping("/neumatico/editar/{neumaticoId}")
	public String editar_POST(Neumatico neumatico)
	{
		neumaticoService.editar(neumatico);
		return "redirect:/neumaticos";
	}
	
	@GetMapping("/neumatico/eliminar/{neumaticoId}")
	public String borrar_GET(Model model,@PathVariable Integer neumaticoId)
	{
		Neumatico neumaticoBD=neumaticoService.findById(neumaticoId);
		model.addAttribute("neumatico",neumaticoBD);

		return "Neumatico/eliminar";
	}

	@PostMapping("/neumatico/eliminar/{neumaticoId}")
	public String borrar_POST(Neumatico neumatico)
	{

		neumaticoService.eliminar(neumatico.getNeumaticoId());

		return "redirect:/neumaticos";
	}
}
