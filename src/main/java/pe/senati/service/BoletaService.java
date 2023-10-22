package pe.senati.service;

import java.util.Collection;

import pe.senati.entity.BoletaVenta;

public interface BoletaService 
{
	//Se define los servicios
			public abstract void insert(BoletaVenta boletaventa);
			public abstract void update(BoletaVenta boletaventa);
			public abstract void delete(Integer boletaventaId);
			public abstract BoletaVenta findById(Integer boletaventaId);
			public abstract Collection<BoletaVenta> findAll();
}
