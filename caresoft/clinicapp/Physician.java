package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes = new ArrayList<>();
	private Integer pin;
	
	public Physician(int IDcopy) {
	    this.id = IDcopy;
	}

	public boolean assignPin(int pin) {
	    String pinStr = Integer.toString(pin);
	    if (pinStr.length() != 4) {
	        return false;
	    }
	    this.setPin(pin);
	    return true;
	}

	public boolean accessAuthorized(Integer confirmedAuthID) {
        if (confirmedAuthID == this.id) {
            return true;
        }
        return false;
    }
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	

}
