package fp.test;

import java.time.LocalDate;
import fp.Persona;
public class Test_persona {

	public static void main(String[] args) {
		LocalDate fecha_nacimiento = LocalDate.now();
		LocalDate fecha_nacimientos = LocalDate.of(1990, 01, 15);
		String nombre = "Jose";
		String apellidos = "fernandez rodaballo";
		String email = "#####";
		String dni = "121212";
		Persona persona1 = new Persona(dni, nombre, apellidos,fecha_nacimiento);
		Persona persona2 = new Persona(dni, nombre, apellidos,fecha_nacimientos, email);
		System.out.println(persona1.getEdad());
		System.out.println(persona2);
		
		
	}

}
