# STORED PROCEDURE
Stored Procedure is a routine. It contains multiple SQL statements along with programming constructs.

```SQL
CREATE PROCEDURE sp_procedure_name
BEGIN
	BODY......
END;
```
# STORED FUNCTION
Stored Functions are MySQL programs like stored procedures. IN Parameter only
```SQL
CREATE FUNCTION fn_function_name
RETURNS TYPE
[NOT] DETERMINISTIC
BEGIN
	BODY
	RETURN v_result;
END;
```
# TRIGGER
*A trigger is a stored program invoked automatically in response to an event such as insert, update, or delete that occurs in the associated table
```SQL
CREATE TRIGGER trig_name
[ BEFORE | AFTER ] {insert | update | delete} ON table_name
FOR EACH ROW
BEGIN
   BODY...
END;
```
# ERROR HANDELING

* Declaring a handler
```SQL
	DECLARE [END | CONTINUE ] HANDLER FOR condition_value statement;
```

# Differences between Stored Procedure and Function

* The function must return a value but in Stored Procedure it is optional. Even a procedure can return zero or n values.
* Functions can have only input parameters for it whereas Procedures can have input or output parameters.
* Functions can be called from Procedure whereas Procedures cannot be called from a Function.

# FUNCTION MADHUN PROCEDURE NAI CALL KARU SHAKAT

# CURSOR

* Cursor is a special variable.
* Cursor is used to read records one by one from a SELECT query.

```SQL
DECLARE v_flag INT DEFAULT 0;
DECLARE CONTINUE HANDLER FOR NOTFOUND SET v_flag = 1;
DECLARE v_cur CURSOR FOR SELECT ...;
OPEN v_cur;
label: LOOP
FETCH v_cur INTO variables;
IF v_flag = 1 THEN
LEAVE label;
END IF;
process variables;
...
END LOOP;
CLOSE v_cur;
```
# Steps for creating a cursor

1. Declare Cursor
DECLARE cursor_name CURSOR FOR  
Select statement;  

2. Open Cursor
Open cursor_name;  

3. Fetch Cursor
FETCH [ NEXT [ FROM ] ] cursor_name INTO variable_list;  

4. Close Cursor
Close cursor_name;

# VIEW
* A view is a virtual table based on the result-set of an SQL statement.

# INDEX
```SQL
CREATE INDEX index_name ON table_name (column_list)
```
```SQL
SHOW INDEXES FROM employees;
```
