package fp.test;

import fp.TipoEspacio;
import fp.Espacio;
public class TestEspacio {

	public static void main(String[] args) {
		TipoEspacio tipo= TipoEspacio.TEORIA;
		String nombre = "A3.10";
		int planta = 3;
		int capacidad = 139;
		Espacio espacio1= new Espacio(tipo, nombre, capacidad, planta);
		System.out.println(espacio1);
		System.out.println(espacio1.getCapacidad());

	}

}
