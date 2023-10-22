<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOLETAS</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
	<div class="container text-center py-5">
		<h3 class="text-center">¡Boletas de Venta!</h3>

		<div class="py-3">
			<a href="/senati/home">Menu</a> | <a href="/senati/boleta/registrar">Registrar</a>
		</div>

		<table class="table table-hover">
			<thead class="table-info">
				<tr>
					<th class="fw-bold">ID</th>
					<th class="fw-bold">NUMERO </th>
					<th class="fw-bold">F. EMISIÓN</th>
					<th class="fw-bold">CLIENTE</th>
					<th class="fw-bold">CANTIDAD</th>
					<th class="fw-bold">PRECIO</th>
					<th class="fw-bold">TOTAL</th>
					<th class="fw-bold">OPCIONES</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="boleta" items="${bBoletas}">
					<tr>
						<td>${boleta.boletaventaId}</td>
						<td>${boleta.numboletaventa}</td>
						<td>${boleta.fechaemision}</td>
						<td>${boleta.cliente.nombre}</td>
						<td>${boleta.cantidad}</td>
						<td>${boleta.precio}</td>
						<td>${boleta.total}</td>
						<td><a href="/senati/boleta/editar/${boleta.boletaventaId}">Editar</a> |
							<a href="/senati/boleta/eliminar/${boleta.boletaventaId}">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>