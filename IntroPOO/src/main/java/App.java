import encapsulamiento.CuentaBancaria;
import encapsulamiento.CuentaBancaria2;
import herencia.ClaseAbulelo;
import herencia.ClaseHijo;
import herencia.ClaseNieto;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Introducción a POO");
		System.out.println("Encapsulamiento");
		
		// implementación correcta de encapsulamiento
		CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
		
		cuentaBancaria1.cargarSaldo(56.0F);
		cuentaBancaria1.cargarSaldo(10.0F);		
		
		System.out.println("El saldo de la cuenta encapsulada es: " + cuentaBancaria1.mostrarSaldo());
		
		// encapsulamiento no implementado
		CuentaBancaria2 cuentaBancaria2 = new CuentaBancaria2();
		
		cuentaBancaria2.saldo = 45F;
		System.out.println("El saldo de la cuenta2 sin encapsular es: " + cuentaBancaria2.saldo);
		
		
		System.out.println("Herencia");
		
		ClaseAbulelo claseA = new ClaseAbulelo();
		
		claseA.metodo1(); //método implementado en claseA
		claseA.metodo2(); //método implementado en claseA
		
		ClaseHijo claseB = new ClaseHijo();
		
		claseB.metodo1(); //método implementado en claseB
		claseB.metodo2(); //método no implementado en claseB, se ejecuta del padre
	
		ClaseNieto claseC = new ClaseNieto();
		
		claseC.metodo1(); //método implementado en claseC
		claseC.metodo2(); //método implementado en claseC que llama al método de la clase padre

	}

}
