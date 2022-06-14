package jana60.geometria;

public class Rettangolo {
 /*Nel progetto java-oop-geometria creare un package jana60.geometria in cui inserire le seguenti classi:
una classe Rettangolo con due attributi interi: base e altezza. La classe ha due metodi che calcolano 
e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
*/
	
	//ATTRIBUTI
	int base;
	int altezza;
	
	
	//METODI
	int calcolaArea() {
		int area = base * altezza;
		return area;
	}
	int calcolaPerimetro() {
		int perimetro = (base + altezza) * 2;
		return perimetro;
	}
	
	
}
