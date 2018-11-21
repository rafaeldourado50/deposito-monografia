CREATE TABLE colecao (
	id INTEGER PRIMARY KEY,
	descricao VARCHAR(120) NOT NULL
);

INSERT INTO colecao (id, descricao) values (796, 'Trabalho de Conclusão de Curso - TCC Ciência da Computação (DCC)');

CREATE TABLE tipo_arquivo (
	id INTEGER PRIMARY KEY,
	descricao VARCHAR(120) NOT NULL
);

INSERT INTO tipo_arquivo (id, descricao) values (3, 'Adobe PDF (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (19, 'AIFF (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (20, 'audio/basic (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (26, 'BMP (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (57, 'Calc 6.0 spreadsheets (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (58, 'Calc 6.0 templates (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (7, 'CSS (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (59, 'Draw 6.0 documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (60, 'Draw 6.0 templates (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (25, 'FMP3 (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (16, 'GIF (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (6, 'HTML (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (17, 'image/png (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (61, 'Impress 6.0 presentations (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (62, 'Impress 6.0 templates (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (15, 'JPEG (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (33, 'LateX (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (14, 'MARC (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (64, 'Math 6.0 documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (32, 'Mathematica (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (12, 'Microsoft Excel (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (13, 'Microsoft Excel XML (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (10, 'Microsoft Powerpoint (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (11, 'Microsoft Powerpoint XML (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (31, 'Microsoft Project (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (24, 'Microsoft Visio (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (8, 'Microsoft Word (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (9, 'Microsoft Word XML (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (22, 'MPEG (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (30, 'MPEG Audio (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (50, 'OpenDocument Chart (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (52, 'OpenDocument Database (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (44, 'OpenDocument Drawing (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (45, 'OpenDocument Drawing Template (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (51, 'OpenDocument Formula (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (42, 'OpenDocument HTML Template (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (53, 'OpenDocument Image (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (43, 'OpenDocument Master Document (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (46, 'OpenDocument Presentation (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (47, 'OpenDocument Presentation Template (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (48, 'OpenDocument Spreadsheet (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (49, 'OpenDocument Spreadsheet Template (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (40, 'OpenDocument Text (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (41, 'OpenDocument Text Template (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (54, 'OpenOffice.org extension (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (39, 'Photo CD (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (27, 'Photoshop (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (28, 'Postscript (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (38, 'RealAudio (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (23, 'RTF (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (36, 'SGML (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (67, 'StarCalc 5.x spreadsheets (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (72, 'StarChart 5.x documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (68, 'StarDraw 5.x documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (69, 'StarImpress 5.x presentations (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (70, 'StarImpress Packed 5.x files (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (73, 'StarMail 5.x mail files (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (71, 'StarMath 5.x documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (65, 'StarWriter 5.x documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (66, 'StarWriter 5.x global documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (34, 'TeX (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (35, 'TeX dvi (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (5, 'Text (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (18, 'TIFF (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (29, 'Video Quicktime (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (21, 'WAV (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (37, 'WordPerfect (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (55, 'Writer 6.0 documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (63, 'Writer 6.0 global documents (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (56, 'Writer 6.0 templates (conhecido)');
INSERT INTO tipo_arquivo (id, descricao) values (4, 'XML (conhecido)');

CREATE TABLE deposito (
	id BIGSERIAL PRIMARY KEY,
	colecao_id INTEGER NOT NULL REFERENCES colecao(id),
	tipo_documento VARCHAR(100) NOT NULL,
	multiplos_arquivos BOOLEAN,
	autor_nome VARCHAR(100) NOT NULL,
	autor_sobrenome VARCHAR(100) NOT NULL,
	orientador_nome VARCHAR(100),
	orientador_sobrenome VARCHAR(100),
	titulo VARCHAR(200) NOT NULL,
	mes_defesa INTEGER,
	dia_defesa INTEGER,
	ano_defesa INTEGER NOT NULL,
	pais VARCHAR(20) NOT NULL,
	idioma VARCHAR(20) NOT NULL,
	agencia_fomento VARCHAR(400),
	permissao_acesso VARCHAR(30) NOT NULL
);

CREATE TABLE co_orientador (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	nome VARCHAR(100) NOT NULL,
	sobrenome VARCHAR(100) NOT NULL
);

CREATE TABLE membro_banca (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	nome VARCHAR(100) NOT NULL,
	sobrenome VARCHAR(100) NOT NULL
);

CREATE TABLE faculdade_instituicao_departamento (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	nome VARCHAR(200) NOT NULL
);

CREATE TABLE programa_pos_graduacao (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	nome VARCHAR(200) NOT NULL
);

CREATE TABLE sigla_instituicao (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	nome VARCHAR(200) NOT NULL
);

CREATE TABLE identificacao (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	tipo VARCHAR(10) NOT NULL,
	descricao VARCHAR(200)
);

CREATE TABLE palavra_chave (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	descricao VARCHAR(200) NOT NULL
);

CREATE TABLE area_conhecimento (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	descricao VARCHAR(200) NOT NULL
);

CREATE TABLE resumo (
	id BIGSERIAL PRIMARY KEY,
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	descricao VARCHAR(200) NOT NULL
);

CREATE TABLE arquivo (
	id BIGSERIAL PRIMARY KEY,
	tipo_arquivo_id INTEGER NOT NULL REFERENCES tipo_arquivo(id),
	deposito_id BIGINT NOT NULL REFERENCES deposito(id),
	arquivo BYTEA NOT NULL,
	descricao VARCHAR(200),
	formato VARCHAR(200)
);
