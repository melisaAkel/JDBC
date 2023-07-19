create table person(id integer not null, name varchar(255) not null, location varchar(255), birth_date timestamp, primary key(id));
INSERT INTO person(id, name, location, birth_date) values (1, 'Melisa', 'Aksaray', CURDATE());
INSERT INTO person(id, name, location, birth_date) values (2, 'İrem', 'Niğde', CURDATE());
INSERT INTO person(id, name, location, birth_date) values (3, 'Ayşe', 'Ankara', CURDATE());
INSERT INTO person(id, name, location, birth_date) values (4, 'Fatma', 'İstanbul', CURDATE());