package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		System.out.println("Catalogue : ");
		PrintCatalog printCatalog = new PrintCatalog();
		for (Item i : items){
			i.accept(printCatalog);}
	}
	
	public void printOnlyBooks() {
		System.out.println("Livres seulement : ");
		PrintOnlyBooks printOnlyBooks = new PrintOnlyBooks();
		for (Item i : items){
			i.accept(printOnlyBooks);}
		/*
		//avec instanceof
		for (Item i : items)
			if (i instanceof Book)
				System.out.println(i);
		*/
	}

	public void printOnlyCDs() {
		System.out.println("CDs seulement : ");
		PrintOnlyCDs printOnlyCDs = new PrintOnlyCDs();
		for (Item i : items){
			i.accept(printOnlyCDs);}
	}

}
