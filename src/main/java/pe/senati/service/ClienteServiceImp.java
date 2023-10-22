package pe.senati.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.senati.entity.Cliente;
import pe.senati.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService
{
	@Autowired
	private ClienteRepository repository;

	@Override
	@Transactional
	public void insertar(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	@Transactional
	public void actualizar(Cliente cliente) {
		repository.save(cliente);
	}

	@Override
	@Transactional
	public void eliminar(Integer clienteId) {
		repository.deleteById(clienteId);
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Integer clienteId) {
		return repository.findById(clienteId).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public Collection<Cliente> findAll() {
		return repository.findAll();
	}

}
