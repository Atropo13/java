package fp;

import fp.utiles.Checkers;

public record Asignatura(String nombre, String codigo, Double creditos, TipoAsignatura TipoAsignatura,Integer Curso) implements Comparable<Asignatura> {
	
//Acronimo completar mas tarde

	public Asignatura{
		Checkers.check("El codigo no esta bien escrito", codigo.length() == 7 && esCodigoNumerico(codigo));
		Checkers.check("Los creditos no estan bien escritos", creditos > 0 && creditos != null);
	}
	public String acronimo() {
		//TODO
		return null;
	}
	
	  public static boolean esCodigoNumerico(String codigo) {
	        for (int i = 0; i < codigo.length(); i++) {
	            if (!Character.isDigit(codigo.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    } 
	 
	
	
	
//ToString	
@Override
public String toString() {
        return "(" + codigo + ") " + nombre;                
    }
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof Asignatura asignatura) {
        return codigo.equals(asignatura.codigo);
    }
    return false;
}

@Override

public int compareTo(Asignatura a) {
    return codigo.compareTo(a.codigo);
}
}
