create database dbfeature;
use dbfeature;
-- O bloco de instruções abaixo cria a tebela (CRUD)
create table produto(
nomeprdt varchar(50) primary key unique,
infoprdt varchar(100) not null,
precoprdt float not null
);
describe tbproduto

-- Inserção de produto (CRUD - insert)

select * from tbproduto
insert into tbproduto(nomeprdt,infoprdt,precoprdt)
values('Tenis Nike','Tenis dedicado a pratica de corrida de alta performançe', '200.00');
insert into tbproduto(nomeprdt,infoprdt,precoprdt)
values('Tenis Nike Dunk','Tenis dedicado a pratica de skate com conforto e durabilidade','100.00');
insert into tbproduto(nomeprdt,infoprdt,precoprdt)
values('Tenis Nike VaporMax','Tenis dedicado ao uso no dia-dia','150.00');
insert into tbproduto(nomeprdt,infoprdt,precoprdt)
values('Tenis Adidas Star','Tenis vintage - lifeStyle','300.00');
insert into tbproduto(nomeprdt,infoprdt,precoprdt)
values('Tenis Asics','Tenis indicado para corrida moderada','250.00');
insert into tbproduto(nomeprdt,infoprdt,precoprdt)
values('Tenis Timberland','Tenis indicado para o uso em montanhas','500.00');
describe tbproduto

-- O update do produto( CRUD - update)
update tbproduto set nomeprdt='Tenis Basquete' where nomeprdt='Tenis Nike';

-- Comando de exclusão de um produto(CRUD - delete)

delete from tbproduto where nomeprdt='Tenis Timberland';

select * from tbproduto;

use dbfeature;
create table promo(
priomonomeprdt varchar(50) primary key unique,
promoinfoprdt varchar(100) not null,
promoprecoprdt float not null
);
 select * from promo;
insert into promo(priomonomeprdt,promoinfoprdt,promoprecoprdt)
values('Tenis Nike ONE','Tenis dedicado a pratica de corrida de alta performançe', '200.00');
describe table promo;

insert into tbpromo(priomonomeprdt,promoinfoprdt,promoprecoprdt)
values('Tenis Nike VaporMax Feminino','Tenis dedicado ao uso no dia-dia','150.00');


insert into tbpromo(priomonomeprdt,promoinfoprdt,promoprecoprdt)
values('Tenis Adidas Star Zoom','Tenis vintage - lifeStyle','300.00');

insert into tbpromo(priomonomeprdt,promoinfoprdt,promoprecoprdt)
values('Tenis Asics Gel','Tenis indicado para corrida moderada','250.00');

insert into tbpromo(priomonomeprdt,promoinfoprdt,promoprecoprdt)
values('Tenis Timberland Boots','Tenis indicado para o uso em montanhas','500.00');

describe table tbpromo;
select * from tbpromo;