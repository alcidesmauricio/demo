-- Criação de uma tabela
CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL
);

-- Inserção de dados
INSERT INTO usuarios (nome, email, senha) 
VALUES ('João Silva', 'joao.silva@example.com', 'senha123');

-- Consulta de dados
SELECT * FROM usuarios WHERE email = 'joao.silva@example.com'; 