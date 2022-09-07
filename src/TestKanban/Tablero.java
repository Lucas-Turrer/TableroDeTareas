package TestKanban;

import java.util.ArrayList;

public class Tablero {
	ArrayList <Tarea> tareasDelTablero = new ArrayList <Tarea> ();

	public Tablero() {
	}

	public void agregarTareas(Tarea tareaEnTablero) {
		tareasDelTablero.add(tareaEnTablero);
	}

	public Integer cantidadDeTareasEnTablero() {
		return tareasDelTablero.size();
	}
}
