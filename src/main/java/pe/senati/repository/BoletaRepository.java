package pe.senati.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.senati.entity.BoletaVenta;

public interface BoletaRepository extends JpaRepository<BoletaVenta, Integer>
{

}
