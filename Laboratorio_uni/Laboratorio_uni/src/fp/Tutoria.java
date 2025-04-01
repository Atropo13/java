package fp;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.Duration;
public record Tutoria(DayOfWeek dia, LocalTime hora_inicio, LocalTime hora_final, long duracion) {
	
	public Tutoria(DayOfWeek dia, LocalTime hora_inicio, LocalTime hora_final) {
		 this(dia, hora_inicio, hora_final, Duration.between(hora_inicio, hora_final).toMinutes()); 	
		 }
	public Tutoria(DayOfWeek dia, LocalTime hora_inicio, long duracion) {
		 this(dia, hora_inicio, hora_inicio.plusMinutes(duracion), duracion); 	
		 }
	public String letradia(DayOfWeek dia) {
		if (dia== DayOfWeek.WEDNESDAY) {
			return "X";
			}
		else  {
			return String.valueOf(dia.toString().charAt(0));			}
		}
		
	public String toString()
	{
		 return String.format("%s %tH:%tM-%tH:%tM", 
                 letradia(dia),
                 hora_inicio, hora_inicio,
                 hora_final, hora_final);
	}
}
