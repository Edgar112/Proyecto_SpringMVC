package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "boletaventa")
public class BoletaVenta implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer boletaventaId;
	
	@Column
	private String numboletaventa;
	
	@DateTimeFormat (pattern = "yyyy-MM-dd", iso = ISO.DATE)//Indicamos el formato de la Fecha de registro
	private LocalDate fechaemision;
	
	@ManyToOne
	@JoinColumn(name="cliente_id", nullable = false)
	private Cliente cliente;
	
	@Column
	private Integer cantidad;
	
	@Column
	private Double precio;
	
	@Column
	private Double total;
	
	//Constructor sin Propiedades
	public BoletaVenta() {}
	
	//Constructor con Propiedades
	public BoletaVenta(Integer boletaventaId, String numboletaventa, LocalDate fechaemision, Integer cantidad, Double precio, Double total) {
		this.boletaventaId = boletaventaId;
		this.numboletaventa = numboletaventa;
		this.fechaemision = fechaemision;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
	}

	//Encapsulamiento de Propiedades
	public Integer getBoletaventaId() {
		return boletaventaId;
	}

	public void setBoletaventaId(Integer boletaventaId) {
		this.boletaventaId = boletaventaId;
	}

	public String getNumboletaventa() {
		return numboletaventa;
	}

	public void setNumboletaventa(String numboletaventa) {
		this.numboletaventa = numboletaventa;
	}

	public LocalDate getFechaemision() {
		return fechaemision;
	}

	public void setFechaemision(LocalDate fechaemision) {
		this.fechaemision = fechaemision;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
}
