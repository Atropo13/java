package fp;

import java.util.Set;



public class Centro {
	private String nombre;
	private String direccion;
	private Integer plantas;
	private Integer sotanos;
	private Set <Espacio> espacios ;
	
public Centro(String nombre, String direccion, Integer plantas, Integer sotanos) {
	this.nombre = nombre;
	this.direccion = direccion; 
	this.plantas= plantas;
	this.sotanos= sotanos;
}

public  
public String toString() {
		return nombre;
	}
	
	/*
void nuevoEspacio(Espacio e), que añade el espacio e al centro, siempre que la planta del espacio sea un número de planta válido en el centro. Para ello debe estar comprendida en el intervalo [-s, p-1], siendo p el número de plantas del centro y s el número de sótanos. En caso contrario, eleve la excepción IllegalArgumentException.
void eliminaEspacio(Espacio e). Elimina el espacio e del centro. Si el espacio no pertenece al centro, la operación no tiene efecto.
	 */
	
}
