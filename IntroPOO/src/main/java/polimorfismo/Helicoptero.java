package polimorfismo;

public class Helicoptero extends Vehiculo {

	public Helicoptero(String marca, String modelo, Integer combustible) {
		super(marca, modelo, combustible);
	}

	@Override
	public void desplazarse(Integer metros) {
		System.out.println("El helicóptero vuela " + metros + " metros.");
	}

}
