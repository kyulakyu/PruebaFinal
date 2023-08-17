<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <!-- Encabezado y enlaces CSS aquí -->
  <!-- Asegúrate de tener Bootstrap 5.5.0 vinculado -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/css/bootstrap.min.css">
</head>

<body>
  <div class="navbar-container">
    <nav class="navbar navbar-expand-lg navbar-light bg-info">
      <div class="container">
        <a class="navbar-brand" href="#" style="color: white;">Clinica</a>

        <div class="navbar-nav ml-auto" id="navbar-list">
          <a class="nav-link" href="/Prueba.final/" style="color: white;">Inicio</a>
            <a class="nav-link" href="CrearCapacitacion" style="color: white;">Crear Historial</a>
            <a class="nav-link" href="ListarCapacitaciones" style="color: white;">Listar Historial</a>
					<a class="nav-link" href="CrearUsuario" style="color: white;">Crear Paciente</a>
					<a class="nav-link" href="ListarUsuarios" style="color: white;">Listar Pacientes</a> 
        </div>
      </div>
    </nav>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-N1S0zO3lg8DIWDHN7SxszhGPIAqE0j0jXKufoiJ5O7ALgCE3dRNaJi+od9K0sMOT" crossorigin="anonymous"></script>
</body>
</html>