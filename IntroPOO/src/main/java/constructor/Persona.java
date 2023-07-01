package constructor;

public class Persona {
	private String nombre;
	private String apellido;
	private String nroDocumento;
	private String domicilio;
	private String genero;
	private String estadoCivil = "Soltero";
	
	public Persona() {
		
	}
	
	public Persona(String nombreDePersona, String apellidoDePersona) {
		nombre = nombreDePersona;
		apellido = apellidoDePersona;
	}
	
	public Persona(String nombre, String apellido, String nroDocumento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
	}
	
	public Persona(String nombre, String apellido, String nroDocumento, String domicilio ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.domicilio = domicilio;
	}
	
	public Persona(String nombre, String apellido, String nroDocumento, String domicilio, String genero ) {
		this (nombre,apellido,nroDocumento,domicilio);
		this.genero = genero;
	}

	
	public Persona(String nombre, String apellido, String nroDocumento, String domicilio, String genero,
			String estadoCivil) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nroDocumento = nroDocumento;
		this.domicilio = domicilio;
		this.genero = genero;
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nroDocumento=" + nroDocumento
				+ ", domicilio=" + domicilio + ", genero=" + genero + ", estadoCivil=" + estadoCivil + "]";
	}

	
}
