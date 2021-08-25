INSERT INTO Ciudad (Nombre) values
								('Cucuta'),
								('Chinacota');

INSERT INTO Planes (Nombre,Descripcion) values	('4 megas','Basico de 4 megas'),
                                                ('8 megas','Basico de 8 megas');



INSERT INTO tipo_identificacion (Nombre,Abreviatura) values	('cedula','cc');

INSERT INTO Usuario (id_tipo,identificacion,Nombres,Apellidos,Telefono_Celular,Direccion,Correo,id_ciudad)

                    values	(1,'1090465998','wime','garni','3134858016','avenida caracas','correo@gmail.com',1);

INSERT INTO Contrato (numero_contrato,id_plan,fechafirmado_contrato,fecha_renovacion_plan,id_usuario) values(2929, 1,'2021-05-05','2021-05-07',1);




