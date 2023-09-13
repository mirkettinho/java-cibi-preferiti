package org.lessons.java.array;

public class CibiPreferiti {
	public static void main(String[] args) {
		
		String[] FavouriteFood = {"Riso","Pollo","Tonno","Mela","Mandorle","Noci","Spinaci","Cocco","Anguria","Melone"};
		
		System.out.println("La tua classifica contiene " +FavouriteFood.length + " cibi");
		System.out.println("il tuo cibo preferito é il " + FavouriteFood[0]);
		System.out.println("il tuo cibo meno preferito é l'" + FavouriteFood[FavouriteFood.length -1]);
		
		//if the array is even
		if((FavouriteFood.length % 2 ) == 0){
			
			System.out.println("i tuoi cibi a metá classifica sono " + FavouriteFood[(FavouriteFood.length /2)] + " e " + FavouriteFood[(FavouriteFood.length /2)-1]);

		 //if the array is odd
		}else {
			
			System.out.println("il tuo cibo a metá classifica é " + FavouriteFood[(FavouriteFood.length /2)]);
		}
	}
}
