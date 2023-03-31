CREATE TABLE employees(
	id		varchar(10) NOT NULL primary key,
	pass 	varchar(10) NOT NULL,
	name	varchar(24),
	lev		char(1) DEFAULT 'A',
	enter	DATE,
	gender	char(1) DEFAULT '1',
	phone	varchar(30)
	);
	
select * from employees;