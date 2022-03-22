

public class City {

	// properties
	private String cityName;
	private String country;
	private int nbInhabitants;

	//variable d'instance
	int value=1;

	// constructor
	public City(String cityName, String country, int nbInhabitants) {

		setCityName(cityName);
		setCountry(country);
		setNbInhabitants(nbInhabitants);

	}
	// constructor (surcharge)
	public City(String cityName, int nbInhabitants) {

		setCityName(cityName);
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

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	// methodes
	public String toString() {

		return "ville de " + getCityName() + " en " + getCountry() +" ayant " + getNbInhabitants() + " habitants.";



	}

}
