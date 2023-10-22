<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CONTRATOS</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body>
	<div class="container text-center py-5">
		<h3 class="text-center">¡Lista de Contratos!</h3>

		<div class="py-3">
			<a href="/senati/home">Menu</a> | <a href="/senati/contrato/registrar">Registrar</a>
		</div>

		<table class="table table-hover">
			<thead class="table-info">
				<tr>
					<th class="fw-bold">ID</th>
					<th class="fw-bold">F.INICIO</th>
					<th class="fw-bold">MONTO DE CREDITO</th>
					<th class="fw-bold">CLIENTE</th>
					<th class="fw-bold">OPCIONES</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="contrato" items="${bContratos}">
					<tr>
						<td>${contrato.contratocredId}</td>
						<td>${contrato.fechainicio}</td>
						<td>${contrato.montocredito}</td>
						<td>${contrato.cliente.nombre}</td>
						<td><a href="/senati/contrato/editar/${contrato.contratocredId}">Editar</a> |
							<a href="/senati/contrato/eliminar/${contrato.contratocredId}">Eliminar</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>