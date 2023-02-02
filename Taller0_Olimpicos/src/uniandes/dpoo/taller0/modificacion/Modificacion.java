package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	public static void main(String[] args)
	{
		System.out.println("Hola Mundo");
		
		CalculadoraEstadisticas calc = null;
		try {
			calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nSe cargó el archivo '.data/atletas.csv' con información de los Juegos Olímpicos.");
		
		Map<String, Integer> mapa = calc.paisConMasMedallistas();
		System.out.println("\n" + "País o paises con más medallistas: ");
 		{
 		for (String key : mapa.keySet())
 			{
 				System.out.println(key + " : " + mapa.get(key));
 			}
 		}

	}
}
