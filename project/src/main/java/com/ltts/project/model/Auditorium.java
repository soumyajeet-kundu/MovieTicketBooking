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

	
	public Auditorium(String audiName, int audiId) {
		super();
		this.audiName = audiName;
		this.audiId = audiId;
	}
	public Auditorium() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Auditorium [audiName=" + audiName + ", audiId=" + audiId + "]";
	}
	
	

}
