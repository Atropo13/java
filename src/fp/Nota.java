package fp;


public record Nota(
    Asignatura asignatura,
    int curso,
    double valor_numerico,
    Convocatoria convocatoria,
    boolean matricula_honor
) {

   

    // Constructor 2: Sin matrícula de honor (usa false por defecto)
    public Nota(Asignatura asignatura, int curso, double valor_numerico, 
               Convocatoria convocatoria) {
        this(asignatura, curso, valor_numerico, convocatoria, false); // Orden correcto
    }

    public Calificacion CalcularCalificacion(double valor_numerico, boolean matricula_honor) {
    	if (valor_numerico < 5) {
    		return Calificacion.SUSPENSO;
    		}
    	else if(valor_numerico< 7) {
    		return Calificacion.APROBADO;
    		}
    	else if (valor_numerico<9) {
    		return Calificacion.NOTABLE;
    		}
    	 else {
    	        return matricula_honor ? Calificacion.MATRICULA_DE_HONOR : Calificacion.SOBRESALIENTE;
    	    }
    }
    public int año_curso(int curso) {
    	int año_curso = curso +1;
    	return año_curso= año_curso% 100; 
    }
   public String toString() {
	   return asignatura + ","+ convocatoria + ","+ curso +"-"+año_curso(curso)+","+valor_numerico+","+CalcularCalificacion(valor_numerico, matricula_honor);
   }
}