CREATE TABLE Evento (
    Data DATE,
    Hora TIME,
    Chefe INT,
    Nome VARCHAR(255),
    Bolo VARCHAR(255),
    NrAssistentes INT,
    Tema VARCHAR(255),
    Sabor VARCHAR(255),
    PRIMARY KEY (Data, Hora, Chefe)
);

