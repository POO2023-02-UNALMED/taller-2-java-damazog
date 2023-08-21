package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad=0;
		Asiento c = new Asiento();
		 for (Asiento element : asientos) {
			 if (element.getClass() == c.getClass()) {
				 cantidad++;
			 }
		 }
		 return cantidad;
		 	
	}
	String verificarIntegridad() {
		if (this.registro!=this.motor.registro) {
			return "Las piezas no son originales";
		}
		for (Asiento element : asientos) {
			if (element.registro!=this.registro) {
			return "Las piezas no son originales";
			}
		}
		return "Auto original";
	}
	
}
