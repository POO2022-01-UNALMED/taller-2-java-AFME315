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
		for ( int i=0; i<asientos.length, i++)
		{	
			if (asientos[i] != null &&(asientos[i].resgistro != registro))
			{
				return "Las piesas no son originales";
			}else
			{
				return "Auto original";
			}
