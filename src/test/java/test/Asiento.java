package paquete;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		switch(color) {
			case "rojo":
				this.color=color;
			case "verde":
				this.color=color;
			case "amarillo":
				this.color=color;
			case "negro":
				this.color=color;
			case "blanco":
				this.color=color;
		}
	}
}