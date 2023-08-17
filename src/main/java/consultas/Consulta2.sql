USE Clinica;
SELECT D.Nombre, E.Nombre AS Especialidad
FROM Doctores D
INNER JOIN Citas C ON D.ID = C.Doctor_ID
INNER JOIN Pacientes P ON C.Paciente_ID = P.ID
INNER JOIN Especialidades E ON D.Especialidad_ID = E.ID
WHERE P.Nombre = 'Juan Pérez';