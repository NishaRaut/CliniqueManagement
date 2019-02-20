package com.bridgelabz.cliniquemanagement;

public class Doctor {
	private int id;
	private String name;
	private String availability;
	private String specialization;
	private int amCount = 0;
	private int pmCount = 0;

	public Doctor() {

	}
	/**
	 *  constructor and getter setter method for above variables which present in Doctor.json file
	 * @param id
	 * @param name
	 * @param availability
	 * @param specialization
	 */

	public Doctor(int id, String name, String availability, String specialization) {
		this.id = id;
		this.name = name;
		this.availability = availability;
		this.specialization = specialization;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getAmCount() {
		return amCount;
	}

	public void setAmCount(int amCount) {
		this.amCount = amCount;
	}

	public int getPmCount() {
		return pmCount;
	}

	public void setPmCount(int pmCount) {
		this.pmCount = pmCount;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", availability=" + availability + ", specialization="
				+ specialization + "]";
	}

}
