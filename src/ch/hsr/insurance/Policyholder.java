package ch.hsr.insurance;

public class Policyholder extends People {
	private Location _location;
	
	public Policyholder(String surname, String lastname, Location location) {
		super(surname, lastname);
		_location = location;
	}
}
