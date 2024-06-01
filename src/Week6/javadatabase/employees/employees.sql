CREATE TABLE employees (
        id SERIAL PRIMARY KEY,
        employee_name VARCHAR(255),
        position VARCHAR(255),
        salary INT
        );

        insert into employees (employee_name, position,salary) values ('Chris', 'Accountant',5000);
        insert into employees (employee_name, position,salary) values ('Tom', 'Project Manager',4000);
        insert into employees (employee_name, position,salary) values ('Nick', 'Manager',3000);
        insert into employees (employee_name, position,salary) values ('Suzanne', 'Manager',7000);
        insert into employees (employee_name, position,salary) values ('Anna', 'Executive',3000);



        select *
        from employees
