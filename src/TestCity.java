import java.util.ArrayList;
import java.util.Iterator;

public class TestCity {

	/**
	 * Exercice sur la Poo.
	 *
	 * @author Jean-Charles Duffau
	 * @version 1.0
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// exo 1.1 et 1.2

		City toulouse = new City("Toulouse", "France", 470000); 
		City marseille = new  City("Marseille", "France", 750000); 
		City montauban = new City("Montauban", "France", 250000); 
		City auch = new City("Auch", "France", 50000); 
		City paris= new City("Paris", "France", 8450000);



		System.out.println(toulouse); 
		System.out.println(marseille);
		System.out.println(montauban); 
		System.out.println(auch);
		System.out.println(paris);


		// toulouse.setNbInhabitants(-400);
		// System.out.println(toulouse);

		// int citytnbH = toulouse.getNbInhabitants();
		// toulouse.setNbInhabitants(citytnbH-100000);
		// System.out.println(toulouse);


		// exo 1.3, 1.4, 1.5, 1.6
		//City monaco = new City("Monaco", 8450000);
		//System.out.println(monaco);
		//monaco.setCountry("Principapoté de Stéphanie de Monaco");
		//System.out.println(monaco);



		//exo 1.7
		// parcours le nombre d'objets (instance)
		ArrayList<Object>objects=new ArrayList<>();
		objects.add(marseille);
		objects.add(toulouse);
		objects.add(montauban);
		objects.add(auch);
		objects.add(paris);

		int nb=0;
		for (Object object : objects) {
			if (object instanceof City) {
				nb++;
			}	
		}
		System.out.println("Nombre d'instance de City :"+nb);
	}

}
