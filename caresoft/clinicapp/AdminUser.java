package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<>();
    private Integer pin;
    
    public AdminUser(int id, String role) {
        this.id = id;
        this.employeeID = id;
        this.role = role;
    }
    
    public boolean assignPin(int pin) {
	    String pinStr = Integer.toString(pin);
	    if (pinStr.length() < 6) {
	        return false;
	    }
	    this.setPin(pin);
	    return true;
	}
    
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	 if (confirmedAuthID == this.id) {
             return true;
         }
    	authIncident();
    	return false;
    }
    
    public ArrayList<String> reportSecurityIncidents() {
        return securityIncidents;
    }
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}
}
