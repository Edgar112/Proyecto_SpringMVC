package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.senati.entity.ContratoCred;

public interface ContratoRepository extends JpaRepository<ContratoCred, Integer>
{

}
