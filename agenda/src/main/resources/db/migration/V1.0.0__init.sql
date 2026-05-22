create Table agendas (
    id bigint not null auto_increment,
    vehiculo_id bigint not null,
    vendedor_id bigint not null,
    primary key (id)
);


insert into agendas (vehiculo_id, vendedor_id) values (1, 1);
insert into agendas (vehiculo_id, vendedor_id) values (2, 2);
insert into agendas (vehiculo_id, vendedor_id) values (3, 3);
insert into agendas (vehiculo_id, vendedor_id) values (4, 2);