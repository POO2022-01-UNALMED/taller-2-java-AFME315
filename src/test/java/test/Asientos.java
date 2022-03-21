package test;
public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		if (color=="amarillo" || color=="verde" || color=="rojo" || color=="blanco" || color=="negro")
			this.color=color;
	}
}
