package com.ltts.project.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Auditorium implements Serializable {
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private String audiName; 
	@Id
	private int audiId;
	
	private int seats;
	
	
	public String getAudiName() {
		return audiName;
	}
	public void setAudiName(String audiName) {
		this.audiName = audiName;
	}
	public int getAudiId() {
		return audiId;
	}
	public void setAudiId(int audiId) {
		this.audiId = audiId;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	

	
	public Auditorium(String audiName, int audiId, int seats) {
		super();
		this.audiName = audiName;
		this.audiId = audiId;
		this.seats = seats;
	}
	public Auditorium() {
		super();
	}
	
	
	
	@Override
	public String toString() {
		return "Auditorium [audiName=" + audiName + ", audiId=" + audiId + ", seats=" + seats + "]";
	}
	
	
	
	
	

}
