package fp;

public class Espacio {
	private TipoEspacio tipo;
	private String nombre;
	private int capacidad;
	private int planta;
	
	public Espacio(TipoEspacio tipo, String nombre, int capacidad, int planta) {
		this.tipo = tipo;
		this.nombre = nombre;
		this.capacidad= capacidad;
		this.planta = planta;		
	}

	
	public void setTipo(TipoEspacio tipo) {
		this.tipo = tipo;
	}
	public TipoEspacio getTipo() {
		return tipo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public int getPlanta() {
		return planta;
	}
	
	public String toString() {
		return getNombre() +"(" + getPlanta()+")";
	}

}
