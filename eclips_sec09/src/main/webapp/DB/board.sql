create table board (
	num			int(5) 	primary key not null Auto_increment,
	pass		varchar(30),
	name  		varchar(30),
	email		varchar(30),
	title 		varchar(50),
	content		varchar(1000),
	readcount   int(4)  default 0,
	writedate   datetime   default current_timestamp on update current_timestamp
);

insert into board values(null, "1234", "홍길동", "hong@abc.com", "게시글1번입니다.","게시글1번 홍길동이 남김", 0, 20221226);
insert into board values(null, "1234", "홍길동2", "hong@abc.com", "게시글2번입니다.","게시글2번 홍길동이 남김", 0, 20221226);
insert into board values(null, "1234", "홍길동3", "hong@abc.com", "게시글3번입니다.","게시글3번 홍길동이 남김", 0, 20221226);
select * from board;
select * from board;
