package com.christopher.tester;

import com.christopher.classes.Galaxy;
import com.christopher.classes.IPhone;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		Galaxy s9 = new Galaxy("S9", 99, "ATT", "Ring Ring Ring!");
		IPhone iphone = new IPhone("12", 80, "tmobile", "RRrrrrrring rrrrring");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphone.displayInfo();
		System.out.println(iphone.ring());
		System.out.println(iphone.unlock());
	}

}
