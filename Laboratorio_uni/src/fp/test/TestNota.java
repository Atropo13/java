package fp.test;

import fp.Asignatura;
import fp.Convocatoria;
import fp.Nota;
import fp.TipoAsignatura;
public class TestNota {

	public static void main(String[] args) {
		String nombre= "Fisica";
		String codigo= "000111";
		TipoAsignatura tipo= TipoAsignatura.ANUAL;
		Double creditos= 5.0;
		Integer curso = 1;
	    Asignatura asignatura_1 = new Asignatura(nombre, codigo,creditos,tipo,curso);
	    
	    int curso1= 2011;
		double valor_numerico= 9.5;
		Convocatoria convocatoria = Convocatoria.PRIMERA;
		boolean matricula_honor = true;
		 
		Nota nota1 = new Nota(asignatura_1, curso1, valor_numerico, convocatoria);
		Nota nota2 = new Nota(asignatura_1, curso1, valor_numerico, convocatoria, matricula_honor);
		System.out.println(nota1);
		System.out.println(nota2);
	 	System.out.println(nota1.CalcularCalificacion(valor_numerico, matricula_honor));


	}

}
