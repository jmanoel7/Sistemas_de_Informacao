select distinct idgravadora
from gravadora
where idgravadora not in (
  select distinct idgravadora
  from cd
);

- -- equivalente -- -

select distinct idgravadora from gravadora
except
select distinct idgravadora from cd;
