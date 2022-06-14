package jana60.geometria;

import java.util.Scanner;

public class MainBonus {

	public static void main(String[] args) {
		/*BONUS: chiedere all’utente per 5 volte di definire le dimensioni di un rettangolo e stampare a video l’area del rettangolo più grande*/ 
		Rettangolo rett = new Rettangolo();
		int areaMaggiore = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			//chiedo all'utente di inserire 5 volte dimenzioni del rettangolo
			System.out.println("Inserisci base rettangolo: ");
			rett.base = sc.nextInt();
			System.out.println("Inserisci altezza rettangolo: ");
			rett.altezza = sc.nextInt();
			
			if(rett.calcolaArea()>areaMaggiore) {
				areaMaggiore=rett.calcolaArea();
				
			}
		
		}
		System.out.println("Larea maggiore è: " + areaMaggiore );
		sc.close();
	}

}
