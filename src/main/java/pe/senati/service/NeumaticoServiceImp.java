package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Neumatico;
import pe.senati.repository.NeumaticoRepository;

@Service
public class NeumaticoServiceImp implements NeumaticoService
{
	@Autowired
	private NeumaticoRepository repository;
	
	@Override
	@Transactional
	public void insertar(Neumatico neumatico) {
		repository.save(neumatico);	
	}
	
	@Override
	@Transactional
	public void editar(Neumatico neumatico) {
		repository.save(neumatico);	
	}
	
	@Override
	@Transactional
	public void eliminar(Integer neumaticoId) {
		repository.deleteById(neumaticoId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Neumatico findById(Integer neumaticoId) {
		return repository.findById(neumaticoId).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Collection<Neumatico> findAll() {
		return repository.findAll();
	}

}
