package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] FavouriteFood = {"Riso","Pollo","Tonno","Mela","Mandorle","Noci","Spinaci","Cocco","Anguria"};
		
		System.out.println("La tua classifica contiene " +FavouriteFood.length + " cibi");
		System.out.println("il tuo cibo preferito é il " + FavouriteFood[0]);
		System.out.println("il tuo cibo meno preferito é l'" + FavouriteFood[8]);
		
		System.out.println("il tuo cibo a metá classifica sono le " + FavouriteFood[4]);
		
	}
}
