package fp.hotel.test;

import java.util.ArrayList;
import java.util.List;

import fp.hotel.Reserva;
import fp.utiles.Ficheros;

public class Test {
	private static List<Reserva> cargaFichero() {
		String path = "data/reservas.csv";
		List<String> lineas = Ficheros.leeFichero("Fichero no encontrado", path);
		List<Reserva> listaReservas = new ArrayList<>();
		for (int i=1;i<lineas.size();i++) {
			Reserva r = Reserva.parse(lineas.get(i));
			listaReservas.add(r);
			System.out.println(r + " procesada");
		}
		return listaReservas;
	}

	public static void main(String[] args) {
		//1.- Carga el fichero con los datos de las reservas
		
		//2.- Muestra por pantalla cu�ntas reservas tienen la misma duraci�n que la duraci�n m�xima de la lista.
		// Para ello, encuentra primero la reserva de mayor duraci�n, y luego crea una lista con las reservas que
		// tengan la misma duraci�n que la de mayor duraci�n.
	}

}
