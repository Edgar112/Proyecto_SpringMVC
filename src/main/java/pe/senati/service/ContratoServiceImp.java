package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.ContratoCred;
import pe.senati.repository.ContratoRepository;

@Service
public class ContratoServiceImp implements ContratoService
{
	@Autowired
	private ContratoRepository repository;

	@Override
	@Transactional
	public void insert(ContratoCred contratocred) {
		repository.save(contratocred);		
	}

	@Override
	@Transactional
	public void update(ContratoCred contratocred) {
		repository.save(contratocred);			
	}

	@Override
	@Transactional
	public void delete(Integer contratocredId) {
		repository.deleteById(contratocredId);	
	}

	@Override
	@Transactional(readOnly=true)
	public ContratoCred findById(Integer contratocredId) {
		return repository.findById(contratocredId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<ContratoCred> findAll() {
		return repository.findAll();
	}
}
