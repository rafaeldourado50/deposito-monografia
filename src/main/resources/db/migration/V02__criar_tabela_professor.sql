CREATE TABLE professor (
	id BIGSERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	sobrenome VARCHAR(100),
	email VARCHAR(100)
);

INSERT INTO professor (id, nome, sobrenome, email) values (1, 'João', 'Eudes de Oliveira', 'joaoeudesoliveira1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (2, 'Fernando', 'Valois Pereira', 'fernandovalois1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (3, 'Maria Rita', ' Conceição das Dores', 'mariaritaconceicao1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (4, 'Joana', 'Maltar Assunção', 'joanamaltar1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (5, 'Ana Carolina', 'Peres', 'anacarolinaperes1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (6, 'Ricardo', 'Martins da Anunciação', 'ricardomartins1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (7, 'Carlos', 'Santana Marinho', 'carlossantana1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (8, 'Pedro Igor', 'do Nascimento', 'pedroigornascimento1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (9, 'Henrique', 'Gonçalves', 'henriquegoncalves1234@email.com');
INSERT INTO professor (id, nome, sobrenome, email) values (10, 'Débora', 'Barbora Gonçalo', 'deborabarbosa1234@email.com');

ALTER TABLE deposito
DROP COLUMN orientador_nome,
DROP COLUMN orientador_sobrenome;

ALTER TABLE deposito
ADD COLUMN orientador_id INTEGER NOT NULL REFERENCES professor(id) DEFAULT 1;

ALTER TABLE deposito
ALTER COLUMN orientador_id DROP DEFAULT;