package encapsulamiento;

// Atributos id, saldo encapsulados
public class CuentaBancaria {
	
	private long id = 0L;
	private Float saldo= 0.0F; 
	
	public Float mostrarSaldo() {
		return saldo;
	}
	
	public void cargarSaldo(Float cantidad) {
		saldo = saldo + cantidad;
	}
	
	public Long mostrarId() {
		return this.id;
	}
}
