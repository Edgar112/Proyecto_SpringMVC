package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Cliente;

public interface ClienteService
{
	//Se define los servicios
	public abstract void insertar(Cliente cliente);
	public abstract void actualizar(Cliente cliente);
	public abstract void eliminar(Integer clienteId);
	public abstract Cliente findById(Integer clienteId);
	public abstract Collection<Cliente> findAll();
}
