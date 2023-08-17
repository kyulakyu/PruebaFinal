USE Clinica;
SELECT P.Nombre AS Nombre_Paciente, D.Nombre AS Nombre_Doctor
FROM Pacientes AS P
JOIN Citas AS C ON P.ID = C.Paciente_ID
JOIN Doctores AS D ON C.Doctor_ID = D.ID;