package com.bridgelabz.cliniquemanagement;

public class Appointment {
	String doctorName;
	int doctorId;
	String patientName;
	int patientId;
	String availibility;
String patientPhone;
public Appointment() {
	
}
/**
 * constructor and getter setter method for above variables which present in Appointment.json file
 * @param doctorName
 * @param doctorId
 * @param patientName
 * @param patientId
 * @param availibility
 * @param patientPhone
 */
public Appointment(String doctorName, int doctorId, String patientName, int patientId, String availibility,String patientPhone) {
	super();
	this.doctorName = doctorName;
	this.doctorId = doctorId;
	this.patientName = patientName;
	this.patientId = patientId;
	this.availibility = availibility;
	this.patientPhone = patientPhone;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public int getDoctorId() {
	return doctorId;
}
public void setDoctorId(int doctorId) {
	this.doctorId = doctorId;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public String getAvailibility() {
	return availibility;
}
public void setAvailibility(String availibility) {
	this.availibility = availibility;
}
public String getPatientPhone() {
	return patientPhone;
}
public void setPatientPhone(String patientPhone) {
	this.patientPhone = patientPhone;
}
@Override
public String toString() {
	return "Appointments [doctorName=" + doctorName + ", doctorId=" + doctorId + ", patientName=" + patientName
			+ ", patientId=" + patientId + ", Availibility=" + availibility + ", patientPhone=" + patientPhone + "]";
}

}
