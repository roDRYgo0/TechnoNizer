
use BD_TechnoNizer

/*Users administration and memberships*/

create table memberships(
id int identity(1,1) primary key not null,
name nvarchar(25) not null,
description nvarchar(250) not null,
condition int not null,
numberEvents numeric(4),
numberAdmins numeric(4),
numberModerators numeric(4),
numberGuests numeric(4),
price smallmoney not null
)

create table genders(
id int not null primary key,
gender nvarchar(25) not null
)

create table users(
nickname nvarchar(50) primary key not null,
mail nvarchar(100) not null,
password nvarchar(150) not null,
condition int not null,
imagen image,
durationMem int not null,
idMemberships int not null references memberships(id)
)

create table usersInformation(
id int identity(1,1) primary key not null,
firstName nvarchar(50) not null,
lastName nvarchar(50) not null,
birthdate date not null,
id_gender int not null references genders(id),
nickname nvarchar(50) not null references users(nickname)
)

SELECT ui.firstName, ui.lastName, ui.birthdate, u.mail, ui.id_gender FROM users u, usersInformation ui where u.nickname = ui.nickname and u.nickname = 

select ui.firstName, ui.lastName from usersInformation ui where ui.nickname = 'dev.rodrig'

select * from users where nickname = ?, password = ?

create table contactType(
id int identity(1,1) primary key not null,
type nvarchar(60)
)

create table contactUsers(
id int identity(1,1) primary key not null,
contact nvarchar(150),
idContactType int not null references contactType(id),
idUsersInf int not null references usersInformation(id)
)



create table questionBank(
id int identity(1,1) primary key not null,
question nvarchar(50) not null
)

create table security(
id int identity(1,1) primary key not null,
answer nvarchar(60) not null,
idQuestion int not null references questionBank(id),
nickname nvarchar(50) not null references users(nickname)
)

/*Teamwork*/

create table projects(
id int identity(1,1) primary key not null,
name nvarchar(50) not null,
description nvarchar(200),
datetime datetime not null,
condition int not null,
teams int not null,
nickname nvarchar(50) not null references users(nickname)
)

create table teams(
id int identity(1,1) primary key not null,
nicknameGuest nvarchar(50) not null references users(nickname),
permission int not null,
idProjects int not null references projects(id)
)


create table lists(
id int identity(1,1) primary key not null,
title nvarchar(60) not null,
position int not null,
idProject int not null references projects(id)
)

create table tags(
id int identity(1,1) primary key not null,
color nvarchar(20),
priority int not null,
text nvarchar(25)
)

create table cards(
id int identity primary key not null,
title nvarchar(60) not null,
members int not null,
expiration datetime,
condition int not null,
idLists int not null references lists(id),
idTags int references tags(id)
)

create table members(
id int identity(1,1) primary key not null,
member nvarchar(50) not null references  users(nickname),
idCardas int not null references cards(id)
)

/*Event manager*/
 create table events(
 id int identity(1,1) primary key not null,
 eventName nvarchar(60) not null,
 nicknameCreator nvarchar(50)not null references users(nickname),
 profilePicture image,
 coverPicture image,
 price smallmoney,
 visibility int not null,
 startDateTime datetime not null,
 endDateTime datetime not null,
 staff int not null,
 condition int not null,
 )

 alter table events alter column staff int

 select * from events

 create table staff(
 id int identity(1,1) primary key not null,
 position  int not null,
 nickname nvarchar(50) not null references users(nickname),
 idEvent int not null references events(id)
 )

 create table announcements(
 id int identity(1,1) primary key not null,
 announced nvarchar(175) not null,
 priority int not null,
 publicGoal int not null,
 condition int not null,
 nickname nvarchar(50) not null references users(nickname),
 idEvent int not null references events(id)
 )

 create table activities(
 id int identity(1,1) primary key not null,
 dateTime datetime not null,
 activity nvarchar(60) not null,
 place nvarchar(80) not null,
 condition int not null,
 description nvarchar(200),
 idEvent int not null references events(id)
 )

 create table problems(
 id int identity(1,1) primary key not null,
 problem nvarchar(190) not null,
 place nvarchar(80),
 dateTime datetime not null,
 danger int not null,
 condition int not null,
 nickname nvarchar(50) not null references users(nickname),
 responsable nvarchar(50) not null references users(nickname),
 idEvent int not null references events(id)
 )

 create table tasksList(
 id int identity(1,1) primary key not null,
 title nvarchar(60) not null,
 condition int not null,
 idEvent int not null references events(id)
 )

 create table tasks(
 id int identity(1,1) primary key not null,
 task nvarchar(60) not null,
 condition int not null,
 visible int not null,
 price smallmoney,
 idTasksLists int not null references tasksList(id)
 )

 create table checkList(
id int identity(1,1) primary key not null,
title nvarchar(60) not null,
idBelongs int not null,
condition int not null,
foreign key(idBelongs) references cards(id),
foreign key(idBelongs) references tasks(id)
)

create table checks(
id int identity(1,1) primary key not null,
content nvarchar(300) not null,
condition int not null,
visible int not null,
idCheckList int not null references checkList(id)
)


 create table calendars(
 id int identity(1,1) primary key not null,
 name nvarchar(60) not null,
 color nvarchar(20) not null,
 nickname nvarchar(50) references users(nickname)
 )

 create table personalEvents(
 id int identity(1,1) primary key not null,
 title nvarchar(60) not null,
 place nvarchar(80),
 stratDateTime datetime not null,
 endDateTime datetime not null,
 allDay int not null,
 repeat int not null,
 alert numeric(8,2),
 note nvarchar(250),
 idCalendar int not null references calendars(id),
 nickname nvarchar(50) not null references users(nickname)
 )

 create table reminders(
 id int identity(1,1) primary key not null,
 condition int not null,
 reminder nvarchar(200) not null,
 alarmDateTime datetime,
 repeat int not null,
 nickname nvarchar(50) not null references users(nickname)
 )

 create table horary(
 id int identity(1,1) primary key not null,
 name nvarchar(90) not null,
 nickname nvarchar(50) not null references users(nickname)
 )

 create table class(
 id int identity(1,1) primary key not null,
 dayNumber int not null,
 condition int not null,
 nameClass nvarchar(90) not null,
 startTime time not null,
 endTime time not null,
 remember int not null,
 idHorary int not null references horary(id)
 )

 create table homework(
 id int identity(1,1) primary key not null,
 nameHomework nvarchar(300) not null,
 date date not null,
 priority int not null,
 note nvarchar(200),
 idClass int not null references class(id)
 )

 create table usersBinnacle(
id int identity(1,1) primary key not null,
description nvarchar(200) not null,
dateTime datetime not null,
nickname nvarchar(50) not null references users(nickname),
idProject int references projects(id),
idEvent int references events(id)
)


insert into genders values (0, 'Femenino')
 insert into genders values (1, 'Masculino')

 select * from genders

 insert into memberships values('Free','free', 1, 40, 1, 0, 50, 0)
 insert into memberships values('Vip','vip', 1, -1, 10, 50, 500, 49.90)
 insert into memberships values('Premium','premium', 1, -1, -1, -1, -1, 179.90)

 select * from memberships

 select * from users

 delete from usersInformation where nickname = 'dev.rodrig'
 delete from users where nickname = 'dev.rodrig'

 select * from usersInformation

 select * from events

 select m.name, m.description, m.condition, m.numberEvents, m.numberAdmins, m.numberModerators, m.numberGuests from memberships m where m.id = 1

 SELECT m.name, m.description, m.condition, m.numberEvents, m.numberAdmins, m.numberModerators, m.numberGuests FROM memberships m WHERE m.id = 2