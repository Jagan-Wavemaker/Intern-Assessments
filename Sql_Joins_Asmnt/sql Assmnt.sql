use sqlassmnt;
CREATE TABLE Employee(
					  emp_name varchar(20),
                      emp_id int,
                      emp_email varchar(25),
                      emp_ph varchar(11));
show tables in sqlassmnt;
ALTER TABLE Employee
MODIFY COLUMN emp_ph varchar(11);
SHOW COLUMNS FROM Employee FROM sqlassmnt; 
select * from Employee where emp_id=100;
INSERT INTO Employee VALUES(
							"JaganChowhaan",
                            100,
                            "jaganchowhaan@gmail.com",
                            7989570994
							);
INSERT INTO Employee VALUES(
							"Aryan",
                            200,
                            "aryan@gmail.com",
                            7373382929
							);
INSERT INTO Employee VALUES(
							"Aftab",
                            300,
                            "aftab@gmail.com",
                            9023478654
							);
INSERT INTO Employee VALUES(
							"Vivek",
                            400,
                            "vivek@gmail.com",
                            7982317654
							);
INSERT INTO Employee VALUES(
							"Shivam",
                            500,
                            "shivam@gmail.com",
                            9087630994
							);
SHOW COLUMNS FROM Employee;
select * from Employee;

CREATE TABLE Department(
					  dept_name varchar(20),
                      dept_no int
                      );
INSERT INTO Department VALUES(
							"development",
                            123
                            );
select *  from Department;
truncate Department;
select * from Department;
drop table Department;
show tables;
ALTER TABLE Department RENAME Departments;
CREATE TABLE Department(
					  dept_name varchar(20),
                      dept_no int
                      );
INSERT INTO Department VALUES(
							"marketing",
                            123
                            );
ALTER TABLE Department RENAME Departments;
show tables from sqlassmnt;
ALTER TABLE Departments RENAME Department;
show tables from sqlassmnt;
INSERT INTO Department VALUES(
							"development",
                            456
                            );
INSERT INTO Department VALUES(
							"product dev",
                            123
                            );
UPDATE Departments set dept_no = 789 where dept_no = 123;
UPDATE Department set dept_no = 789 where dept_no = 123;
UPDATE Department set dept_no = 789 where dept_name = "product dev";
show tables from sqlassmnt;
select * from department;
select * from sqlassmnt;
show tables from sqlassmnt;
show tables;
select * from department;
select * from employee;
CREATE TABLE address(
					add_id int,
                    add_details varchar(100),
                    add_type varchar(30)
    );
select * from address;
INSERT INTO address VALUES(
						   100,
                           "software units Layout, Hitech city",
                           "corporate"
);
select * from address;
INSERT INTO address VALUES(
						   200,
                           "Hitech city",
                           "personal"
);
INSERT INTO address VALUES(
						   300,
                           "Madhapur",
                           "personal"
);
INSERT INTO address VALUES(
						   400,
                           "Mindspace opp to cognizant",
                           "corporate"
);
select * from address;
show tables from sqlassmnt;
show tables;
select add_type, add_id from address;
select emp_id, emp_name, emp_email 
from employee
inner join address on employee.emp_id = address.add_id;
select * from employee;
select emp_name, emp_ph, emp_email 
from employee
left join department on employee.emp_id = department.dept_id;
select * from department;
select emp_name, emp_ph, emp_email 
from employee
left join address on employee.emp_id = address.add_id;
select emp_name, emp_ph, emp_email 
from employee
right join address on employee.emp_id = address.add_id;
