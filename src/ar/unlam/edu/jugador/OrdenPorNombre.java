package ar.unlam.edu.jugador;

import java.util.Comparator;

public class OrdenPorNombre implements Comparator<Jugador>{

	@Override
	public int compare(Jugador uno, Jugador otro) {
	
		if (uno.getNombre().compareTo(otro.getNombre())==0)
			return uno.getNumeroCamiseta().compareTo(otro.getNumeroCamiseta());
		return  uno.getNombre().compareTo(otro.getNombre());
	}
	

}
