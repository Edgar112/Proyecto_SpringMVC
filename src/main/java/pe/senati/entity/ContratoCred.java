package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "contratocredito")
public class ContratoCred implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer contratocredId;
	
	@OneToOne
	@JoinColumn(name="cliente_id", unique=true, nullable=false)
	private Cliente cliente;
	
	@DateTimeFormat(pattern="yyyy-MM-dd",iso=ISO.DATE)
	private LocalDate fechainicio;
	
	@Column
	private Double montocredito;
	
	//Constructr sin propiedades
	public ContratoCred() {}

	//constructor con propiedades
	public ContratoCred(Integer contratocredId, LocalDate fechainicio, Double montocredito) {
		this.contratocredId = contratocredId;
		this.fechainicio = fechainicio;
		this.montocredito = montocredito;
	}

	//Encapsulamiento de las propiedades
	public Integer getContratocredId() {
		return contratocredId;
	}

	public void setContratocredId(Integer contratocredId) {
		this.contratocredId = contratocredId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFechainicio() {
		return fechainicio;
	}

	public void setFechainicio(LocalDate fechainicio) {
		this.fechainicio = fechainicio;
	}

	public Double getMontocredito() {
		return montocredito;
	}

	public void setMontocredito(Double montocredito) {
		this.montocredito = montocredito;
	}
	
}
