package test;


public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		int totalAsientos=0;
		for (Asiento u:asientos) {
			if(u!=null){
			totalAsientos++;}
			}
		return totalAsientos;
		}
	String verificarIntegridad() {
		if(registro==motor.registro) {
			for(Asiento asiento:asientos) {
				if(asiento!= null) {
					if(registro!= asiento.registro) {
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		}
		return "Las piezas no son originales";
	}		
}
