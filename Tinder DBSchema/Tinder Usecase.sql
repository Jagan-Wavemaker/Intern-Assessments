create database Tinder;
use Tinder;
alter table gender
add primary key (genderid);
create table userprofile(userid int, username varchar(30) unique, details varchar(50), anthem varchar(30), phno varchar(11), occupation varchar(20),location varchar(30), age int, genderid int, primary key (userid), foreign key (genderid) references gender (genderid));
show tables from tinder;
insert into gender values("1", "Male");
select * from gender;
select * from userprofile;
insert into userprofile values("1", "John", "I'm a simple boy with good mindset and lige goals", "All By Myself","7856312890","software engineer","Hyderabad","24","1");
insert into gender values("2", "Female");
insert into userprofile values("2", "Keny", "Girl living a simple life", "Nobody Really Cares","9086312876","teacher","chennai","22","2");
select * from userprofile;
insert into gender values("3","male");
insert into gender values("4", "female");
insert into gender values("5","male");
select * from gender;
insert into userprofile values("3", "Arsh", "Living my own life", "Heart of Gold","7656318734","Artist","Delhi","23","3");
insert into userprofile values("4", "Marie", "Maintaing silence makes happy", "Beat It ","9446318752","teacher","Hyderabad","21","4");
insert into userprofile values("5", "Jack", "Don't always rush in doing things", "Back In Black","8906318798","software engineer","Bengaluru","24","5");
select * from gender;
create table ingender(id int, userid int,genderid int, primary key (id), foreign key(userid) references userprofile (userid));
insert into ingender values("1","1","1");
select * from ingender;
insert into ingender values("2","2","2");
insert into ingender values("3","3","3");
insert into ingender values("4","4","4");
create table reltype(id int, relname varchar(20));
insert into reltype values("1","casual date");
insert into reltype values("2","dinner");
insert into reltype values("3","new friends");
insert into reltype values("4","still figuring");
select * from reltype;
create table inrel(id int, userid int, relid int, foreign key (userid) references userprofile (userid), foreign key (relid) references reltype(id));
alter table reltype 
add primary key (id);
insert into inrel values("1","1","1");
insert into inrel values("2","2","2");
insert into inrel values("3","1","2");
insert into inrel values("4","3","2");
insert into inrel values("5","4","1");
select * from inrel;
create table usermatch(id int, usergiven int, userreceived int, userswipe boolean, foreign key (usergiven) references userprofile(userid), foreign key (userreceived) references userprofile(userid));
insert into usermatch values("1","3","2",true);
insert into usermatch values("2","5","4",false);
insert into usermatch values("3","1","4",true);
insert into usermatch values("4","4","1",true);
select * from usermatch ;
create table conversation(id int, msgtext text, startedtime time, endedtime time,userid int, foreign key (userid) references userprofile(userid));
insert into conversation values("1","Hello..How are you doing?","10:05:01","10:06:49","2");
select * from conversation;
insert into conversation values("2","Hii..Whats your name?","08:15:01","08:16:49","3");
insert into conversation values("3","Hey..I'm John and your good name please","02:04:54","02:07:56","1");
select * from conversation;
