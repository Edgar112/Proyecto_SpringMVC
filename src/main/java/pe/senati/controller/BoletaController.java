package pe.senati.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pe.senati.entity.BoletaVenta;
import pe.senati.service.BoletaService;
import pe.senati.service.ClienteService;

@Controller
public class BoletaController 
{
	@Autowired
	private BoletaService boletaService;
	
	@Autowired
	private ClienteService clienteService;
	
	public BoletaController() {}
	
	@GetMapping("/boletas")
	public String listar_GET(Map<String, Collection<?>> map)
	{
		map.put("bBoletas",boletaService.findAll());
		
		return "Boleta/listar";
	}
	
	@GetMapping("/boleta/registrar")
	public String registrar_GET(Model model, Map<String, Collection<?>> map)
	{
		BoletaVenta boletaNull=new BoletaVenta();
		model.addAttribute("boleta",boletaNull);
		
		map.put("bClientes", clienteService.findAll());
		
		return "Boleta/registrar";
	}
	
	@PostMapping("/boleta/registrar")
	public String registrar_POST(BoletaVenta boletaventa)
	{
		//guardar en la BD
		boletaService.insert(boletaventa);
		
		return "redirect:/boletas";
	}
	
	@GetMapping("/boleta/editar/{boletaventaId}")
	public String editar_GET(Model model, Map<String, Collection<?>> map, @PathVariable Integer boletaventaId)
	{
		BoletaVenta boletaBD=boletaService.findById(boletaventaId);
		model.addAttribute("boleta",boletaBD);
		
		map.put("bClientes", clienteService.findAll());

		return "Boleta/editar";
	}

	@PostMapping("/boleta/editar/{boletaventaId}")
	public String editar_POST(BoletaVenta boletaventa)
	{
		//Actualizar en la BD
		boletaService.update(boletaventa);

		return "redirect:/boletas";
	}
	
	@GetMapping("/boleta/eliminar/{boletaventaId}")
	public String borrar_GET(Model model,Map<String, Collection<?>> map,@PathVariable Integer boletaventaId)
	{
		BoletaVenta boletaBD=boletaService.findById(boletaventaId);
		model.addAttribute("boleta",boletaBD);
		
		map.put("bClientes", clienteService.findAll());

		return "Boleta/eliminar";
	}

	@PostMapping("/boleta/eliminar/{boletaventaId}")
	public String borrar_POST(BoletaVenta boletaventa)
	{

		boletaService.delete(boletaventa.getBoletaventaId());

		return "redirect:/boletas";
	}

}
