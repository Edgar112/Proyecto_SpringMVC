package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.Neumatico;

public interface NeumaticoService 
{
	//Se definen los Servicios
	public abstract void insertar(Neumatico neumatico);
	public abstract void editar(Neumatico neumatico);
	public abstract void eliminar(Integer neumaticoId);
	public abstract Neumatico findById(Integer neumaticoId);
	public abstract Collection<Neumatico> findAll();
}
