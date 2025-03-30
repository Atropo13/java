package fp.test;

import java.time.DayOfWeek;
import java.time.LocalTime;

import fp.Tutoria;
public class TestTutoria {

	public static void main(String[] args) {
		DayOfWeek dia = DayOfWeek.FRIDAY;
		LocalTime inicio= LocalTime.MIDNIGHT;
		LocalTime fin= LocalTime.now();
		Tutoria tutoria = new Tutoria(dia, inicio, fin);
		System.out.println(tutoria);
	}

}
