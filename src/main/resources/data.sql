
CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    date_of_birth DATE
);

CREATE TABLE Teacher (
    id UUID PRIMARY KEY
--    first_name VARCHAR(50),
--    last_name VARCHAR(50),
--    email VARCHAR(100),
--    phone_number VARCHAR(20)
);

--CREATE TABLE Classes (
--    class_id INT PRIMARY KEY,
--    class_name VARCHAR(100),
--    teacher_id INT,
--    room_number VARCHAR(20),
--    start_time TIME,
--    end_time TIME,
--    FOREIGN KEY (teacher_id) REFERENCES Teachers(teacher_id)
--);

---- Create Enrollments table
--CREATE TABLE Enrollments (
--    enrollment_id INT PRIMARY KEY,
--    student_id INT,
--    class_id INT,
--    enrollment_date DATE,
--    FOREIGN KEY (student_id) REFERENCES Students(student_id),
--    FOREIGN KEY (class_id) REFERENCES Classes(class_id)
--);

INSERT INTO Student (student_id, first_name, last_name, date_of_birth)
VALUES
    (1,'John', 'Doe', '2008-05-10'),
    (2,'Alice', 'Smith', '2009-08-15');