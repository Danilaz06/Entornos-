Proceso Control_Irrigadores
    Escribir "INICIO"
        Escribir "Leer hora actual"
        Leer hora_actual
		Escribir "Leer hora de inicio"
		leer horaDeInicio
        Mientras hora_actual <> horaDeInicio 
			leer hora_actual
			si hora_actual = horaDeInicio
				Escribir "La hora coincide. Ejecutar acciones."
				
				Escribir "Subir irrigadores 150 cm"
				
				Escribir "Conectar irrigador: 100 l/h, 12 rpm"
				
				Escribir "Esperar 7200 segundos"
				
				Escribir "Desconectar irrigador"
				
				Escribir "Proceso finalizado"
				
			SiNo
				Leer hora_actual
			FinSi
			
    FinMientras
FinProceso

