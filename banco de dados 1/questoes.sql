/*1 - O nome e a ementa de todas as disciplinas com carga horária acima de 40 horas--*/

select nome,ementa from disciplina where carga_horaria > 40 ;

/*2 - Todos os dados dos professores que tem e-mail do gmail*/

select * from professor where email like "%@gmail.com" ;

/*
3 - O nome de todos os cursos que tem oferta de disciplinas no semestre 2020-2*/
SELECT curso.*,oferta.semestre FROM curso , oferta 
WHERE (curso.idcurso = oferta.curso )AND
(oferta.semestre = "2015-2" );-- a tabela nao tem nem uma ofereta no semestre de 2020-2 -- 


/* 4 - O nome de todos os alunos com média final maior que 8.5 em qualquer oferta que tenha sido matriculado */
SELECT aluno.nome FROM aluno , matricula
WHERE (aluno.idaluno = matricula.aluno )AND
(matricula.MediaFinal > 7.5 );-- a tabela nao tem nem um aluno com media maior que 8.5 -- 

/*5 - O nome de todas as disciplinas que já foram ofertadas em uma segunda-feira*/

SELECT disciplina.nome FROM  disciplina , oferta
WHERE (disciplina.iddisciplina = oferta.disciplina )AND
(oferta.dia LIKE "%segunda%" ); 

/*
6 - O nome de todas as disciplinas que foram ofertadas para o curso com idCurso = 1*/

SELECT disciplina.nome FROM  disciplina , oferta
WHERE (disciplina.iddisciplina = oferta.disciplina )AND
(oferta.curso = 1 );

/*7 - O nome e a carga horária de todas as disciplinas que já foram ofertadas para o curso de Sistemas de Informação
*/


SELECT disciplina.nome , disciplina.carga_horaria FROM  disciplina , oferta 
WHERE (disciplina.iddisciplina = oferta.disciplina )AND
(oferta.curso = 1 );

-- ou --
SELECT disciplina.nome , disciplina.carga_horaria FROM  disciplina , oferta , curso
WHERE (disciplina.iddisciplina = oferta.disciplina )AND
(curso.idcurso = oferta.curso)AND
( curso.nome like "%Sistemas de Informação%");

/*8 - O nome de todos os professores que já deram aula no curso de Sistemas de Inform*/

SELECT professor.nome FROM  professor , oferta , curso
WHERE (professor.idprofessor = oferta.professor )AND
(curso.idcurso = oferta.curso)AND
( curso.nome like "%Sistemas de Informação%");

-- ou --

SELECT professor.nome FROM  professor , oferta 
WHERE (professor.idprofessor = oferta.professor )AND
( oferta.curso = 1);