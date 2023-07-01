package getterSetter;

public class Perro {
	private String raza;
	private String nombre;
	private Integer edad;
	private String pelaje;
	private Boolean esAmistoso;
	private Float peso;
	
	public Perro(String raza, String nombre, Integer edad, String pelaje, Boolean esAmistoso, Float peso) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.pelaje = pelaje;
		this.esAmistoso = esAmistoso;
		this.peso = peso;
	}
	
	
	public String getRaza() {
		return raza;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getEdad() {
		return edad;
	}


	public void setEdad(Integer edad) {
		this.edad = edad;
	}


	public String getPelaje() {
		return pelaje;
	}


	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}


	public Boolean getEsAmistoso() {
		return esAmistoso;
	}


	public void setEsAmistoso(Boolean esAmistoso) {
		this.esAmistoso = esAmistoso;
	}


	public Float getPeso() {
		return peso;
	}


	public void setPeso(Float peso) {
		this.peso = peso;
	}
	
	

}
