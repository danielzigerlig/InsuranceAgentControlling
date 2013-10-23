package ch.hsr.insurance;

public class InsuranceAgent extends People {
	private InsuranceCompany _company;
	
	public InsuranceAgent(String surname, String lastname, InsuranceCompany company) {
		super(surname, lastname);
		_company = company;
	}
}
