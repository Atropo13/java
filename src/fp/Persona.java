package fp;

import java.time.LocalDate;
import java.time.Period;

public class Persona implements Comparable <Persona>{
	private String dni;
	private String nombre;
	private String apellidos;
	private LocalDate fecha_nacimiento;
	private String email;
	private Integer edad;
	

//constructor
	public Persona(String dni, String nombre, String apellido, LocalDate fecha_nacimiento, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		setEmail(email);
		this.edad = getEdad();
		
	}
	public Persona(String dni, String nombre, String apellido, LocalDate fecha_nacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.email = null;
		this.edad = getEdad();
		}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos; 
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFechaNacimiento() {
		return fecha_nacimiento;
	}

	public void setFechaNacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return Period.between(getFechaNacimiento(), LocalDate.now()).getYears();
		}
	
	public String toString(){
		return getDni()+ "-"+ getApellidos()+","+ getNombre()+ "-"+ getFechaNacimiento();
		
	}
		@Override
	   public int compareTo(Persona p) {
	    	int res = getApellidos().compareTo(p.getApellidos());
	    	
	    	if (res ==0) {
	    		res = getNombre().compareTo(p.getNombre());
	    		
	    		if (res == 0) {
	    			res = getDni().compareTo(p.getDni());
	    		}
	    	}
	    	return res;
	}
}
