import javax.management.JMRuntimeException;

public class City {

	// properties
	private String cityName;
	private String country;
	private int nbInhabitants;


	// constructor
	public City(String cityName, String country, int nbInhabitants) {

		setCityName(cityName);
		setCountry(country);
		setNbInhabitants(nbInhabitants);

	}

	// accessors
	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getNbInhabitants() {
		return nbInhabitants;
	}


	public void setNbInhabitants(int nbInhabitants) {
		if (nbInhabitants <0) {
			throw new RuntimeException("Le nombre d'habitants ne peut être négatif.");
		}
		this.nbInhabitants = nbInhabitants;
	}


	// methodes
	public String toString() {

		return "cityName : " + getCityName() + "\t"+
				"country : " + getCountry() + "\t"+
				"nbInhabitants : " + getNbInhabitants() + "\t";

	}

}
