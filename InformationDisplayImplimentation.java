package com.bridgelabz.cliniquemanagement;

import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bridgelabz.utility.Utility;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * Implementation class for patients and doctors
 * @author Nisha
 *
 */

public class InformationDisplayImplimentation implements InformationDisplay {
	static ObjectMapper mapper = new ObjectMapper();
	List<Patients> personlist = new ArrayList<>();
	List<Doctor> doctorlist = new ArrayList<>();
	List<Appointment> appointmentlist = new ArrayList<>();
	Utility input = new Utility();
	String patientFilePath = "/home/admin1/newProject/bridgelabz/src/com/bridgelabz/cliniquemanagement/";
	String doctorsFilePath = "/home/admin1/newProject/bridgelabz/src/com/bridgelabz/cliniquemanagement/";
	String appointmentFilePath = "/home/admin1/newProject/bridgelabz/src/com/bridgelabz/cliniquemanagement/";

	{
		try {
			// System.out.println("Working");
			personlist = new ArrayList<>(
					Arrays.asList(mapper.readValue(new File(patientFilePath + "patients.json"), Patients[].class)));
			doctorlist = new ArrayList<>(
					Arrays.asList(mapper.readValue(new File(doctorsFilePath + "doctors.json"), Doctor[].class)));
			System.out.println("doctor:: " + doctorlist);
			appointmentlist = new ArrayList<>(Arrays
					.asList(mapper.readValue(new File(appointmentFilePath + "appointment.json"), Appointment[].class)));
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	/**
	 * operation method to perform operation to display patient and doctors information
	 */

	public void operation() {
		
		System.out.println("1. Print Patients Information");
		System.out.println("2. Print Doctors Information");
		System.out.println("4. Exit");
		int Answer = input.getInt();
		switch (Answer) {
		case 1:
			patientInformation();
			break;
		case 2:
			doctorInformation();
			break;

		case 3:
			System.out.println("Exiting");
			break;
		default:
			System.out.println("Invalid Entry");
		}
	}

	@Override
	/**
	 * to display patient information
	 */
	public void patientInformation() {
		// TODO Auto-generated method stub
		// String spaces=" ";
		System.out.println("PatientName  Patientid  PatientPhone  Patientage");
		System.out.println("Patient List : " + personlist);
		personlist.stream().forEach(i -> {
			System.out.println(i.getName() + "   " + i.getId() + "   " + i.getPhone() + "   " + i.getAge());
		});

	}

	@Override
	/**
	 * to display doctors information
	 */
	public void doctorInformation() {
		
		System.out.println("  Doctorid   DoctorName  Doctoravailability Doctorspecialization");
		 System.out.println("Doctors List : "+doctorlist);
		
		doctorlist.stream().forEach(i -> {
			System.out.println(
					i.getId() + "   " + i.getName() + "   " + i.getAvailability() + "   " + i.getSpecialization());
		});
	}

}
