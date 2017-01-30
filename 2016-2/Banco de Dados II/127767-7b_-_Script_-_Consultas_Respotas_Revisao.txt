-- Aula 07 - DDL e DML - Revisão - Resposta - Exercício

-- 3) De acordo com as tabelas, crie consultas SQL para:

-- a) buscar os dados dos pacientes que estão com GRIPE

SELECT DISTINCT p.*
FROM consulta c NATURAL JOIN doenca d NATURAL JOIN paciente p
WHERE d.descricao = 'Gripe';

--b) buscar os dados dos médicos pediatras de Goiânia

SELECT m.*
FROM Cidade c NATURAL JOIN Medico m JOIN Especialidade e USING(codesp)
WHERE e.nome = 'Pediatra'
  AND c.descricao = 'Goiânia';

--c) recuperar a especialidade e o número total de médicos de cada especialidade

SELECT e.nome, count(m.crm)
FROM Medico m JOIN Especialidade e USING(codesp)
GROUP BY e.nome;
  
--d) recupere os nomes dos médicos que ainda não realizaram consultas

SELECT m.*
FROM Medico m 
WHERE m.crm NOT IN ( SELECT DISTINCT crm FROM consulta );

--e) buscar os dados das consultas, exceto aquelas marcadas para os médicos com CRM 1 e 2

SELECT c.*
FROM Consulta c
WHERE c.crm NOT IN (1,2);

--f) buscar os dados dos ambulatórios que tenham capacidade igual a 15 e seja do quarto andar ou tenham capacidade superior a 50

SELECT a.* 
FROM Ambulatorio a 
WHERE (a.andar = 4 and a.capacidade = 15) or (capacidade > 50);

--g) buscar o nome dos médicos com consulta marcada e suas respectivas datas, ordenando o nome dos médicos em ordem alfabética

SELECT m.nome, TO_CHAR(c.data, 'DD/MM/YYYY')
FROM Medico m NATURAL JOIN Consulta c
ORDER BY m.nome;

--h) buscar o CRM dos médicos e as datas das consultas para os pacientes com nome igual a “Dory”

SELECT c.crm, c.data 
FROM Consulta c JOIN Paciente p USING(rg) 
WHERE p.nome = 'Dory';

--i) buscar os números dos ambulatórios, exceto aqueles do segundo e quarto andares, que suportam mais de 50 pacientes

SELECT a.numeroa
FROM Ambulatorio a 
WHERE (a.andar <> 2  and a.andar <> 4) 
  AND (a.capacidade > 50);

--j) buscar o nome dos médicos que atendem nos ambulatórios do primeiro andar, bem como, o número e a capacidade destes ambulatórios

SELECT m.nome as Nome_Medico, a.numeroa as Numero_Ambulatorio, a.capacidade as Capacidade
FROM Medico m NATURAL JOIN Ambulatorio a 
WHERE a.andar = 1;

--k) buscar o nome dos médicos e o nome dos seus pacientes com consulta marcada, assim como a data destas consultas

SELECT m.nome AS nome_medico, p.nome AS nome_paciente, TO_CHAR(c.data, 'DD-MM-YYYY')
FROM Medico m 
JOIN Consulta c on c.crm = m.crm
JOIN Paciente p on p.rg = c.rg;

--l) buscar os nomes dos pacientes, com consultas marcadas para os médicos Carlomã ou Caroline, que estão com Zika.

SELECT DISTINCT p.nome
FROM Medico m
JOIN Consulta c USING(crm)
JOIN Paciente p USING(rg)
JOIN Doenca d   USING(codDoenca)
WHERE (m.nome = 'Carlomã' OR m.nome = 'Caroline' )
  AND d.descricao = 'Zika';

--m) buscar os nomes e idade dos médicos, pacientes e funcionários que residem em Goiânia

SELECT m.nome, m.idade FROM Medico m NATURAL JOIN Cidade c WHERE c.descricao = 'Goiânia'
Union 
SELECT p.nome, p.idade FROM Paciente p NATURAL JOIN Cidade c WHERE c.descricao = 'Goiânia'
Union 
SELECT f.nome, f.idade FROM Funcionario f NATURAL JOIN Cidade c WHERE c.descricao = 'Goiânia'

--n) buscar os nomes e os RGs dos funcionários que estão internados como pacientes

SELECT nome, rg FROM Funcionario
INTERSECT
SELECT nome, rg FROM Paciente ORDER BY rg;

--o) buscar os números dos ambulatórios onde nenhum médico presta atendimento

SELECT numeroA 
FROM   Ambulatorio
WHERE  numeroA NOT IN (SELECT numeroA FROM Medico);

--p) buscar os nomes dos funcionários que nunca consultaram 

SELECT nome, rg FROM Funcionario
EXCEPT
SELECT nome, rg FROM Paciente ORDER BY rg;

--q) quais são as cidades cuja soma dos salários dos funcionários ultrapassa 50.000?

SELECT c.descricao, sum(f.salario)
FROM Cidade c NATURAL JOIN Funcionario f
GROUP BY c.descricao
HAVING sum(f.salario) > 50000

--r) recupere o nome dos médicos e dos pacientes e a cidade onde moram.

SELECT m.nome, c.descricao
FROM Medico m NATURAL JOIN Cidade c
UNION
SELECT p.nome, c.descricao
FROM Paciente p NATURAL JOIN Cidade c

--s) buscar o total de médicos para cada especialidade

SELECT e.nome, count(m.crm)
FROM Medico m JOIN Especialidade e USING(codesp)
GROUP BY e.nome;