create table Student(
	id int not null AUTO_INCREMENT,
	firstname varchar(20),
	lastname varchar(20),
	email varchar(50),
	phone varchar(10),
	course varchar(30),
	address varchar(50),
	dob date,
	education varchar(20),
	password varchar(15),
	approved int default 0,
	reject int default 0,
	primary key(id)
);


create table Teacher(
	id int not null AUTO_INCREMENT,
	firstname varchar(20),
	lastname varchar(20),
	phone varchar(10),
	email varchar(50),
	subject varchar(30),
	qualification varchar(50),
	address varchar(50),
	dob date,
	experience int,
	hobby varchar(50),
	additional_qualification varchar(50),
	password varchar(15),
	approved int default 0,
	reject int default 0,
	primary key(id)
);


create table admin(
	id int not null AUTO_INCREMENT,
	email varchar(50),
	password varchar(15),
	primary key(id)
);
	
