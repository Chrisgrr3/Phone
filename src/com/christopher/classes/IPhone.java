package com.christopher.classes;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String ring() {
		// TODO Auto-generated method stub
		String phrase = new String();
		phrase = "iPhone " + this.getVersionNumber() + " says " + this.getRingTone();
		return phrase; 
	}

	@Override
	public String unlock() {
		// TODO Auto-generated method stub
		return "FaceID correct, accessing home screen";
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("iPhone " + this.getVersionNumber() + " from " + 
		this.getCarrier() + " has a battery percentage of " + this.getBatteryPercentage());
	}

}
