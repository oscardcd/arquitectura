/*creacio de la base de datos*/
create database Empresa981

/*creacion de la tabla empleado*/
create table empleado(
	identificacion varchar(12) PRIMARY KEY,
	nombre varchar(20),
	ar_trabajo varchar(20),
	cargo varchar(20),
	sueldo float
	)

/*creacion procedimiento almacenado para guardar*/

	create procedure  usp_guardar_empleado
		@identificacion varchar(12),
		@nombre varchar(20),
		@ar_trabajo varchar(20),
		@cargo varchar(20),
		@sueldo float
	as
	begin
		insert into empleado (identificacion,nombre,ar_trabajo,cargo,sueldo)
						values(@identificacion,@nombre,@ar_trabajo,@cargo,@sueldo)
	end

/*crear procedumiento actualizar empleado*/
	create procedure usp_actualizar_empleado
		@identificacion varchar(12),
		@nombre varchar(20),
		@ar_trabajo varchar(20),
		@cargo varchar(20),
		@sueldo float
	as
	begin
		update empleado set nombre=@nombre, ar_trabajo=@ar_trabajo,cargo=@cargo, sueldo=@sueldo
		where identificacion=@identificacion
	end
/*crear procedimiento eliminar empleado*/
	create procedure usp_eliminar_empleado
		@identificacion varchar(12)
		as
		begin
			delete from empleado where identificacion=@identificacion
		end
/* consultar empleado por identificacion*/
	create procedure usd_consulta_empleado
		@identificacion varchar(12)
		as
		begin
			select * from empleado where identificacion=@identificacion
		end
/*listas los empleado*/
	create procedure usd_listar_empleados
		as
		begin
			select * from empleado
		end
/*ejecucion procedimiento*/
execute	usp_guardar_empleado '4','juana','desarrollo','desarrollador senior',7500000
execute usp_actualizar_empleado '1','alberto','mecanico','mecanico 1',1500000
execute usp_eliminar_empleado '4'
execute usd_consulta_empleado '2'
execute usd_listar_empleados

