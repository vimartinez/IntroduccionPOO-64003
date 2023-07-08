import java.util.ArrayList;
import java.util.List;

import constructor.Persona;
import encapsulamiento.CuentaBancaria;
import encapsulamiento.CuentaBancaria2;
import getterSetter.Perro;
import herencia.ClaseAbulelo;
import herencia.ClaseHijo;
import herencia.ClaseNieto;
import polimorfismo.Auto;
import polimorfismo.Barco;
import polimorfismo.Helicoptero;
import polimorfismo.Vehiculo;

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
		claseC.metodo2(); //método implementado en claseC que llama al método de la clase 

		
		System.out.println("Constructores");
		
		Persona persona = new Persona();
		Persona persona2 = new Persona("Juan Carlos", "Perez");
		Persona persona3 = new Persona("Maria", "Gomez","39478541");
		Persona persona4 = new Persona("Paula", "Gutierrez", "39874145", "Laprida 1235", "Femenio");
		
		System.out.println("persona: " + persona.toString());
		System.out.println("persona2: " + persona2.toString());
		System.out.println("persona3: " + persona3.toString());
		System.out.println("persona4: " + persona4.toString());
		

		System.out.println("Getters y Setters");
		
		Perro perro = new Perro("Mestizo", "Pirulo", 5, "Corto", true, 25.0F);
		
		System.out.println("La raza del perro es " + perro.getRaza());
		perro.setRaza("Labrador");
		System.out.println("La nueva raza del perro es " + perro.getRaza());
		perro.setEdad(6);
		perro.setEsAmistoso(false);
		System.out.println("La nueva edad del perro es " + perro.getEdad());
		
		System.out.println("Polimorfismo");
		
		Vehiculo auto1 = new Auto("VW", "Gol", 30);
		Vehiculo auto2 = new Auto("Ferrari", "F40", 55);
		Vehiculo auto3 = new Auto("Renault", "Logan", 25);
		
		List <Vehiculo> flota = new ArrayList<Vehiculo>();
		
		flota.add(auto1);
		flota.add(auto2);
		flota.add(auto3);
		
		for (Vehiculo auto : flota) {
			auto.desplazarse(20);
		}
		
		Vehiculo barco1 = new Barco("Marca Barco", "Bote", 300);
		Vehiculo heli1 = new Helicoptero("Heli1", "Heli 2", 500);
		
		flota.add(barco1);
		flota.add(heli1);
		
		for (Vehiculo auto : flota) {
			auto.desplazarse(50);
		}
		
	}

}
