<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- Librería Spring Form -->
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REGISTRAR</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>

<body style="background-color:PaleGoldenrod;">
	<div class="container py-5">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                <div class="card border-black" style="border-radius: 1rem;">
                    <div class="row g-0">
                        <div class="card-body p-4 p-lg-5 text-black" >
                            <h3 class="text-center py-3">¡Registro de Clientes!</h3>

                            <form:form name= "" method="post" modelAttribute="cliente">
                                
                                <div class="form-outline mb-4">
                                    <label>Nombre: </label>
                                    <input type="text" name="nombre" class="form-control form-control-lg" required />
                                </div>

                                <div class="form-outline mb-4">
                                    <label>DNI: </label>
                                    <input type="number" name="dni" class="form-control form-control-lg" required />
                                </div>

                                <div class="form-outline mb-4">
                                    <label>Dirección: </label>
                                    <input type="text" name="direccion" class="form-control form-control-lg" required />
                                </div>

                                <div class="form-outline mb-4">
                                    <label>Teléfono: </label>
                                    <input type="number" name="telefono" class="form-control form-control-lg" required />
                                </div>
								
								<div class="form-outline mb-4">
                                    <label>F.Registro: </label>
                                    <input type="date" name="fecharegistro" class="form-control form-control-lg" required />
                                </div>
								
                                <div class="form-outline mb-4">
                                    <label>Correo: </label>
                                    <input type="email"  name="correo" class="form-control form-control-lg" required />
                                </div>

                                <div class="text-center justify-content-between">
                                    <button type="submit" onclick="alert('Se registro correctamente')" class="btn btn-primary">Guardar</button>
                                    <button type="button" onclick="location.href='/senati/clientes'" class="btn btn-dark">Cancelar</button>
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