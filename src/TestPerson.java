import java.util.ArrayList;


public class TestPerson {

	/**
	 * Exercice sur la Poo.
	 *
	 * @author Jean-Charles Duffau
	 * @version 2.0
	 * 
	 * 
	 */
	public static void main(String[] args) {

		// exo 1.8

		Person joe = new Person("Dalton", "Joe", 65,"Prison la Santé de Paris", new City("Texas","Névada", 6000)); 
		Person averell = new  Person("Dalton", "Averell", 60,"Prison les Beaumettes de Marseille",new City("Nouillorc","France")); 
		Person william = new Person("Dalton", "William", 50,"Prison de Fleury Mérogis",new City("Paris","France", 886000)); 
		Person luke = new Person("Skywalker", "Luke", 70,"Quartier de Tatouine Paris",new City("Paris","Galaxie lointaine", 886000)); 
		Person sherlock = new Person("Holmes", "Sherlock", 168,"221B Baker Street Londres",new City("Londres","Royaume-Uni"));


		// filtre
		// parcours le nombre d'objets (instance)
		ArrayList<Person>persons=new ArrayList<>();
		persons.add(joe);
		persons.add(averell);
		persons.add(william);
		persons.add(luke);
		persons.add(sherlock);

		System.out.println("Lise des personnalités\n");
		for (Object person : persons) {
			System.out.println(person.toString());
		}

		System.out.println("------------------------");
		System.out.println("Lise des personnalités filtrés\n");
		// parcours des personnes 
		persons.forEach(person->{
			
			// cast de l'objet ville de personne pour verifier le pays
			if (person.getAdress().contains("Paris")|| ((City)person.getCity()).getCountry().contains("France")) {
				System.out.println(person);
			}

		});

	}

}
