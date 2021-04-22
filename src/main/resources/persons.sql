use hibernate;

drop table persons;

create table persons
(
    id             long,
    name           varchar(255),
    surname        varchar(255),
    age            int,
    phone_number   int,
    city_of_living varchar(255),
    constraint pk_person primary key (name, surname, age)
);

insert into persons (id, name, surname, age, phone_number, city_of_living)
VALUES (1, 'Ivan', 'Ivanov', '20', '2222222', 'Moscow');
insert into persons (id, name, surname, age, phone_number, city_of_living)
VALUES (2, 'Ivan1', 'Ivanov1', '18', '2222222', 'Saint-Petersburg');
insert into persons (id, name, surname, age, phone_number, city_of_living)
VALUES (3, 'Ivan2', 'Ivanov2', '30', '2222222', 'Orel');
insert into persons (id, name, surname, age, phone_number, city_of_living)
VALUES (4, 'Ivan3', 'Ivanov3', '50', '2222222', 'Moscow');
insert into persons (id, name, surname, age, phone_number, city_of_living)
VALUES (5, 'Ivan4', 'Ivanov4', '40', '2222222', 'Novgorod');

