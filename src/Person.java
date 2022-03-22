

public class Person {

	// properties
	private String firstName;
	private String lastName;
	private int age;
	private String adress;

	//variable d'instance
	int value=1;

	// constructor
	public Person(String firstName, String lastName, int age, String adress) {
		
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		setAdress(adress);
	}




	// accessors
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}

	// methodes
	public String toString() {

		return "Person [ lastName " + getLastName() + ", firstName= " + getFirstName() +
				", age= " +getAge() + ", adress= "+getAdress()+ " ]";



	}

}
