CREATE TABLE colecao (
	id INTEGER NOT NULL,
	descricao VARCHAR(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO colecao (id, descricao) values (796, 'Trabalho de Conclusão de Curso - TCC Ciência da Computação (DCC)');

CREATE TABLE tipo_documento (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	descricao VARCHAR(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tipo_documento (descricao) values ('Trabalhos de conclusão de Iniciação científica');
INSERT INTO tipo_documento (descricao) values ('Trabalhos de conclusão de Graduação');
INSERT INTO tipo_documento (descricao) values ('Monografias de Especialização');
INSERT INTO tipo_documento (descricao) values ('Dissertações de Mestrado (defendida e aprovada por banca especializada)');
INSERT INTO tipo_documento (descricao) values ('Exames de Qualificação de Doutoramento');
INSERT INTO tipo_documento (descricao) values ('Teses de Doutoramento (defendida e aprovada por banca especializada)');
INSERT INTO tipo_documento (descricao) values ('Trabalhos de conclusão de pós doutorado');
INSERT INTO tipo_documento (descricao) values ('Trabalhos de conclusão de outra natureza');

CREATE TABLE pais (
	valor VARCHAR(50) NOT NULL,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pais (valor, nome) values ('brasil', 'Brasil');
INSERT INTO pais (valor, nome) values ('africa do sul', 'África do Sul');
INSERT INTO pais (valor, nome) values ('alemanha', 'Alemanha');
INSERT INTO pais (valor, nome) values ('angola', 'Angola');
INSERT INTO pais (valor, nome) values ('argentina', 'Argentina');
INSERT INTO pais (valor, nome) values ('australia', 'Austrália');
INSERT INTO pais (valor, nome) values ('austria', 'Áustria');
INSERT INTO pais (valor, nome) values ('belgica', 'Bélgica');
INSERT INTO pais (valor, nome) values ('bolivia', 'Bolívia');
INSERT INTO pais (valor, nome) values ('canada', 'Canadá');
INSERT INTO pais (valor, nome) values ('chile', 'Chile');
INSERT INTO pais (valor, nome) values ('china', 'China');
INSERT INTO pais (valor, nome) values ('colombia', 'Colômbia');
INSERT INTO pais (valor, nome) values ('espanha', 'Espanha');
INSERT INTO pais (valor, nome) values ('estados unidos', 'Estados Unidos');
INSERT INTO pais (valor, nome) values ('franca', 'França');
INSERT INTO pais (valor, nome) values ('gra-bretanha', 'Grã-Bretanha');
INSERT INTO pais (valor, nome) values ('holanda', 'Holanda');
INSERT INTO pais (valor, nome) values ('italia', 'Itália');
INSERT INTO pais (valor, nome) values ('mexico', 'México');
INSERT INTO pais (valor, nome) values ('portugal', 'Portugal');
INSERT INTO pais (valor, nome) values ('suica', 'Suiça');
INSERT INTO pais (valor, nome) values ('uruguai', 'Uruguai');

CREATE TABLE idioma (
	valor VARCHAR(50) NOT NULL,
	nome VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO idioma (valor, nome) values ('pt_BR', 'Português');
INSERT INTO idioma (valor, nome) values ('en', 'Inglês');
INSERT INTO idioma (valor, nome) values ('fr', 'Francês');
INSERT INTO idioma (valor, nome) values ('es', 'Espanhol');
INSERT INTO idioma (valor, nome) values ('de', 'Alemão');
INSERT INTO idioma (valor, nome) values ('ca', 'Catalão');
INSERT INTO idioma (valor, nome) values ('nl', 'Holandês');
INSERT INTO idioma (valor, nome) values ('it', 'Italiano');
INSERT INTO idioma (valor, nome) values ('la', 'Latim');

CREATE TABLE permissao_acesso (
	valor VARCHAR(50) NOT NULL,
	descricao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO permissao_acesso (valor, descricao) values ('acesso aberto', 'Acesso aberto');
INSERT INTO permissao_acesso (valor, descricao) values ('1 mes', 'Embargado: 1 mês');
INSERT INTO permissao_acesso (valor, descricao) values ('3 meses', 'Embargado: 3 meses');
INSERT INTO permissao_acesso (valor, descricao) values ('6 meses', 'Embargado: 6 meses');
INSERT INTO permissao_acesso (valor, descricao) values ('1 ano', 'Embargado: 1 ano');
INSERT INTO permissao_acesso (valor, descricao) values ('5 anos', 'Embargado: 5 anos');
INSERT INTO permissao_acesso (valor, descricao) values ('10 anos', 'Embargado: 10 anos');
INSERT INTO permissao_acesso (valor, descricao) values ('restrito', 'Restrito');

CREATE TABLE deposito (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	colecao_id INTEGER NOT NULL FOREIGN KEY REFERENCES colecao(id),
	tipo_documento_id INTEGER NOT NULL FOREIGN KEY REFERENCES tipo_documento(id),
	multiplos_arquivos BOOLEAN,
	autor_nome VARCHAR(50) NOT NULL,
	autor_sobrenome VARCHAR(150) NOT NULL,
	orientador_nome VARCHAR(50),
	orientador_sobrenome VARCHAR(150),
	titulo VARCHAR(200) NOT NULL,
  mes_defesa INTEGER,
	dia_defesa INTEGER,
	ano_defesa INTEGER NOT NULL,
	pais VARCHAR(50) NOT NULL,
	idioma VARCHAR(50) NOT NULL,
	agencia_fomento VARCHAR(400),
	permissao_acesso VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE co_orientador (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	nome VARCHAR(50) NOT NULL,
	sobrenome VARCHAR(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE membro_banca (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	nome VARCHAR(50) NOT NULL,
	sobrenome VARCHAR(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE faculdade_instituicao_departamento (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	nome VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE programa_pos_graduacao (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	nome VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE sigla_instituicao (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	nome VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tipo_identificacao (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	valor VARCHAR(50) NOT NULL,
	descricao VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tipo_identificacao (valor, descricao) values ('issn', 'ISSN');
INSERT INTO tipo_identificacao (valor, descricao) values ('other', 'Outro');
INSERT INTO tipo_identificacao (valor, descricao) values ('uri', 'URI');
INSERT INTO tipo_identificacao (valor, descricao) values ('isbn', 'ISBN');

CREATE TABLE identificacao (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	tipo_identificacao_id INTEGER NOT NULL FOREIGN KEY REFERENCES tipo_identificacao(id),
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	descricao VARCHAR(200)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE palavra_chave (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE area_conhecimento (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE resumo (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	descricao VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tipo_arquivo (
	id INTEGER,
	descricao VARCHAR(120) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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

CREATE TABLE arquivo (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
	tipo_arquivo_id INTEGER NOT NULL FOREIGN KEY REFERENCES tipo_arquivo(id),
	deposito_id INTEGER NOT NULL FOREIGN KEY REFERENCES deposito(id),
	arquivo BYTEA NOT NULL,
	descricao VARCHAR(200),
	formato VARCHAR(200)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
