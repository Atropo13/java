package fp.test;

import fp.Asignatura;
import fp.TipoAsignatura;

public class Test_asignatura {
	public static void main(String[] args) {
		
	String nombre= "Fisica";
	String codigo= "000111";
	TipoAsignatura tipo= TipoAsignatura.ANUAL;
	Double creditos= 5.0;
	Integer curso = 1;
	Asignatura asigantura_1 = new Asignatura(nombre, codigo,creditos,tipo,curso);
	System.out.print(asigantura_1);
	}

}
