package Datos;


import Entidades.Arma;

import java.util.ArrayList;
import java.util.Arrays;

public class AlmacenArmas {	
	
	//Array de objetos de tipo Arma
	private static Arma[] listaArma = {new Arma("Espada", 12), new Arma("Hacha", 15)};
	
	//Conversi�n del array de tipo Arma a ArrayList
	public static ArrayList<Arma> armas = new ArrayList<Arma>(Arrays.asList(listaArma));

	public static void mostrarArrayListArmas(){
		for (int i = 0; i < armas.size(); i++) {
			System.out.println("N� " + i + " Tipo de arma: " + armas.get(i).getNombre() + " Da�o: " + armas.get(i).getDano());
		}
	}

}
