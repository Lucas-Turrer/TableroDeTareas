package TestKanban;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTablero {

	@Test
	public void queSeCreaUnUsuario() {
		Usuario matias = new Usuario (001, "Matias");
		
		assertNotNull(matias);
	}
	
	@Test
	public void queSeCreaUnaTarea() {
		Usuario matias = new Usuario (001, "Matias");
		Tarea enviarPruebas = new Tarea (estado.Pendiente, matias);
		
		assertNotNull(enviarPruebas);
	}
	
	@Test
	public void queSeAgregaLaTareaAlTablero() {
		Usuario matias = new Usuario (001, "Matias");
		Tarea enviarPruebas = new Tarea (estado.Pendiente, matias);
		Tablero tableroDeTareas = new Tablero();
		tableroDeTareas.agregarTareas(enviarPruebas);
		
		Integer valorObtenido = tableroDeTareas.cantidadDeTareasEnTablero();
		Integer valorEsperado = 1;
		
		assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void queSeAsignaUnaTareaAOtroUsuario() {
		Usuario matias = new Usuario (001, "Matias");
		Usuario julian = new Usuario (002, "Julian");
		Tarea enviarPruebas = new Tarea (estado.Pendiente, matias);
		Tablero tableroDeTareas = new Tablero();
		
		tableroDeTareas.agregarTareas(enviarPruebas);
		enviarPruebas.asignarUsuario(julian, enviarPruebas);
		
		String valorEsperado = "Julian";
		String valorObtenido = enviarPruebas.getUsuarioAsignado();
		
		assertEquals(valorEsperado, valorObtenido);
			
	}

}
