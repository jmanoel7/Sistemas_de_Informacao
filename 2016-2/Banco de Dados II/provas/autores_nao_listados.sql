select * from autor
where idautor not in (
	select distinct idautor from musica_autor
);