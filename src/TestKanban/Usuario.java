package TestKanban;

public class Usuario {
	private Integer idUsuario;
	private String nombreUsuario;

	public Usuario(Integer idUsuario, String nombreUsuario) {
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
}
