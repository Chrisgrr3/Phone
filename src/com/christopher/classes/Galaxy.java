package com.christopher.classes;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		String ringer = new String();
		ringer = "Galaxy " + this.getVersionNumber() + " says " + this.getRingTone();
		return ringer;
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Galaxy " + this.getVersionNumber() + " from " + 
		this.getCarrier() + " has a battery percentage of " + this.getBatteryPercentage());
	}

}
