CREATE TABLE Aluno (
    id INT IDENTITY (1, 1) NOT NULL,
    ra CHAR (5) NOT NULL,
    nome VARCHAR (30) NULL,
    codCurso INT NULL,
    PRIMARY KEY CLUSTERED ([id] ASC)
);
Insert into Aluno (ra,nome,codCurso) values ('20001','Paulo',19)
Insert into Aluno (ra,nome,codCurso) values ('20002','Ana',19)
Insert into Aluno (ra,nome,codCurso) values ('20003','Pedro',15)


CREATE TABLE Curso (
    [id]       INT          IDENTITY (1, 1) NOT NULL,
    [codCurso] INT          NULL,
    [nomeCurso]     VARCHAR (30) NULL,
    [periodo]       VARCHAR (1) NULL,
    PRIMARY KEY CLUSTERED ([id] ASC)
);

Insert into Curso (codCurso, nomeCurso, periodo) values (19,'Informática', 'M')
Insert into Curso (codCurso, nomeCurso, periodo) values (39,'Desenvolvimento para Internet', 'V')
Insert into Curso (codCurso, nomeCurso, periodo) values (59,'Desenvolvimento para Internet', 'N')

--sql server