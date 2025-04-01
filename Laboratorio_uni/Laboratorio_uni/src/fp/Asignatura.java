package fp;

public record Asignatura(String nombre, String codigo, Double creditos, TipoAsignatura TipoAsignatura,Integer Curso) {
	
//Acronimo completar mas tarde

	public String acronimo() {
		//TODO
		return null;
	}
	
//Constructor
	
	
	
//ToString	
@Override
public String toString() {
        return "(" + codigo + ") " + nombre;
        
        
    }
}
