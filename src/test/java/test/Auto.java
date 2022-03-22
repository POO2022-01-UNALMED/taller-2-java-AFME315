package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	Motor motor;
	int registro;			
	static int cantidadCreados;


	
	int cantidadAsientos()
	{
		int totalAsientos=0;
		for (int i =0; i < asientos.length; i++)
		{ 
			if (asientos[i] != null)
			{
				totalAsientos++;
			}
		}
		return totalAsientos;
	}

	String verificarIntegridad()
	{
        	for(int i=0; i<asientos.length ; i++)
		{
           	 if (asientos[i]!=null)
			{
               		 if(((asientos[i]).registro==registro) & (motor.registro==registro) & ((asientos[i]).registro==motor.registro))
			{
                   	 return "Auto original";
               		 }
                	return "Las piezas no son originales";
           	 }
       	 	}
        	return "Las piezas no son originales";

	}
}

	
