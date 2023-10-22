<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Librería Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ELIMINAR</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body style="background-color:PaleGoldenrod;">
	<div class="container py-5">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card border-black" style="border-radius: 1rem;">
                    <div class="row g-0">
                        <div class="card-body p-4 p-lg-5 text-black" >
                            <h3 class="text-center py-3">¡Eliminar Contrato!</h3>

                            <form:form name= "" method="post" modelAttribute="contrato">
                                
                                <div class="form-outline mb-4">
                                    <label>ID: </label>
                                    <input type="number" name="contratocredId" value="${contratocredId}" class="form-control form-control-lg" readonly="readonly"/>
                                </div>
                                                                
                                <div class="form-outline mb-4">
                                    <label>F.INICIO: </label>
                                    <input type="date" name="fechainicio" value="${contrato.fechainicio}" class="form-control form-control-lg" readonly="readonly" />
                                </div>

                                <div class="form-outline mb-4">
                                    <label>MONTO DE CREDITO: </label>
                                    <input type="number" name="montocredito" value="${contrato.montocredito}" class="form-control form-control-lg" readonly="readonly" />
                                </div>

								<div class="form-outline mb-4">
									<label>CLIENTE</label>
									<input type="text" name="nombre" value="${contrato.cliente.nombre}" class="form-control form-control-lg" readonly="readonly"/>
								</div>

								<div class="text-center justify-content-between">
                                    <button type="submit" onclick="alert('Se elimino correctamente')" class="btn btn-primary">Eliminar</button>
                                    <button type="button" onclick="location.href='/senati/contratos'" class="btn btn-dark">Cancelar</button>
                                </div>
                            </form:form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
	</div>
</body>
</html>