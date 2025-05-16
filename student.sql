CREATE TABLE users (
  SRN INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(255),
  AGE INT,
  PHONE VARCHAR(20),
  ADDRESS VARCHAR(255)
);

CREATE TABLE students (
  SRN INT PRIMARY KEY AUTO_INCREMENT,
  NAME VARCHAR(255),
  COURSE VARCHAR(255),
  AGE INT,
  CGPA DECIMAL(3,2)
);


INSERT INTO users (NAME, AGE, PHONE, ADDRESS)
VALUES
  ('Penina', 19, '1234567890', 'Olakunrin Hostel'),
  ('John', 17, '9876543210', 'Atiku Hostel'),
  ('Wunmi', 20, '5551234567', 'Babade Hostel'),
  ('Richard', 17, '9012345678', 'Atiku Hostel'),
  ('Michael', 18, '1112223333', 'Atiku Hostel');


INSERT INTO students (NAME, COURSE, AGE, CGPA)
VALUES
  ('Penina', 'Computer Science', 19, 4.3),
  ('John', 'Computer Engineering', 17, 4.5),
  ('Wunmi', 'Nursing', 20, 4.0),
  ('Richard', 'Geology', 17, 4.4),
  ('Michael', 'Biomedical Engineering', 18, 4.6);
