package pe.senati.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer clienteId;//Se genera automáticamente el campo cliente_id
	
	@Column
	private String nombre;
	
	@Column
	private Integer dni;
	
	@Column
	private String direccion;
	
	@Column
	private Integer telefono;
	
	//Indicamos el formato de la Fecha de registro
	@DateTimeFormat(pattern = "yyyy-MM-dd",iso = ISO.DATE)
	private LocalDate fecharegistro;
	
	@Column
	private String correo;
	
	@OneToOne (mappedBy = "cliente")
	private ContratoCred contratocred;
	
	@OneToMany(mappedBy="cliente")
	private Collection<BoletaVenta> itemsBoletaVenta=new ArrayList<>();
	
	@ManyToMany(mappedBy="itemsCliente")
	private Set<Neumatico> itemsNeumatico=new HashSet<>();
	
	//Constructor sin Propiedades
	public Cliente() {}

	//Constructor con Propiedades
	public Cliente(Integer clienteId, String nombre, Integer dni, String direccion, Integer telefono, LocalDate fecharegistro, String correo) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
		this.fecharegistro = fecharegistro;
		this.correo = correo;
	}

	//Encapsulamiento de las Propiedades
	public Integer getClienteId() {
		return clienteId;
	}

	public void setClienteId(Integer clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(LocalDate fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public ContratoCred getContratocred() {
		return contratocred;
	}

	public void setContratocred(ContratoCred contratocred) {
		this.contratocred = contratocred;
	}

	public Collection<BoletaVenta> getItemsBoletaVenta() {
		return itemsBoletaVenta;
	}

	public void setItemsBoletaVenta(Collection<BoletaVenta> itemsBoletaVenta) {
		this.itemsBoletaVenta = itemsBoletaVenta;
	}

	public Set<Neumatico> getItemsNeumatico() {
		return itemsNeumatico;
	}

	public void setItemsNeumatico(Set<Neumatico> itemsNeumatico) {
		this.itemsNeumatico = itemsNeumatico;
	}

}
