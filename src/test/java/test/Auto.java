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
		for (Asiento i:this.asientos) {
			if(i!=null)
				totalAsientos++;
			}
		return totalAsientos;
	}
	String verificarIntegridad() {
		if (this.registro != this.motor.registro)
			return "Las piesas no son originales";

		for(int i=0;i<asientos.length;i++) {
				if (asientos[i] !=null && (asientos[i].registro != registro)){
					return "Las piesas no son originales";

				}else {
					return "Auto original";
				}	
		}
	}
}