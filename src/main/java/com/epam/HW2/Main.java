package com.epam.HW2;

import com.epam.HW2.ShowID;

class Main{
	public static void main(String[] args) {
		System.out.println("Assertion Check:");
		new Main().createAssert(-5);

		ShowID showID = new ShowID();
		System.out.println("ID: " + showID.getID());
	}
	

	public void createAssert(int a){
		assert(a>0);
		System.out.println(a); 
	} 
}