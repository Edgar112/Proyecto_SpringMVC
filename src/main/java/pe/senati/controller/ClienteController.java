package pe.senati.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pe.senati.entity.Cliente;
import pe.senati.service.ClienteService;

@Controller
public class ClienteController
{
	@Autowired
	private ClienteService clienteService;

	public ClienteController() {}

	@GetMapping("/clientes")
	public String listar_GET(Map<String, Collection<?>> map)
	{
		map.put("bClientes", clienteService.findAll());
		return "Cliente/listar";
	}

	@GetMapping("/cliente/registrar")
	public String registrar_GET(Model model)
	{
		Cliente clienteNull=new Cliente();
		model.addAttribute("cliente",clienteNull);

		return "Cliente/registrar";
	}

	@PostMapping("/cliente/registrar")
	public String registrar_POST(Cliente cliente)
	{
		//Registro en la BD
		clienteService.insertar(cliente);

		return "redirect:/clientes";
	}

	@GetMapping("/cliente/editar/{clienteId}")
	public String editar_GET(Model model,@PathVariable Integer clienteId)
	{
		Cliente clienteBD=clienteService.findById(clienteId);
		model.addAttribute("cliente",clienteBD);

		return "Cliente/editar";
	}

	@PostMapping("/cliente/editar/{clienteId}")
	public String editar_POST(Cliente cliente)
	{
		//Actualizar en la BD
		clienteService.actualizar(cliente);

		return "redirect:/clientes";
	}

	@GetMapping("/cliente/eliminar/{clienteId}")
	public String borrar_GET(Model model,@PathVariable Integer clienteId)
	{
		Cliente clienteBD=clienteService.findById(clienteId);
		model.addAttribute("cliente",clienteBD);

		return "Cliente/eliminar";
	}

	@PostMapping("/cliente/eliminar/{clienteId}")
	public String borrar_POST(Cliente cliente)
	{

		clienteService.eliminar(cliente.getClienteId());

		return "redirect:/clientes";
	}
}
