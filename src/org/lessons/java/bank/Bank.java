/*
 * Esercizio: Java Bank
repo java-oop1
Oggi ci occupiamo di conti correnti.
Consegna
Nel progetto java-oop-bank, package jana60.bank, creare la classe Conto caratterizzata da:
- numero di conto
- nome del proprietario
- saldo
Usate opportunamente i costruttori ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo conto il saldo sia 0€
- siano presenti un metodo per versare una somma di denaro sul conto e uno per prelevare una somma di denaro dal conto (attenzione: 
il saldo non può mai diventare negativo)
- altri metodi per ritornare le informazioni del conto e il saldo formattato
Aggiungere una classe Bank con metodo main, dove chiediamo all’utente il suo nome e generiamo un Conto intestato all’utente con un numero 
di conto random (da 1 a 1000)
Poi chiediamo all’utente cosa vuole fare dando 3 opzioni: versare una somma o prelevare una somma di denaro o uscire. Dopo la scelta 
dell’utente chiediamo quanti soldi vuole versare o prelevare e proviamo ad effettuare l’operazione sul conto. Se l’operazione non è 
valida mostriamo un messaggio di errore. Se l’operazione va a buon fine mostriamo il saldo attuale del conto.
Il menu continua ad apparire fino a che l’utente sceglie di uscire.
 */

package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String holderName;
		int accountNumber = 0;
		String userChoice = "";
		double money;

		Scanner s = new Scanner(System.in);
		System.out.println("Insert your name:");
		holderName = s.nextLine();

		Random r = new Random();
		accountNumber = r.nextInt(999) + 1;

		Conto c = new Conto(holderName, accountNumber);

		System.out.println("Account Name: " + holderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + c.balance);

		while (!userChoice.equals("close")) {
			System.out.println("What do you want to do? Type add, take or close");
			userChoice = s.nextLine();

			if (userChoice.equals("add")) {
				System.out.println("How much money to deposit?");
				money = s.nextDouble();
				s.nextLine();
				c.addCash(money);
				System.out.println("Balance: " + c.balance);
			} else if (userChoice.equals("take")) {
				System.out.println("How much money do you want to take?");
				money = s.nextDouble();
				s.nextLine();
				if (money > c.balance) {
					System.out.println("Sorry, you don't have enought money!");
					System.out.println("Balance: " + c.balance);
				} else {
					c.takeCash(money);
					System.out.println("Balance: " + c.balance);
				}
			}
		}

		if (userChoice.equals("close")) {
			System.out.println("Thanks, see you!");
		}

		s.close();
	}
}
