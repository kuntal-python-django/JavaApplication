mysql> create table Students(
    -> firstname varchar(20),
    -> lastname varchar(20),
    -> email varchar(255),
    -> phone varchar(10),
    -> coursename varchar(100),
    -> fees float(6,2),
    -> batchtime varchar(100));
Query OK, 0 rows affected (0.22 sec)

mysql> create table Teachers(
    -> firstname varchar(20),
    -> lastname varchar(20),
    -> email varchar(255),
    -> phone varchar(10),
    -> department varchar(100),
    -> qualifications varchar(50));
Query OK, 0 rows affected (0.17 sec)