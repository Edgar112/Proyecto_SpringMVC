package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.ContratoCred;

public interface ContratoService 
{
	//Se define los servicios
		public abstract void insert(ContratoCred contratocred);
		public abstract void update(ContratoCred contratocred);
		public abstract void delete(Integer contratocredId);
		public abstract ContratoCred findById(Integer contratocredId);
		public abstract Collection<ContratoCred> findAll();
}
