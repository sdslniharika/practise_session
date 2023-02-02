package com.example.demo.com.glo.addressBook;

public class Address {

	private String label;
	private String address;
	
	public Address(String label, String address) throws Exception {
		// TODO
		if(label.isBlank() || label.contains("1") || label.length()>25)
		{
			throw new Exception();
		}
		this.label=label;
		this.address=address;
	}
	
	public String getLabel() {
		return this.label;
	}
	
	public String getAddress() {
		return this.address;
	}
}
