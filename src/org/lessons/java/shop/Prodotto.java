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

import java.util.Random;

public class Prodotto {
	String code;
	String name;
	String description;
	double price;
	double priceIVA;
	double IVA = 22;

	public Prodotto(String name, Double price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;

		this.priceIVA = this.price + (this.price * 22) / 100;

		Random r = new Random();
		this.code = String.format("%08d", r.nextInt(9998) + 1);
		// this.code = r.nextInt(99999998) + 1;
	}

	void showInfos() {
		System.out.println("Product name: " + this.name);
		System.out.println("Product code: " + this.code);
	}

	void showPrice() {
		System.out.println("Product base price is: " + this.price);
	}

	void showPriceIVA() {
		System.out.println("Product price with IVA is: " + priceIVA);
	}

	void showExtendedName() {
		System.out.println("Extended name is: " + this.code + this.name.trim());
	}
}
