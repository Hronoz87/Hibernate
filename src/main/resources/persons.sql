use hibernate;

drop table persons;

create table persons
(
    name           varchar(255),
    surname        varchar(255),
    age            int,
    phone_number   int,
    city_of_living varchar(255),
    constraint pk_person primary key (name, surname, age)
);

insert into persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ivan', 'Ivanov', '20', '2222222', 'Moscow');
insert into persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ivan1', 'Ivanov1', '18', '2222222', 'Saint-Petersburg');
insert into persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ivan2', 'Ivanov2', '30', '2222222', 'Orel');
insert into persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ivan3', 'Ivanov3', '50', '2222222', 'Moscow');
insert into persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ivan4', 'Ivanov4', '40', '2222222', 'Novgorod');

