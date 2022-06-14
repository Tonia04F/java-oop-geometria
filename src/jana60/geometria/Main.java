package jana60.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*una classe Main contenente il metodo main, nel quale chiedete all’utente di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo oggetto Rettangolo. Dopo averlo istanziato, stampate a video il 
		perimetro e l’area.*/ 

		Rettangolo rett = new Rettangolo();
		rett.altezza = 20;
		rett.base = 10;
		
		System.out.println("L'area del rettangolo è: " + rett.calcolaArea());
		System.out.println("Il perimetro del rettangolo è: " + rett.calcolaPerimetro());

	}

}
