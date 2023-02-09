# CatsCatsCREATE DATABASE Human_friends;
USE Human_friends;
CREATE TABLE Cats (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10)
);
CREATE TABLE Dogs (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10)
);
CREATE TABLE Humsters (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10)
);
CREATE TABLE Camels (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10),
    capacity INTEGER
);
CREATE TABLE Donkeys (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10),
    capacity INTEGER
);
CREATE TABLE Horses (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10),
    capacity INTEGER
); 

ALTER TABLE Cats ADD COLUMN skill VARCHAR(10) AFTER color;
ALTER TABLE Dogs ADD COLUMN skill VARCHAR(10) AFTER color;
ALTER TABLE Humsters ADD COLUMN skill VARCHAR(10) AFTER color;
ALTER TABLE Camels ADD COLUMN skill VARCHAR(10) AFTER color;
ALTER TABLE Horses ADD COLUMN skill VARCHAR(10) AFTER color;
ALTER TABLE Donkeys ADD COLUMN skill VARCHAR(10) AFTER color;

INSERT INTO Cats (name, birthday, color, skill)
VALUES 
("Murzic", "2020-11-11", "black", "scratching"),
("Bobby", "2021-12-12", "brown", "meow");

INSERT INTO Dogs (name, birthday, color, skill)
VALUES 
("Sharic", "2018-11-11", "black", "run"),
("Tuzic", "2017-12-12", "white", "crawl");

INSERT INTO Humsters (name, birthday, color, skill)
VALUES 
("Hum", "2022-10-11", "gray", "running"),
("Ster", "2023-10-12", "brown", "to hide");

INSERT INTO Donkeys (name, birthday, color, skill, capacity)
VALUES 
("Tom", "2010-11-11", "gray", "scratching", 20),
("Don", "2012-12-12", "brown", "yell", 18);

INSERT INTO Horses (name, birthday, color, skill, capacity)
VALUES 
("Dunkan", "2012-05-10", "red", "kicking", 100),
("Diana", "2014-10-31", "white", "jump", 90);

INSERT INTO Camels (name, birthday, color, skill, capacity)
VALUES 
("Buran", "2013-01-23", "white", "spit", 150),
("Dastan", "2015-12-23", "brown", "drink", 153);

DROP TABLE Camels;

CREATE TABLE Beasts (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10),
    skill VARCHAR(30),
    capacity INTEGER
);

INSERT INTO Beasts (name, birthday, color, skill, capacity)
SELECT name, birthday, color, skill, capacity FROM Horses
UNION
SELECT name, birthday, color, skill, capacity FROM Donkeys;


CREATE TABLE Young_animals (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10),
    skill VARCHAR(30),
    age INTEGER
);

INSERT INTO Young_animals (name, birthday, color, skill, age)
SELECT name, birthday, color, skill, DATEDIFF(CURDATE(), birthday) / 30 AS age FROM Beasts
WHERE birthday BETWEEN CURDATE() - INTERVAL 3 YEAR 
AND CURDATE() - INTERVAL 1 YEAR
UNION ALL
SELECT name, birthday, color, skill, DATEDIFF(CURDATE(), birthday) / 30 AS age FROM Cats
WHERE birthday BETWEEN CURDATE() - INTERVAL 3 YEAR 
AND CURDATE() - INTERVAL 1 YEAR
UNION ALL
SELECT name, birthday, color, skill, DATEDIFF(CURDATE(), birthday) / 30 AS age  FROM Dogs
WHERE birthday BETWEEN CURDATE() - INTERVAL 3 YEAR 
AND CURDATE() - INTERVAL 1 YEAR
UNION ALL
SELECT name, birthday, color, skill, DATEDIFF(CURDATE(), birthday) / 30 AS age  FROM Humsters
WHERE birthday BETWEEN CURDATE() - INTERVAL 3 YEAR 
AND CURDATE() - INTERVAL 1 YEAR;

CREATE TABLE Animals (
	id INTEGER PRIMARY KEY auto_increment,
    name VARCHAR(20),
    birthday DATE,
    color VARCHAR(10),
    skill VARCHAR(30),
    kind VARCHAR(10)
);

INSERT INTO Animals(name, birthday, color, skill, kind)
SELECT name, birthday, color, skill, 'donkey' AS kind
FROM Donkeys
UNION
SELECT name, birthday, color, skill, 'horse' AS kind
FROM Horses
UNION
SELECT name, birthday, color, skill, 'dog' AS kind
FROM Dogs
UNION
SELECT name, birthday, color, skill, 'cat' AS kind
FROM Cats
UNION
SELECT name, birthday, color, skill, 'hamster' AS kind
FROM Humsters;

