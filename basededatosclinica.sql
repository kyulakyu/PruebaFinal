CREATE DATABASE IF NOT EXISTS Clinica;
USE Clinica;

-- Crear la tabla Pacientes
CREATE TABLE Pacientes (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Fecha_Nacimiento DATE
);

-- Crear la tabla Especialidades
CREATE TABLE Especialidades (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(100)
);

-- Crear la tabla Doctores
CREATE TABLE Doctores (
    ID INT PRIMARY KEY,
    Nombre VARCHAR(100),
    Especialidad_ID INT,
    Experiencia INT,
    FOREIGN KEY (Especialidad_ID) REFERENCES Especialidades(ID)
);

-- Crear la tabla Facturas
CREATE TABLE Facturas (
    ID INT PRIMARY KEY,
    Monto DECIMAL(8, 2),
    Fecha_Pago DATE
);

-- Crear la tabla Citas
CREATE TABLE Citas (
    ID INT PRIMARY KEY,
    Paciente_ID INT,
    Doctor_ID INT,
    Fecha DATE,
    Factura_ID INT,
    FOREIGN KEY (Paciente_ID) REFERENCES Pacientes(ID),
    FOREIGN KEY (Doctor_ID) REFERENCES Doctores(ID),
    FOREIGN KEY (Factura_ID) REFERENCES Facturas(ID)
);
CREATE TABLE Historia_Clinica (
    ID INT PRIMARY KEY,
    Paciente_ID INT,
    Doctor_ID INT,
    Fecha_Cita DATE,
    Sintomas TEXT,
    Diagnostico TEXT,
    Tratamiento TEXT,
    FOREIGN KEY (Paciente_ID) REFERENCES Pacientes(ID),
    FOREIGN KEY (Doctor_ID) REFERENCES Doctores(ID)
);


-- Rellenar la tabla Pacientes
INSERT INTO Pacientes (ID, Nombre, Fecha_Nacimiento) VALUES
(1, 'Juan Pérez', '1985-03-15'),
(2, 'María López', '1990-07-25'),
(3, 'José García', '1978-05-10'),
(4, 'Marta González', '2001-01-20'),
(5, 'Luisa Fernández', '1995-12-30');

-- Rellenar la tabla Especialidades
INSERT INTO Especialidades (ID, Nombre) VALUES
(1, 'Cardiología'),
(2, 'Dermatología'),
(3, 'Neurología'),
(4, 'Endocrinología'),
(5, 'Oncología');

-- Rellenar la tabla Doctores
INSERT INTO Doctores (ID, Nombre, Experiencia, Especialidad_ID) VALUES
(1, 'Dr. Ramírez', 5, 1),
(2, 'Dra. Rodríguez', 5, 2),
(3, 'Dr. Fernández', 10, 3),
(4, 'Dra. González', 15, 4),
(5, 'Dr. Sánchez', 20, 5);

-- Rellenar la tabla Facturas
INSERT INTO Facturas (ID, Monto, Fecha_Pago) VALUES
(1, 100.00, '2023-07-26'),
(2, 150.00, NULL),
(3, 200.00, '2023-07-27'),
(4, 250.00, '2023-07-28'),
(5, 300.00, NULL),
(6, 350.00, '2023-07-29'),
(7, 400.00, NULL),
(8, 450.00, '2023-07-30'),
(9, 500.00, NULL),
(10, 550.00, '2023-07-31');

-- Rellenar la tabla Citas
INSERT INTO Citas (ID, Paciente_ID, Doctor_ID, Fecha, Factura_ID) VALUES
(1, 1, 1, '2023-07-25', 1),
(2, 2, 2, '2023-07-26', 2),
(3, 3, 3, '2023-07-27', 3),
(4, 4, 4, '2023-07-28', 4),
(5, 5, 5, '2023-07-29', 5),
(6, 1, 2, '2023-07-30', 6),
(7, 2, 3, '2023-07-31', 7),
(8, 3, 4, '2023-08-01', 8),
(9, 4, 5, '2023-08-02', 9),
(10, 5, 1, '2023-08-03', 10);

-- Rellenar la tabla Historia_Clinica
INSERT INTO Historia_Clinica (ID, Paciente_ID, Doctor_ID, Fecha_Cita, Sintomas, Diagnostico, Tratamiento) VALUES
(1, 1, 1, '2023-07-25', 'Dolor en el pecho', 'Angina de pecho', 'Medicación y reposo'),
(2, 2, 2, '2023-07-26', 'Erupción cutánea', 'Alergia', 'Antihistamínicos'),
(3, 3, 3, '2023-07-27', 'Dolor de cabeza', 'Migraña', 'Medicación y reposo'),
(4, 4, 4, '2023-07-28', 'Aumento de peso', 'Hipotiroidismo', 'Medicación'),
(5, 5, 5, '2023-07-29', 'Fatiga', 'Anemia', 'Suplementos de hierro'),
(6, 1, 2, '2023-07-30', 'Acné', 'Acné común', 'Antibióticos tópicos'),
(7, 2, 3, '2023-07-31', 'Pérdida de memoria', 'Estrés', 'Terapia y relajación'),
(8, 3, 4, '2023-08-01', 'Sed excesiva', 'Diabetes', 'Dieta y medicación'),
(9, 4, 5, '2023-08-02', 'Pérdida de peso', 'Cáncer', 'Quimioterapia'),
(10, 5, 1, '2023-08-03', 'Palpitaciones', 'Arritmia', 'Medicación');




-- Consulta 1
USE Clinica;
SELECT P.Nombre AS Nombre_Paciente, D.Nombre AS Nombre_Doctor
FROM Pacientes AS P
JOIN Citas AS C ON P.ID = C.Paciente_ID
JOIN Doctores AS D ON C.Doctor_ID = D.ID;

-- Consulta 2
USE Clinica;
SELECT D.Nombre, E.Nombre AS Especialidad
FROM Doctores D
INNER JOIN Citas C ON D.ID = C.Doctor_ID
INNER JOIN Pacientes P ON C.Paciente_ID = P.ID
INNER JOIN Especialidades E ON D.Especialidad_ID = E.ID
WHERE P.Nombre = 'Juan Pérez';

-- Consulta 3
USE Clinica;
SELECT D.Nombre AS Nombre_Doctor, SUM(F.Monto) AS Total_Facturado
FROM Doctores AS D
JOIN Citas AS C ON D.ID = C.Doctor_ID
JOIN Facturas AS F ON C.Factura_ID = F.ID
GROUP BY D.Nombre
ORDER BY Nombre_Doctor DESC;

-- Consulta 4
USE Clinica;
SELECT P.ID AS Paciente_ID, P.Nombre AS Paciente, HC.Diagnostico, HC.Tratamiento
FROM Pacientes P
JOIN Citas C ON P.ID = C.Paciente_ID
JOIN Historia_Clinica HC ON C.ID = HC.ID
WHERE HC.Fecha_Cita = (SELECT MAX(Fecha_Cita) FROM Historia_Clinica WHERE Paciente_ID = P.ID)
ORDER BY Paciente_ID;

-- Consulta 5
USE Clinica;
SELECT D.Nombre AS Nombre_Doctor, COUNT(*) AS Cantidad_Pacientes_Atendidos
FROM Doctores AS D
JOIN Citas AS C ON D.ID = C.Doctor_ID
GROUP BY D.Nombre;
