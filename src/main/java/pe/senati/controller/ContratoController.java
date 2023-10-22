package pe.senati.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pe.senati.entity.ContratoCred;
import pe.senati.service.ClienteService;
import pe.senati.service.ContratoService;

@Controller
public class ContratoController 
{
	@Autowired
	private ContratoService contratoService;
	
	@Autowired
	private ClienteService clienteService;
	
	public ContratoController() {}
	
	@GetMapping("/contratos")
	public String listar_GET(Map<String, Collection<?>> map)
	{
		map.put("bContratos",contratoService.findAll());
		
		return "Contrato/listar";
	}
	
	@GetMapping("/contrato/registrar")
	public String registrar_GET(Model model, Map<String, Collection<?>> map)
	{
		ContratoCred contratoNull=new ContratoCred();
		model.addAttribute("contrato",contratoNull);
		
		map.put("bClientes", clienteService.findAll());
		
		return "Contrato/registrar";
	}
	
	@PostMapping("/contrato/registrar")
	public String registrar_POST(ContratoCred contratocred)
	{
		//guardar en la BD
		contratoService.insert(contratocred);
		
		return "redirect:/contratos";
	}
	
	@GetMapping("/contrato/editar/{contratocredId}")
	public String editar_GET(Model model, Map<String, Collection<?>> map, @PathVariable Integer contratocredId)
	{
		ContratoCred contratoBD=contratoService.findById(contratocredId);
		model.addAttribute("contrato",contratoBD);
		
		map.put("bClientes", clienteService.findAll());

		return "Contrato/editar";
	}

	@PostMapping("/contrato/editar/{contratocredId}")
	public String editar_POST(ContratoCred contratocred)
	{
		//Actualizar en la BD
		contratoService.update(contratocred);

		return "redirect:/contratos";
	}
	
	@GetMapping("/contrato/eliminar/{contratocredId}")
	public String borrar_GET(Model model,Map<String, Collection<?>> map,@PathVariable Integer contratocredId)
	{
		ContratoCred contratoBD=contratoService.findById(contratocredId);
		model.addAttribute("contrato",contratoBD);
		
		map.put("bClientes", clienteService.findAll());

		return "Contrato/eliminar";
	}

	@PostMapping("/contrato/eliminar/{contratocredId}")
	public String borrar_POST(ContratoCred contratocred)
	{

		contratoService.delete(contratocred.getContratocredId());

		return "redirect:/contratos";
	}
}
