SHOW Databases;

CREATE DATABASE IF NOT EXISTS toDoApp; 

USE toDoApp;

CREATE TABLE IF NOT EXISTS toDoList (
id INT unsigned NOT NULL AUTO_INCREMENT, 
task VARCHAR(300) NOT NULL, 
date_added DATE NOT NULL, 
date_due DATE NOT NULL, 
priority ENUM ('low', 'high'), 
PRIMARY KEY (id)
);

INSERT INTO toDoList (task, date_added, date_due, priority)
VALUES ('Washing', '2020-04-21', '2020-04-22', "high"), ('Cooking', '2020-04-21', '2020-04-22', "high"), ('Shopping', '2020-04-21', '2020-04-22', "low");

SELECT * FROM todoList;

SELECT task, due_date, priority
FROM todolist
WHERE task = "shopping";

SELECT task, due_date, priority
FROM todolist
WHERE task = "shopping";


