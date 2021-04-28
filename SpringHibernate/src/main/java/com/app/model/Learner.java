package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Learner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String learnername;
	private String address;


	public Learner(String learnername, String address) {
		super();
		this.learnername = learnername;
		this.address = address;
	}
	public Learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLearnername() {
		return learnername;
	}
	public void setLearnername(String learnername) {
		this.learnername = learnername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Learner [id=" + id + ", learnername=" + learnername + ", address=" + address + "]";
	}
	

}
