package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Inserire numero di Km da percorrere: ");
		double kmDaPercorrere = scanner.nextDouble();
		System.out.println("Inserire età dell'acquirente: ");
		int etaAcquirente = scanner.nextInt();
		double costoBiglietto = kmDaPercorrere * 0.21;
		
		
		if (etaAcquirente > 65) {
			costoBiglietto = costoBiglietto * 40 / 100;
			System.out.println("Prezzo biglietto con sconto over 65: " + costoBiglietto);
		} else if (etaAcquirente < 18) {
			costoBiglietto = costoBiglietto * 20 / 100;
			System.out.println("Prezzo biglietto con sconto per minorenni: " + costoBiglietto);
		} else {
			System.out.println("Prezzo biglietto: " + costoBiglietto);
		}
		
		
		
		
		scanner.close();
		
	}

}
