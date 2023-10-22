package pe.senati.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "neumaticos")
public class Neumatico implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer neumaticoId;
	
	@Column
	private String descripcion;
	
	@Column
	private String marca;
	
	@Column
	private String tipo;
	
	@Column
	private Integer stock;
	
	@Column
	private Double precio;
	
	@ManyToMany
	@JoinTable(name="neumaticos_clientes",
		joinColumns=@JoinColumn(name="neumatico_id"),
		inverseJoinColumns=@JoinColumn(name="cliente_id"))
	private Set<Cliente> itemsCliente=new HashSet<>();
	
	//Constructor sin Propiedades
	public Neumatico() {}
	
	//Constructor con Propiedades
	public Neumatico(Integer neumaticoId, String descripcion, String marca, String tipo, Integer stock, Double precio) {
		this.neumaticoId = neumaticoId;
		this.descripcion = descripcion;
		this.marca = marca;
		this.tipo = tipo;
		this.stock = stock;
		this.precio = precio;
	}
	
	//Encapsulamiento de las Propiedades
	public Integer getNeumaticoId() {
		return neumaticoId;
	}

	public void setNeumaticoId(Integer neumaticoId) {
		this.neumaticoId = neumaticoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Set<Cliente> getItemsCliente() {
		return itemsCliente;
	}

	public void setItemsCliente(Set<Cliente> itemsCliente) {
		this.itemsCliente = itemsCliente;
	}
	
}
