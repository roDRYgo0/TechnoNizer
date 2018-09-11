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

insert into contactType values ('Teléfono'),('Email')

create table contactUsers(
id int identity(1,1) primary key not null,
contact nvarchar(150),
idContactType int not null references contactType(id),
idUsersInf int not null references usersInformation(id),
condition int not null
)

create table questionBank(
id int identity(1,1) primary key not null,
question nvarchar(100) not null
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
datetime nvarchar(30) not null,
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
 visibility int not null,
 startDateTime nvarchar(30) not null,
 endDateTime nvarchar(30) not null,
 staff int,
 condition int not null,
 quantityTicket int not null,
 place nvarchar(200) not null,
 color nvarchar(15)
 )

 select * from events
 select * from tickets
 select * from staff
 select nickname, position from staff where idEvent 
 
 delete from staff 

 create table tickets(
 id int identity(1,1) not null,
 nameTicket nvarchar(35) not null,
 quantityTicket int not null,
 priceTicket smallmoney not null,
 idEvent int not null references events(id)
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
 alarmDateTime nvarchar(30),
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


 select * from users

 create table usersBinnacle(
id int identity(1,1) primary key not null,
description nvarchar(200) not null,
dateTime nvarchar(360) not null,
nickname nvarchar(50) not null references users(nickname),
idType int not null
)

insert into genders values (0, 'Femenino')
insert into genders values (1, 'Masculino')

select u.nickname, ui.firstName, ui.lastName, g.gender from users u, usersInformation ui, genders g where g.id = ui.id_gender and u.nickname = ui.nickname

select u.nickname, ui.firstName, ui.lastName, g.gender, ui.id_gender, g.id from users u, usersInformation ui, genders g where g.id = ui.id_gender and u.nickname = ui.nickname ORDER BY g.gender DESC

insert into memberships values('Free','free', 1, 40, 1, 0, 50, 0)
insert into memberships values('Vip','vip', 1, -1, 10, 50, 500, 49.90)
insert into memberships values('Premium','premium', 1, -1, -1, -1, -1, 179.90)

insert into questionBank values
('¿Cuál es la pieza que más amas de tu clóset?'),
('¿Cada cuánto te ejercitas?'),
('¿En cuál trabajo no serías el mejor?'),
('¿Cuál hábito detestas de otras personas?'),
('¿Cuál crees que es tu principal habilidad?'),
('¿Cuál es tu trago favorito?'),
('¿Cuál país mueres por conocer?'),
('¿A que país o ciudad no volverías? ¿Por qué?'),
('¿Qué canciones te sabes de memoria?'),
('¿Eres una persona puntual o siempre llegas tarde?'),
('¿Tuviste mascotas de pequeño?'),
('¿Qué cosas te gustaría saber del universo?'),
('¿Serie favorita?'),
('Si pudieras viajar en el tiempo. ¿Dónde fueras?'),
('¿Qué actividades o detalles pueden mejorar tu día?'),
('¿Qué género de películas odias?'),
('¿Cuál es el libro que marcó tu vida?'),
('Si pudieras ponerle un título a tu vida… ¿Cuál sería?'),
('¿Cómo describirías tu fin de semana perfecto?'),
('¿Cuál crees que es el mejor día del año?'),
('Que llevarías si quedaras varado en una isla'),
('¿Qué es lo que más te emociona vivir de los próximos 10 años?'),
('¿Cuál es el lugar más interesante que has visitado en tu vida?'),
('¿Crees en la suerte?'),
('¿Qué opinas de la casualidad?'),
('¿Sitio de internet favorito?'),
('¿En qué gastarías si tuvieras mucho dinero?'),
('¿Qué quisieras saber del futuro?'),
('Si pudieras describir el amor en una palabra… ¿Cuál sería?'),
('¿Qué es lo primero que ves en una persona?'),
('¿Cualidad que te enamora?'),
('¿Quién te inspira a ser mejor?'),
('¿Cuál ha sido el mejor cumplido que has recibido?'),
('¿Qué cosa no volverías hacer nunca?'),
('¿Tienes alguna adicción?'),
('¿Tu olor favorito?'),
('¿Qué riesgos vale la pena intentar?'),
('¿Cuáles cosas has tomado por sentado?'),
('¿Qué cosas te hacen explotar?'),
('¿Te consideras una persona tímida o extrovertida?'),
('¿Cuál es tu miedo irracional?'),
('¿Cuál es tu más grande inseguridad?'),
('¿Cuándo te sientes más vulnerable?'),
('¿Qué te hace sentir verdaderamente vivo?'),
('¿El mejor recuerdo de tu vida?'),
('¿Cuál es el mejor y el peor consejo que te han dado?'),
('¿Cuáles son los 3 números que han marcado tu vida?'),
('¿Has salvado la vida de alguien?'),
('¿En qué te consideras bueno, pero te da pena admitirlo?'),
('¿Qué considera la gente raro en ti?'),
('¿Cuál es la lección más dolorosa que has aprendido?'),
('Revela 3 datos curiosos de tu persona.'),
('¿Cómo te gustaría ser recordado?'),
('¿De qué te arrepientes?'),
('¿Cuál es tu mejor característica?'),
('¿Qué es lo mejor que te han dejado tus padres?'),
('¿Qué responsabilidad no te gustaría tener?'),
('Si tu infancia tuviera un olor… ¿Cuál sería?'),
('¿Cuál persona ha dejado más huella en ti?'),
('¿En qué no has madurado por completo?'),
('¿Cuál es tu rol en tu grupo de amigos?'),
('¿Qué es lo que más temes que las personas vean en ti?'),
('¿Qué le da significado a tu vida?'),
('¿Qué mentira dices de manera más recurrente?'),
('¿Qué cosas te pueden mantener despierto en la noche?'),
('¿Crees en Dios?'),
('¿Cuáles son las 3 cosas que te pueden hacer llorar?'),
('¿Qué película describe mejor tu vida?'),
('Una canción que describe tu último año.'),
('Una palabra que describa tu corazón.'),
('El deporte que podrías practicar toda tu vida.'),
('El tipo de flores que amarías que decorarán toda tu casa.'),
('Si fueras un color… ¿Cuál serías?'),
('¿Qué opinas de los tatuajes?'),
('¿Qué cosas no puedes tolerar?'),
('¿Qué ves cuando te miras al espejo?'),
('¿Cómo fue tu primer amor?'),
('Describe la relación con tu mamá.'),
('¿Qué opinas de las redes sociales?'),
('El postre por el que vale la pena engordar.'),
('¿Qué significa para ti "libertad"?'),
('¿Cómo definirías tu humor?'),
('¿Qué es lo que más valoras de una amistad?'),
('¿Qué superpoder tendrías?'),
('¿Le temes a la muerte?'),
('¿Qué tipo de música te pone a bailar?'),
('¿Qué cambiarías de tu vida?'),
('¿Cuál es la locura más grande que has hecho?'),
('Palabra favorita.'),
('¿Cuál es la emoción que menos te gusta sentir?'),
('¿Qué hiciste en tu último cumpleaños?'),
('¿Cuál es la cosa que más amas en todo el mundo?')


select * from activities
select * from announcements
select * from calendars
select * from cards
select * from checkList
select * from checks
select * from class
select * from contactType
select * from contactUsers
select * from events
select * from genders
select * from homework
select * from horary
select * from lists
select * from members
select * from memberships
select * from personalEvents
select * from problems
select * from projects
select * from questionBank
select * from reminders
select * from security
select * from staff
select * from tags 
select * from tasks
select * from tasksList
select * from teams
select * from tickets
select * from users
select * from usersBinnacle
select * from usersInformation