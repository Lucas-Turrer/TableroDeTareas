package TestKanban;

public class Tarea {
	private estado estadoDeLaTarea;
	private Usuario usuarioAsignado;

	public Tarea(estado estadoDeLaTarea, Usuario usuarioAsignado) {
		this.estadoDeLaTarea = estadoDeLaTarea;
		this.usuarioAsignado = usuarioAsignado;
	}

	public estado getEstadoDeLaTarea() {
		return estadoDeLaTarea;
	}

	public void setEstadoDeLaTarea(estado estadoDeLaTarea) {
		this.estadoDeLaTarea = estadoDeLaTarea;
	}

	public String getUsuarioAsignado() {
		return usuarioAsignado.getNombreUsuario();
	}

	public void setUsuarioAsignado(Usuario usuarioAsignado) {
		this.usuarioAsignado = usuarioAsignado;
	}

	public void asignarUsuario(Usuario nuevoUsuario, Tarea tareaAsignada) {
		if(tareaAsignada.estadoDeLaTarea == estado.Pendiente) {
			tareaAsignada.setUsuarioAsignado(nuevoUsuario);
		}
	}

}
