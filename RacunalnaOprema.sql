drop database if exists RacunalnaOprema;
create database RacunalnaOprema character set utf8 collate utf8_general_ci;
use RacunalnaOprema;

create table oprema(
	sifra			int not null primary key auto_increment,
	naziv			varchar(20) not null,
	macadreasa		char(12) not null,
	cijena			decimal(6,2) not null,
	godinakupnje	year(4) not null
);

create table odjel(
	sifra			int not null primary key auto_increment,
	oprema			int not null,
	naziv			varchar(20) not null,
	brojzaposlenih	char(5) not null
);


create table korisnik(
	sifra			int not null primary key auto_increment,
	username		varchar(20) not null,
	ime				varchar(20) not null,
	prezime			varchar(30) not null,
	odjel			int not null
);


create table godina(
	sifra			int not null primary key auto_increment,
	oprema			int not null,
	godina			year(4) not null
);

create table otpis(
	sifra			int not null primary key auto_increment,
	aktivno			boolean not null,
	oprema			int not null,
	odjel			int not null,
	vrijednost		decimal(6,2) not null
);

create table skladiste(
	sifra			int not null primary key auto_increment,
	naziv			varchar(20) not null,
	otpis			int not null,
	godina			int not null,
	dostupnost		boolean not null,
	kolicina		char(2)
);
alter table odjel add foreign key (oprema) references oprema(sifra);
alter table korisnik add foreign key (odjel) references odjel(sifra);

alter table godina add foreign key (oprema) references oprema(sifra);

alter table otpis add foreign key (oprema) references oprema(sifra);
alter table otpis add foreign key (odjel) references odjel(sifra);

alter table skladiste add foreign key (godina) references godina(sifra);
alter table skladiste add foreign key (otpis) references otpis(sifra);

insert into oprema (sifra,naziv,macadreasa,cijena,godinakupnje) values
(null,'HP Z420','24-3B-40-44-B8-C1','10000,00','2017'),
(null,'HP ZBook 15 G4','8C-E9-1A-5A-77-36','12584,25','2018'),
(null,'Dell P2414H','90-03-F1-6E-2F-C6','1984,01','2017'),
(null,'Yealink T41P','44-01-CD-F2-49-BA','759,58','2016'),
(null,'Logitech M171','C9-10-28-96-23-6B','499,15','2019');

insert into odjel(sifra,oprema,naziv,brojzaposlenih) values
(null,'Yealink P2414H','HR','4'),
(null,'Logitech M171','Konstrukcija','2'),
(null,'Dell P2414H','Uprava','5'),
(null,'HP Z420','CNC Programeri','10'),
(null,'HP ZBook','Montaža','186');

insert into korisnik (sifra,username,ime,prezime,odjel) values
(null,'Radunkovic','Ivan','Radunković','IT'),
(null,'Petlic','Marko','Petlić','Montaža'),
(null,'KoprivnjakA','Antonio','Koprivnjak','HR'),
(null,'Par','Ana','Par','Uprava'),
(null,'Peric','Petar','Perić','Konstrukcija');

insert into godina(sifra,oprema,godina) values
(null,'HP Z420','2017'),
(null,'HP ZBook','2018'),
(null,'Dell P2414H','2017'),
(null,'Yealink T41P','2016'),
(null,'Logitech M171','2019');

insert into otpis (sifra,aktivno,oprema,odjel,vrijednost) values
(null,'DA','HP Z420','CNC Programeri','8546,12'),
(null,'DA','HP ZBook','Montaža','10599,11'),
(null,'DA','Dell P2414H','Uprava','1540,84'),
(null,'DA','Yealink T41P','HR','458,14'),
(null,'NE','Logitech M171','Konstrukcija','00,00');

insert into skladiste (sifra,naziv,otpis,godina,dostupnost,kolicina) values
(null,'HP Z420','NE','2017','DA','3'),
(null,'HP ZBook 15 G4','NE','2018','DA','1'),
(null,'Dell P2414H','NE''2017','NE','0'),
(null,'Yealink P2414H','NE','2016','NE','8'),
(null,'Logitech M171','DA','2019','0');




