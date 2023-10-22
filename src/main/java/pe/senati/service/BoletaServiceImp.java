package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.BoletaVenta;
import pe.senati.repository.BoletaRepository;

@Service
public class BoletaServiceImp implements BoletaService
{
	@Autowired
	private BoletaRepository repository;
	
	@Override
	@Transactional
	public void insert(BoletaVenta boletaventa) {
		repository.save(boletaventa);		
	}

	@Override
	@Transactional
	public void update(BoletaVenta boletaventa) {
		repository.save(boletaventa);			
	}

	@Override
	@Transactional
	public void delete(Integer boletaventaId) {
		repository.deleteById(boletaventaId);	
	}

	@Override
	@Transactional(readOnly=true)
	public BoletaVenta findById(Integer boletaventaId) {
		return repository.findById(boletaventaId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<BoletaVenta> findAll() {
		return repository.findAll();
	}
}
