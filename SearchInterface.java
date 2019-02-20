package com.bridgelabz.cliniquemanagement;
/**
 * interface for serching the information
 * @author admin1
 *
 */
public interface SearchInterface {
	void operation();
	void searchByPatientName();
	void searchByPatientphone();
	void serarchByPatientid();
	void searchByDoctorName();
	void searchByDoctorId();
	void searchByDoctorSpecialization();
	void searchByDoctorAvailability();
	void mostPopularDoctor();
	void mostPopularSpecialization();
}
