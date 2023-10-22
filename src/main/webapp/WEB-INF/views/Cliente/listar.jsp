<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CLIENTES</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
	<div class="container text-center py-5">
		<h3 class="text-center">¡Lista de Clientes!</h3>

		<div class="py-3">
			<a href="/senati/home">Menu</a> | <a href="/senati/cliente/registrar">Registrar</a>
		</div>

		<table class="table table-hover">
			<thead class="table-info">
				<tr>
					<th class="fw-bold">ID</th>
					<th class="fw-bold">NOMBRE</th>
					<th class="fw-bold">DNI</th>
					<th class="fw-bold">DIRECCIÓN</th>
					<th class="fw-bold">TELÉFONO</th>
					<th class="fw-bold">F.REGISTRO</th>
					<th class="fw-bold">CORREO</th>
					<th class="fw-bold">OPCIONES</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="cliente" items="${bClientes}">
					<tr>
						<td>${cliente.clienteId}</td>
						<td>${cliente.nombre}</td>
						<td>${cliente.dni}</td>
						<td>${cliente.direccion}</td>
						<td>${cliente.telefono}</td>
						<td>${cliente.fecharegistro}</td>
						<td>${cliente.correo}</td>
						<td><a href="/senati/cliente/editar/${cliente.clienteId}">Editar</a>
							| <a href="/senati/cliente/eliminar/${cliente.clienteId}">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>