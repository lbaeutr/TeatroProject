CREATE TABLE Cliente (
    dni VARCHAR(10) PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    prApellido VARCHAR(50) NOT NULL,
    sgApellido VARCHAR(50) NOT NULL
);

CREATE TABLE Espectaculo (
    codEspectaculo INT AUTO_INCREMENT PRIMARY KEY,
    nombreEspectaculo VARCHAR(100) NOT NULL,
    genero VARCHAR(50) NOT NULL,
    fechaEspectaculo DATE NOT NULL,
    numeroEntradas INT NOT NULL DEFAULT 100 --Eliminar
);


CREATE TABLE Entrada (
    codEntrada INT AUTO_INCREMENT PRIMARY KEY,
    codEspectaculo INT NOT NULL,
    dni VARCHAR(10) NOT NULL,
    fila INT NOT NULL,
    columna INT NOT NULL,
    fechaCompra DATE NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (dni) REFERENCES Cliente(dni),
    FOREIGN KEY (codEspectaculo) REFERENCES Espectaculo(codEspectaculo)
);

