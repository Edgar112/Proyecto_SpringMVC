<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NEUMATICOS</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
	<div class="container text-center py-5">
		<h3 class="text-center">¡Lista de Neumaticos!</h3>

		<div class="py-3">
			<a href="/senati/home">Menu</a> | <a href="/senati/neumatico/registrar">Registrar</a>
		</div>

		<table class="table table-hover">
			<thead class="table-info">
				<tr>
					<th class="fw-bold">ID</th>
					<th class="fw-bold">DESCRIPCIÓN</th>
					<th class="fw-bold">MARCA</th>
					<th class="fw-bold">TIPO</th>
					<th class="fw-bold">STOCK</th>
					<th class="fw-bold">PRECIO</th>
					<th class="fw-bold">OPCIONES</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="neumatico" items="${bNeumaticos}">
					<tr>
						<td>${neumatico.neumaticoId}</td>
						<td>${neumatico.descripcion}</td>
						<td>${neumatico.marca}</td>
						<td>${neumatico.tipo}</td>
						<td>${neumatico.stock}</td>
						<td>${neumatico.precio}</td>
						<td><a href="/senati/neumatico/editar/${neumatico.neumaticoId}">Editar</a> |
							<a href="/senati/neumatico/eliminar/${neumatico.neumaticoId}">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>