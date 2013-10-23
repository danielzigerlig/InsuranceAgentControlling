package ch.hsr.insurance;

public class Location {
	private String _street;
	private String _city;
	private String _country;
	
	public Location() {
		
	}
	
	public Location(String street, String city, String country) {
		setStreet(street);
		setCity(city);
		setCountry(country);
	}

	private String getStreet() {
		return _street;
	}

	private void setStreet(String _street) {
		this._street = _street;
	}

	private String getCity() {
		return _city;
	}

	private void setCity(String _city) {
		this._city = _city;
	}

	private String getCountry() {
		return _country;
	}

	private void setCountry(String _country) {
		this._country = _country;
	}

}
