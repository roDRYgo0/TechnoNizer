create database BD_TechnoNizer

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

select * from memberships

/*UPDATE memberships SET name = ?, description = ?, condition = ?, numberEvents = ?, numberAdmins = ?, numberModerators = ?, numberGuests = ?, price = ? WHERE id = ?*/

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
keygen nvarchar(40),
checkKeygen int,
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


create table contactType(
id int identity(1,1) primary key not null,
type nvarchar(60)
)

insert into contactType values ('Tel�fono'),('Email')

create table contactUsers(
id int identity(1,1) primary key not null,
contact nvarchar(150),
idContactType int not null references contactType(id),
idUsersInf int not null references usersInformation(id),
condition int not null
)

create table questionBank(
id int identity(1,1) primary key not null,
question nvarchar(50) not null
)
alter table questionBank alter column question nvarchar(100) not null

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

alter table projects alter column datetime nvarchar(30)

insert into projects values ('Expo','La expo para technonizer 2018','2018-08-23 10:25:13:031',1,0,'dev.rodrig')

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
 visibility int not null,
 startDateTime nvarchar(30) not null,
 endDateTime nvarchar(30) not null,
 staff int,
 condition int not null,
 )

 create table tickets(
 id int identity(1,1) not null,
 nameTicket nvarchar(35) not null,
 priceTicket smallmoney not null,
 idEvetn int not null references events(id)
 )
 

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
 alter table reminders alter column alarmDateTime nvarchar(30)

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

 
 drop table usersBinnacle

 create table usersBinnacle(
id int identity(1,1) primary key not null,
description nvarchar(200) not null,
dateTime nvarchar(360) not null,
nickname nvarchar(50) not null references users(nickname),
idType int not null
)

select * from genders

insert into genders values (0, 'Femenino')
insert into genders values (1, 'Masculino')


insert into memberships values('Free','free', 1, 40, 1, 0, 50, 0)
insert into memberships values('Vip','vip', 1, -1, 10, 50, 500, 49.90)
insert into memberships values('Premium','premium', 1, -1, -1, -1, -1, 179.90)

update users set condition = 3 where nickname = 'ElianFran'

SELECT u.nickname, ui.firstName, ui.lastName, ui.birthdate, u.mail, ui.id_gender, u.condition, u.idMemberships, u.durationMem, u.imagen, u.keygen, u.checkKeygen, ui.id FROM users u, usersInformation ui WHERE u.nickname = ui.nickname

SELECT count(*) FROM events WHERE nicknameCreator = 1

select m.numberEvents from memberships m where m.id = 1


SELECT count(*) FROM staff s, events e WHERE s.idEvent = e.id and s.nickname = 'dev.rodriga'

SELECT u.nickname, ui.firstName, ui.lastName, ui.birthdate, u.mail, ui.id_gender, u.condition, u.idMemberships, u.durationMem, u.imagen, u.keygen, u.checkKeygen, ui.id FROM users u,usersInformation ui WHERE u.nickname = ui.nickname

select gender from genders where id = 1
SELECT m.name FROM memberships m WHERE m.id = 1

SELECT * FROM memberships

select *from usersBinnacle where nickname = 'cerritosluis123'
	


select * from users
update users set condition = 3 where nickname = 'dev.rodrig'
select * from usersInformation
select * from security

delete from usersBinnacle
delete from homework where idClass = class.id and class.idHorary =  horary.id and horary.nickname = 'Alexgve7'
delete from class where class.idHorary =  horary.id and horary.nickname = 'Alexgve7'
delete from horary where nickname = 'Alexgve7'
delete from reminders where reminders.nickname = 'Alexgve7'
delete from personalEvents where personalEvents.nickname = 'Alexgve7'
delete from calendars where calendars.nickname = 'Alexgve7'
delete from contactUsers where nickname = 'Alexgve7'
delete from tickets where nickname = 'Alexgve7'
delete from events where nickname = 'Alexgve7' 
delete from reminders where nickname = 'Alexgve7'

delete from usersBinnacle  where nickname = 'Alexgve7'
delete from events where nicknameCreator = 'Alexgve7' 
delete from security where nickname = 'Alexgve7'
delete from projects where nickname = 'Alexgve7'
delete from usersInformation where nickname = 'Alexgve7'
delete from users  where nickname = 'Alexgve7'


select * from security

delete from security

delete from questionBank

select * from questionBank

insert into questionBank values
('�Cu�l es la pieza que m�s amas de tu cl�set?'),
('�Cada cu�nto te ejercitas?'),
('�En cu�l trabajo no ser�as el mejor?'),
('�Cu�l h�bito detestas de otras personas?'),
('�Cu�l crees que es tu principal habilidad?'),
('�Cu�l es tu trago favorito?'),
('�Cu�l pa�s mueres por conocer?'),
('�A que pa�s o ciudad no volver�as? �Por qu�?'),
('�Qu� canciones te sabes de memoria?'),
('�Eres una persona puntual o siempre llegas tarde?'),
('�Tuviste mascotas de peque�o?'),
('�Qu� cosas te gustar�a saber del universo?'),
('�Serie favorita?'),
('Si pudieras viajar en el tiempo. �D�nde fueras?'),
('�Qu� actividades o detalles pueden mejorar tu d�a?'),
('�Qu� g�nero de pel�culas odias?'),
('�Cu�l es el libro que marc� tu vida?'),
('Si pudieras ponerle un t�tulo a tu vida� �Cu�l ser�a?'),
('�C�mo describir�as tu fin de semana perfecto?'),
('�Cu�l crees que es el mejor d�a del a�o?'),
('Que llevar�as si quedaras varado en una isla'),
('�Qu� es lo que m�s te emociona vivir de los pr�ximos 10 a�os?'),
('�Cu�l es el lugar m�s interesante que has visitado en tu vida?'),
('�Crees en la suerte?'),
('�Qu� opinas de la casualidad?'),
('�Sitio de internet favorito?'),
('�En qu� gastar�as si tuvieras mucho dinero?'),
('�Qu� quisieras saber del futuro?'),
('Si pudieras describir el amor en una palabra� �Cu�l ser�a?'),
('�Qu� es lo primero que ves en una persona?'),
('�Cualidad que te enamora?'),
('�Qui�n te inspira a ser mejor?'),
('�Cu�l ha sido el mejor cumplido que has recibido?'),
('�Qu� cosa no volver�as hacer nunca?'),
('�Tienes alguna adicci�n?'),
('�Tu olor favorito?'),
('�Qu� riesgos vale la pena intentar?'),
('�Cu�les cosas has tomado por sentado?'),
('�Qu� cosas te hacen explotar?'),
('�Te consideras una persona t�mida o extrovertida?'),
('�Cu�l es tu miedo irracional?'),
('�Cu�l es tu m�s grande inseguridad?'),
('�Cu�ndo te sientes m�s vulnerable?'),
('�Qu� te hace sentir verdaderamente vivo?'),
('�El mejor recuerdo de tu vida?'),
('�Cu�l es el mejor y el peor consejo que te han dado?'),
('�Cu�les son los 3 n�meros que han marcado tu vida?'),
('�Has salvado la vida de alguien?'),
('�En qu� te consideras bueno, pero te da pena admitirlo?'),
('�Qu� considera la gente raro en ti?'),
('�Cu�l es la lecci�n m�s dolorosa que has aprendido?'),
('Revela 3 datos curiosos de tu persona.'),
('�C�mo te gustar�a ser recordado?'),
('�De qu� te arrepientes?'),
('�Cu�l es tu mejor caracter�stica?'),
('�Qu� es lo mejor que te han dejado tus padres?'),
('�Qu� responsabilidad no te gustar�a tener?'),
('Si tu infancia tuviera un olor� �Cu�l ser�a?'),
('�Cu�l persona ha dejado m�s huella en ti?'),
('�En qu� no has madurado por completo?'),
('�Cu�l es tu rol en tu grupo de amigos?'),
('�Qu� es lo que m�s temes que las personas vean en ti?'),
('�Qu� le da significado a tu vida?'),
('�Qu� mentira dices de manera m�s recurrente?'),
('�Qu� cosas te pueden mantener despierto en la noche?'),
('�Crees en Dios?'),
('�Cu�les son las 3 cosas que te pueden hacer llorar?'),
('�Qu� pel�cula describe mejor tu vida?'),
('Una canci�n que describe tu �ltimo a�o.'),
('Una palabra que describa tu coraz�n.'),
('El deporte que podr�as practicar toda tu vida.'),
('El tipo de flores que amar�as que decorar�n toda tu casa.'),
('Si fueras un color� �Cu�l ser�as?'),
('�Qu� opinas de los tatuajes?'),
('�Qu� cosas no puedes tolerar?'),
('�Qu� ves cuando te miras al espejo?'),
('�C�mo fue tu primer amor?'),
('Describe la relaci�n con tu mam�.'),
('�Qu� opinas de las redes sociales?'),
('El postre por el que vale la pena engordar.'),
('�Qu� significa para ti "libertad"?'),
('�C�mo definir�as tu humor?'),
('�Qu� es lo que m�s valoras de una amistad?'),
('�Qu� superpoder tendr�as?'),
('�Le temes a la muerte?'),
('�Qu� tipo de m�sica te pone a bailar?'),
('�Qu� cambiar�as de tu vida?'),
('�Cu�l es la locura m�s grande que has hecho?'),
('Palabra favorita.'),
('�Cu�l es la emoci�n que menos te gusta sentir?'),
('�Qu� hiciste en tu �ltimo cumplea�os?'),
('�Cu�l es la cosa que m�s amas en todo el mundo?')
select * from usersInformation

select u.nickname, ui.firstName, ui.lastName, ui.birthdate, g.gender, COUNT(p.name) from users u, usersInformation ui, genders g, projects p, events e where g.id = ui.id_gender and u.nickname = ui.nickname and p.nickname = u.nickname and e.nicknameCreator = u.nickname 
