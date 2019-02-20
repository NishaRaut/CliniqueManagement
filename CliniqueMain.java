package com.bridgelabz.cliniquemanagement;

import com.bridgelabz.utility.Utility;


public class CliniqueMain {
public static void main(String[] args) {
		
		System.out.println("WELCOME TO CLINICAL MANAGEMENT");
		int Answer=0;
		
		do {
			System.out.println("1. Adding Doctor or Patient or Appointment");
			System.out.println("2. Search");
			System.out.println("3. Display");
			System.out.println("4. Close");
			Answer=Utility.getInt();
			switch(Answer)
			{
			case 1:
				new DoctorPatientImplementation().operation();
				break;
			case 2:
				new SearchingImplementation().operation();
				break;
			case 3:
				new InformationDisplayImplimentation().operation();
				break;
			case 4:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Invalid Entry");
			}
		}while(Answer!=4);

}
}
