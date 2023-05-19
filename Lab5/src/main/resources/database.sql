CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    patronymic VARCHAR(255),
    birth_date DATE,
    number VARCHAR(255)
);

insert into students values (1, 'Vlad', 'Skoryk', 'Maxymovych', '2003-07-04', '123456789')
insert into students values (2, 'Stas', 'Zaycev', 'Ivanovich', '2003-01-15', '987654321')
insert into students values (3, 'Dmitry', 'Zaycev', 'Ivanovich', '2003-09-15', '516372846')
insert into students values (4, 'Liza', 'Skoryk', 'Maxymovna', '2003-07-12', '123456789')
insert into students values (5, 'Ivan', 'Petrov', 'Ivanovich', '2003-10-12', '000000000')
insert into students values (6, 'Kateryna', 'Skoryk', 'Maxymovna', '2005-07-12', '123456789')