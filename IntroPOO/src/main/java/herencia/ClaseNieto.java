package herencia;

public class ClaseNieto extends ClaseHijo {
	
	public void metodo1() {
		System.out.println("Clase Nieto - Método 1");
	}

	public void metodo2() {
		super.metodo2();
		System.out.println("Clase Nieto - Método 2");
	}


}
