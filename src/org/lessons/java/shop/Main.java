/*
 * Esercizio di oggi Java Shop
repo : java-oop1
Nel progetto java-oop-shop, package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente i costruttori ed eventuali altri metodi di “utilità” per fare in modo che:
alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random
Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto
BONUS: create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, 
mentre codice 123445567 resta come è)
 */

package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = null;
		double price;

		Scanner s = new Scanner(System.in);
		System.out.println("Insert product name:");
		name = s.nextLine();

		System.out.println("Insert product price:");
		price = Double.parseDouble(s.nextLine());

		s.close();

		Prodotto p = new Prodotto(name, price);

		System.out.println("Product name: " + name);
		System.out.println("Product code: " + p.code);
		System.out.println("Product base price is: " + price);
		System.out.println("Product price with IVA is: " + p.getPriceIVA());
		System.out.println("Extended name is: " + p.getExtendedName());
	}

}
