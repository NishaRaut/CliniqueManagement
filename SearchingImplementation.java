package com.bridgelabz.cliniquemanagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgelabz.utility.Utility;
import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * class for serching the available data
 * @author admin1
 *
 */

public class SearchingImplementation implements SearchInterface {

	static ObjectMapper mapper=new ObjectMapper();
	List<Patients> personlist=new ArrayList<>();
	List<Doctor> doctorlist=new ArrayList<>();
	List<Appointment> appointmentlist=new ArrayList<>();
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
	String name;
	String phone;
	int id;
	
	//@Override
	/**
	 * TO PERFORM THE SEARCHING OPERATION
	 */
	public void operation()
	{
		int Answer=0;
		do {
			System.out.println("1. Search Doctor by Name");	
			System.out.println("2. Search Doctor by id");
			System.out.println("3. Search Doctor by Specialization");
			System.out.println("4. Search Doctor by Availability");
			System.out.println("5. Search Patients by Name");
			System.out.println("6. Search Patients by id");
			System.out.println("7. Search Patients by Phone");
			System.out.println("8. Exit");
			Answer=Utility.getInt();
			switch(Answer)
			{
			case 1:
				searchByDoctorName();
				break;
			case 2:
				searchByDoctorId();
				break;
				
			case 3:
				searchByDoctorSpecialization();
				break;
				
			case 4:
				searchByDoctorAvailability();
				break;
			case 5:
				searchByPatientName();
				break;
			case 6:
				serarchByPatientid();
				break;
			case 7:
				searchByPatientphone();
				break;
			case 8:
				mostPopularDoctor();
				break;
			case 9:
				mostPopularSpecialization();
				break;
			case 10:
				break;
			default:
				System.out.println("Invalid entry");
			}
		}while(Answer!=10);
		}
	@Override
	/**
	 * method to search patient
	 */
	
	public void searchByPatientName() {
		System.out.println("Enter Name");
		name=Utility.next();
		
		List<Patients> listtemp=(List<Patients>)personlist.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList());
	 
		
		if(listtemp.size()!=0)
	    {
		System.out.println("            Name        id              phone          age  ");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
	    }
	    else
	    {
	    	System.out.println("This name not available on the list");
	    }
		
	}
	@Override
	/**
	 * method for searching phone number
	 */
		public void searchByPatientphone() {
			System.out.println("Enter phone number:");
			phone=Utility.next();
			List<Patients> listtemp=(List<Patients>)personlist.stream().filter(i -> i.getPhone().equals(phone)).collect(Collectors.toList());
			if(listtemp.size()!=0)
			{
			System.out.println("            Name        id              phone          age  ");
			for(int i=0;i<listtemp.size();i++)
			{
				System.out.println(listtemp.get(i).toString());
			}
			}
			else
			{
				System.out.println("This number not available on the list");
			}
			
		}

	@Override
	/**
	 * method to search patient id
	 */
	public void serarchByPatientid() {
		System.out.println("Enter id");
		id=Utility.getInt();
			List<Patients> listtemp=personlist.stream().filter(i -> i.getId()==id).collect(Collectors.toList());
			if(listtemp.size()!=0)
			{
			System.out.println("            Name        id              phone          age  ");
			System.out.println(listtemp.get(0).toString());
		}
		else
		{
			System.out.println("Unknown Id");
		}
		
	}

	

	@Override
	/**
	 * method to search doctor name
	 */
	public void searchByDoctorName() {
		
		System.out.println("Enter Name");
		name=Utility.next();
		List<Doctor> listtemp=(List<Doctor>)doctorlist.stream().filter(i -> i.getName().equals(name)).collect(Collectors.toList());
		if(listtemp.size()!=0)
		{
		System.out.println("           id         Name           Availability             Specialist");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
		}
		else
		{
			System.out.println("This name not available on the list");
		}
		
		
	}

	@Override
	/**
	 * method to search doctor id
	 */
	public void searchByDoctorId() {
		System.out.println("Enter id");
		id=Utility.getInt();
		List<Doctor> listtemp=doctorlist.stream().filter(i -> i.getId()==id).collect(Collectors.toList());
		if(listtemp.size()!=0)
		{
		System.out.println("           id         Name           Availability             Specialist");
			System.out.println(listtemp.get(0).toString());
		}
		else
		{
			System.out.println("Unknown Id");
		}
	}

	//@Override
	/**
	 * method to search doctor specialization
	 */
	public void searchByDoctorSpecialization() {
		System.out.println("Enter Specialization");
		name=Utility.next();
		List<Doctor> listtemp=(List<Doctor>)doctorlist.stream().filter(i -> i.getSpecialization().equals(name)).collect(Collectors.toList());
		if(listtemp.size()!=0)
		{
		System.out.println("           id         Name          Availability             Specialist");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
		}
		else
		{
			System.out.println("This specialist not available");
		}

	}

	@Override
	/**
	 * method to search doctor availability
	 */
	public void searchByDoctorAvailability() {
		System.out.println("Enter Availability AM or PM only");
		name=Utility.next();
		
		List<Doctor> listtemp=(List<Doctor>)doctorlist.stream().filter(i -> i.getAvailability().equals(name)).collect(Collectors.toList());
		if(listtemp.size()!=0)
		{
		System.out.println("           id         Name          Availability             Specialist");
		for(int i=0;i<listtemp.size();i++)
		{
			System.out.println(listtemp.get(i).toString());
		}
		}
		else
		{
			System.out.println("Doctors not available on this time");
		}
		
	}

	@Override
	public void mostPopularDoctor() {
		
		
	}

	@Override
	public void mostPopularSpecialization() {
		
}

}
