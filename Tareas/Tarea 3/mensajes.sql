DROP TABLE IF EXISTS mensajes;

CREATE TABLE mensajes(
	 m_id INT NOT NULL AUTO_INCREMENT,
    destinatario VARCHAR(50),
    remitente VARCHAR(50),
    texto VARCHAR(255),
    copia VARCHAR(50),
    fecha VARCHAR(50),
    PRIMARY KEY (m_id)
);