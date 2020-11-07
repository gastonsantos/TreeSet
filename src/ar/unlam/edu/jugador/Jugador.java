package ar.unlam.edu.jugador;

public class Jugador implements Comparable<Jugador>{

	private Integer numeroCamiseta;
	private Puesto puesto;
	private String nombre;
	private String apellido;

	public Jugador(Integer numeroCamiseta, Puesto puesto, String nombre, String apellido) {
		this.apellido = apellido;
		this.numeroCamiseta=numeroCamiseta;
		this.puesto=puesto;
		this.nombre=nombre;
		
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCamiseta == null) ? 0 : numeroCamiseta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (numeroCamiseta == null) {
			if (other.numeroCamiseta != null)
				return false;
		} else if (!numeroCamiseta.equals(other.numeroCamiseta))
			return false;
		return true;
	}

	
	@Override
	public String toString() {
		return "Jugador [numeroCamiseta=" + numeroCamiseta + ", puesto=" + puesto + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}

	@Override
	public int compareTo(Jugador otro) {
		//  1.compareTo(2)  -negativo
		//  2.compareTo(1)  + 
		//  2.compareTo(2)  0
		
		return this.nombre.compareTo(otro.nombre);
	}                
}
