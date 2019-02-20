package com.bridgelabz.cliniquemanagement;

public class Patients {
	String name;
	int id;
	String phone;
    int age;
	public Patients() {
	
	}
	/**
	 *  constructor and getter setter method for above variables which present in Patient.json file
	 * @param name
	 * @param id
	 * @param phone
	 * @param age
	 */
	public Patients(String name, int id, String phone, int age) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", phone=" + phone + ", age=" + age + "]";
	}

}
