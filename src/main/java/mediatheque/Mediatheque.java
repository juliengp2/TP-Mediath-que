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
		printCatalog printCatalog = new printCatalog();
		for (Item i : items){
			i.accept(printCatalog);}
	}
	
	public void printOnlyBooks() {
		System.out.println("Livres seulement : ");
		printOnlyBooks printOnlyBooks = new printOnlyBooks();
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
		printOnlyCDs printOnlyCDs = new printOnlyCDs();
		for (Item i : items){
			i.accept(printOnlyCDs);}
	}

}
