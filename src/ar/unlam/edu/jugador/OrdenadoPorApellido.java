package ar.unlam.edu.jugador;

import java.util.Comparator;

public class OrdenadoPorApellido implements Comparator<Jugador>{

	@Override
	public int compare(Jugador o1, Jugador o2) {
		if (o1.getApellido().compareTo(o2.getApellido())==0)
			return o1.getNumeroCamiseta().compareTo(o2.getNumeroCamiseta());
		return  o1.getApellido().compareTo(o2.getApellido());
		
	}
	//En teoria ordena por apellido, al mismo apellido ordena por numero camista

}
