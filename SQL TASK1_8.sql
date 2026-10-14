/// TASK 1 

CREATE DATABASE employee_management;

CREATE TABLE departments (
    department_id INTEGER PRIMARY KEY,
    department_name VARCHAR(50),
    location VARCHAR(50)
);


Select *from Employees;           // Check table created 


CREATE TABLE employees (
    employee_id INTEGER PRIMARY KEY,
    employee_name VARCHAR(100),
    email VARCHAR(100),
    salary DECIMAL,
    department_id INTEGER,
    city VARCHAR(50),
    joining_date DATE,
    FOREIGN KEY (department_id)
        REFERENCES departments(department_id)
);

Select *from Employees;           // Check table created 


ALTER TABLE employees
ADD COLUMN phone_number VARCHAR(15);

Select *from Employees;           // Check column added 


ALTER TABLE employees
ALTER COLUMN city TYPE VARCHAR(100);                 // size change

ALTER TABLE employees
RENAME COLUMN phone_number TO contact_number;


Select *from Employees;       // check changes


CREATE TABLE practice_table (
    id INTEGER,
    name VARCHAR(50)
);



TRUNCATE TABLE practice_table;

DROP TABLE practice_table;


//TASK 2

INSERT INTO departments
(department_id, department_name, location)
VALUES
(1, 'IT', 'Mumbai'),
(2, 'HR', 'Pune'),
(3, 'Finance', 'Mumbai'),
(4, 'Sales', 'Delhi'),
(5, 'Testing', 'Pune')
(6,'Support','Banglore'),
(7,'sales','Gujarat');


INSERT INTO employees
(employee_id, employee_name, email, salary, department_id, city, joining_date, Phone_number)
VALUES
(1, 'Neha Verma', 'neha@gmail.com', 55000, 1, 'Mumbai', '2025-01-15', '9876541231'),
(2, 'Simran Singh', 'simran@gmail.com', 40000, 2, 'Gujarat', '2024-03-20', '1236547891'),
(3, 'Siddhant Kamble', 'siddhant@gmail.com', 55000, 1, 'Bangalore', '2025-02-10', '8757848754'),
(4, 'Nitin Pawar', 'nitin@gmail.com', 42000, 3, 'Pune', '2023-07-12', '1235647883'),
(5, 'Tanishq Verma', 'tanishq@gmail.com', 42000, 1, 'Delhi', '2025-04-01', '5647994561'),
(6, 'Neha Kumari', 'nehak@gmail.com', 28000, 2, 'Mumbai', '2024-08-18', '9865423654'),
(7, 'Rohan Mehta', 'rohan@gmail.com', 65000, 4, 'Pune', '2025-01-05', '5423698751'),
(8, 'Piyush Shah', 'piyush@gmail.com', 39000, 5, 'Mumbai', '2023-11-25', '5649875123'),
(9, 'Anil Roy', 'anil@gmail.com', 45000, 3, 'Delhi', '2025-06-15', '6653245896'),
(10, 'Nilima Rao', 'nilima@gmail.com', 52000, 5, 'Pune', '2024-12-10', '9865423651');

Select *from Employees;    // check


UPDATE employees
SET salary = 60000
WHERE employee_id = 2;

Select *from Employees;     // check

UPDATE employees
SET city = 'Mumbai'
WHERE employee_id = 3;

Select *from Employees;    // check


UPDATE employees
SET salary = salary + 500
WHERE department_id = 2;


Select *from Employees;    // check Updating salaries of employees in one department


DELETE FROM employees
WHERE employee_id = 10;

Select *from Employees;    // check


INSERT INTO employees
(employee_id, employee_name, email, salary, department_id, city, joining_date, phone_number)
VALUES
(10, 'Vaishnavi ', 'Vaishnavi@gmail.com', 58000, 4, 'Mumbai', '2025-08-01', '1234567892');


Select *from Employees;    // check










///  Task 3 – DQL / SELECT Queries  ///



SELECT * FROM employees; 

SELECT employee_name, salary
FROM employees;

SELECT *
FROM employees
WHERE salary < 30000;


SELECT *
FROM employees
WHERE city = 'Mumbai';


SELECT *
FROM employees
WHERE salary BETWEEN 30000 AND 70000;

SELECT *
FROM employees
WHERE city <> 'Mumbai';

SELECT *
FROM employees
WHERE employee_name LIKE 'A%';


SELECT *
FROM employees
WHERE employee_name LIKE '%a%';

SELECT DISTINCT city
FROM employees;

SELECT *
FROM employees
WHERE department_id IN (1, 2, 3);




 /// Task 4 – SQL Clauses ///

SELECT *
FROM employees
WHERE salary > 40000; 


SELECT *
FROM employees
ORDER BY salary DESC;

SELECT *
FROM employees
ORDER BY employee_name ASC;


SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id;


SELECT department_id, COUNT(*) AS employee_count
FROM employees
GROUP BY department_id
HAVING COUNT(*) > 2;


///  Task 5 – Aggregate Functions ///


SELECT COUNT(*) AS total_employees            // COUNT//
FROM employees;


SELECT SUM(salary) AS total_salary         // SUM //
FROM employees;

SELECT AVG(salary) AS average_salary      // AVG //
FROM employees;


SELECT MIN(salary) AS minimum_salary      // MIN // 
FROM employees;

SELECT MAX(salary) AS maximum_salary      // MAX // 
FROM employees;


SELECT department_id,
       AVG(salary) AS average_salary     // AVG sal Based on dept // 
FROM employees
GROUP BY department_id;


SELECT department_id,
       COUNT(*) AS employee_count    // Number of employee based on dept //
FROM employees
GROUP BY department_id;


SELECT department_id,
       MAX(salary) AS maximum_salary
FROM employees
GROUP BY department_id;



/// Task 6 – JOINs  ///

// inner join //

SELECT
    d.department_name,             
    e.employee_name,
    e.salary
FROM departments d
LEFT JOIN employees e
    ON d.department_id = e.department_id;


// left join //

SELECT
    d.department_name,
    e.employee_name,
    e.salary
FROM departments d
LEFT JOIN employees e
    ON d.department_id = e.department_id;


// right join // 


SELECT
    e.employee_name,
    e.salary,
    d.department_name
FROM employees e
RIGHT JOIN departments d
    ON e.department_id = d.department_id; 


// Full outer  join // 


SELECT
    e.employee_name,
    e.salary,
    d.department_name
FROM employees e
FULL OUTER JOIN departments d
    ON e.department_id = d.department_id;




 ///  Task 7 - TCL Commands // 


 // commit //

BEGIN;

INSERT INTO employees
(employee_id, employee_name, email, salary, department_id, city, joining_date, phone_number)
VALUES
(12, 'Vikas More', 'vikas@gmail.com', 50000, 2, 'Pune', '2026-01-10', '9876543211');

COMMIT;

SELECT *
FROM employees
WHERE employee_id = 12;

// ROLLBACK //

BEGIN;

UPDATE employees
SET salary = 90000
WHERE employee_id = 1;

ROLLBACK;

SELECT employee_id, employee_name, salary
FROM employees
WHERE employee_id = 1;



// save point //

BEGIN;

UPDATE employees
SET salary = 60000
WHERE employee_id = 1;

SAVEPOINT salary_updated;

DELETE FROM employees
WHERE employee_id = 2;

ROLLBACK TO salary_updated;
COMMIT;







	