package ar.unlam.edu.jugador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEquipo {

	@Test
	public void queOrdenoPorApellido(){
	Equipo river= new Equipo ("River");
		
		Jugador j1= new Jugador(1, Puesto.arquero, "Franco", "Armani");
		Jugador j2= new Jugador(2, Puesto.defensor,  "Anibal","Montiel");
		Jugador j3= new Jugador(3, Puesto.defensor, "Eugenio","Pinola");
		Jugador j4= new Jugador(4, Puesto.defensor, "Lucas","Prato");
		Jugador j5= new Jugador(5, Puesto.defensor, "Hernan", "Diaz");
		Jugador j6= new Jugador(6, Puesto.medioCampista, "Franco","Sosa");
		Jugador j7= new Jugador(7, Puesto.medioCampista, "Enzo","Perez");
		Jugador j8= new Jugador(8, Puesto.medioCampista, "Zapata","La cruz");
		Jugador j9= new Jugador(9, Puesto.delantero, "Juan","Carrasal");
		Jugador j10= new Jugador(10, Puesto.delantero, "Matias","Borre");
		Jugador j11= new Jugador(11, Puesto.defensor, "Lucas","Borre");

		river.agregarJugador(j2);
		river.agregarJugador(j3);
		river.agregarJugador(j4);
		river.agregarJugador(j11);
		river.agregarJugador(j5);
		river.agregarJugador(j6);
		river.agregarJugador(j7);
		river.agregarJugador(j8);
		river.agregarJugador(j1);
		river.agregarJugador(j9);
		river.agregarJugador(j10);
	
		river.cambiarElOrdenDeJuadores(new OrdenadoPorApellido());
		for(Jugador e: river.getJugadores()){
			System.out.println(e);
		}

	
		
	}
	
	
	@Test
	public void queOrdenoPorNombre() {

		
		Equipo river= new Equipo ("River");
		
		Jugador j1= new Jugador(1, Puesto.arquero, "Franco", "Armani");
		Jugador j2= new Jugador(2, Puesto.defensor,  "Anibal","Montiel");
		Jugador j3= new Jugador(3, Puesto.defensor, "Eugenio","Pinola");
		Jugador j4= new Jugador(4, Puesto.defensor, "Lucas","Prato");
		Jugador j5= new Jugador(5, Puesto.defensor, "Hernan", "Diaz");
		Jugador j6= new Jugador(6, Puesto.medioCampista, "Franco","Sosa");
		Jugador j7= new Jugador(7, Puesto.medioCampista, "Enzo","Perez");
		Jugador j8= new Jugador(8, Puesto.medioCampista, "Zapata","La cruz");
		Jugador j9= new Jugador(9, Puesto.delantero, "Juan","Carrasal");
		Jugador j10= new Jugador(10, Puesto.delantero, "Matias","Borre");
		Jugador j11= new Jugador(11, Puesto.defensor, "Lucas","Borre");

		
		
		river.agregarJugador(j2);
		river.agregarJugador(j3);
		river.agregarJugador(j4);
		
		river.agregarJugador(j11);
		river.agregarJugador(j5);
		river.agregarJugador(j6);
		river.agregarJugador(j7);
		river.agregarJugador(j8);
		river.agregarJugador(j1);
		river.agregarJugador(j9);
		river.agregarJugador(j10);
		
		river.mostrarDatos();
	
		
	}
	
	@Test
	public void queSeVerifiqueQueSeOrdenenLosEquiposPorNumeroDeCamiseta(){

		
		Equipo river= new Equipo ("River");
		
		Jugador j1= new Jugador(1, Puesto.arquero, "Franco", "Armani");
		Jugador j2= new Jugador(2, Puesto.defensor,  "Anibal","Montiel");
		Jugador j3= new Jugador(3, Puesto.defensor, "Eugenio","Pinola");
		Jugador j4= new Jugador(4, Puesto.defensor, "Lucas","Prato");
		Jugador j5= new Jugador(5, Puesto.defensor, "Hernan", "Diaz");
		Jugador j6= new Jugador(6, Puesto.medioCampista, "Franco","Sosa");
		Jugador j7= new Jugador(7, Puesto.medioCampista, "Enzo","Perez");
		Jugador j8= new Jugador(8, Puesto.medioCampista, "Zapata","La cruz");
		Jugador j9= new Jugador(9, Puesto.delantero, "Juan","Carrasal");
		Jugador j10= new Jugador(10, Puesto.delantero, "Matias","Borre");
		Jugador j11= new Jugador(11, Puesto.defensor, "Lucas","Borre");

		
		river.agregarJugador(j2);
		river.agregarJugador(j3);
		river.agregarJugador(j4);
		river.agregarJugador(j11);
		river.agregarJugador(j5);
		river.agregarJugador(j6);
		river.agregarJugador(j7);
		river.agregarJugador(j8);
		river.agregarJugador(j1);
		river.agregarJugador(j9);
		river.agregarJugador(j10);
		
 
		Integer mayor=0;
		int i=0;
		for (Jugador j :river.getJugadores()) {
			 
			if(i==0)
				mayor=j.getNumeroCamiseta();
			else {
				assertTrue(mayor<j.getNumeroCamiseta());
				mayor=j.getNumeroCamiseta();
			}
			i++;
		}
		
	}
}
