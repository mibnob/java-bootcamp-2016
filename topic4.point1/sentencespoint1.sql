create database high-school;
use high-school;


CREATE TABLE student (id_student INT NOT NULL AUTO_INCREMENT,
 "first_name" VARCHAR(25) NOT NULL,
 "last_name" VARCHAR (25) NOT NULL, 
 "registration_number" INT NOT NULL,
 "date_of_birth" DATE,
 PRIMARY KEY (id_student));
 constraint fk_registration_number foreign key (registration_number)
      references teacher (id_course));
 
 CREATE TABLE teacher (id_teacher INT NOT NULL AUTO_INCREMENT,
 "first_name" VARCHAR(25) NOT NULL,
 "last_name" VARCHAR(25) NOT NULL,
 "date_of_birth" DATE,
 PRIMARY KEY (id_teacher));
 
 CREATE TABLE course (id_course INT NOT NULL AUTO_INCREMENT,
 "name" VARCHAR (100) NOT NULL,
 "assigned_teacher" INT NOT NULL,
 "hours_by_week" INT NOT NULL,
 "schedule_time" VARCHAR(150) NOT NULL,
 PRIMARY KEY (id_course),
constraint fk_assigned_teacher foreign key (assigned_teacher)
      references teacher (id_teacher));

 
 
 