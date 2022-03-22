
public class TestCity {
	

	/**
	 * Exercice sur la Poo.
	 *
	 * @author Jean-Charles Duffau
	 * @version 1.0
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		
		
		City toulouse = new City("Toulouse", "France", 470000); 
		City marseille = new City("Marseille", "France", 750000); 
		City montauban = new City("Montauban", "France", 250000); 
		City auch = new City("Auch", "France", 50000); 
		City paris = new City("Paris", "France", 8450000); 
		
		
		System.out.println(toulouse);
		System.out.println(marseille);
		System.out.println(montauban);
		System.out.println(auch);
		System.out.println(paris);
		
		//toulouse.setNbInhabitants(-400);
		//System.out.println(toulouse);
		
		int citytnbH = toulouse.getNbInhabitants();
		toulouse.setNbInhabitants(citytnbH-100000);
		System.out.println(toulouse);
		
	}

}
