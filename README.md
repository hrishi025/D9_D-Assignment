# STORED PROCEDURE
Stored Procedure is a routine. It contains multiple SQL statements along with programming constructs.

```SQL
CREATE PROCEDURE sp_procedure_name
BEGIN
	BODY......
END;
```
# STORED FUNCTION
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
* Trigger is a statement that a system executes automatically when there is any modification to the database.
Types of Triggers –

We can define 6 types of triggers for each table:

* AFTER INSERT activated after data is inserted into the table.
* AFTER UPDATE: activated after data in the table is modified.
* AFTER DELETE: activated after data is deleted/removed from the table.
* BEFORE INSERT: activated before data is inserted into the table.
* BEFORE UPDATE: activated before data in the table is modified.
* BEFORE DELETE: activated before data is deleted/removed from the table.

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
