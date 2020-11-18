# STORED PROCEDURE
Stored Procedure is a routine. It contains multiple SQL statements along with programming constructs. IN OUT INOUT Parameter

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
 Trigger is a stored program invoked automatically in response to an event such as insert, update, or delete that occurs in the associated table. For example, you can define a trigger that is invoked automatically before a new row is inserted into a table.

```SQL
CREATE TRIGGER trig_name
[ BEFORE | AFTER ] {insert | update | delete} ON table_name
FOR EACH ROW
BEGIN
   BODY...
END;
```
# ERROR HANDELING
Exceptions are runtime problems, which may arise during execution of stored procedure, function or trigger

* Declaring a handler
```SQL
	DECLARE [END | CONTINUE ] HANDLER FOR condition_value statement;
```

# Differences between Stored Procedure and Function
* Function: SELECT, Procedure: CALL
* The function must return a value but in Stored Procedure it is optional. Even a procedure can return zero or n values.
* Functions can have only input parameters for it whereas Procedures can have input or output parameters.
* Functions can be called from Procedure whereas Procedures cannot be called from a Function.
