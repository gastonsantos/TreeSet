package ar.unlam.edu.jugador;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Equipo {

	private String nombre;

	private Set <Jugador> jugadores;
	
	public Equipo(String nombre) {

		this.nombre=nombre;
		this.jugadores=new TreeSet<Jugador>();	
	}

	public void agregarJugador(Jugador jugador) {	
		jugadores.add(jugador);	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(Set<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	
	public Set<Jugador> obtenerJugadoresOrdenadoPorNombre(){
		Set <Jugador> jugadoresPorNombre = new TreeSet<>(new OrdenPorNombre());
		jugadoresPorNombre.addAll(jugadores);
		return jugadoresPorNombre;
	}
	
	public Set<Jugador> obtenerJugadoresOrdenadosPorApellido(){
		TreeSet<Jugador> ordenadoPorNombre= new TreeSet<Jugador>(new OrdenadoPorApellido());
		ordenadoPorNombre.addAll(jugadores);
		return ordenadoPorNombre;	
	}
	
	public void cambiarElOrdenDeJuadores(Comparator<Jugador> orden) {
		TreeSet<Jugador> ordenadoDeOtraForma = new TreeSet<Jugador>(orden);
		ordenadoDeOtraForma.addAll(jugadores);
		jugadores=ordenadoDeOtraForma;
		
	}
	
	public void mostrarDatos(){
		
		for(Jugador e: jugadores){
			System.out.println(e.toString());
		}
	}

	
}
