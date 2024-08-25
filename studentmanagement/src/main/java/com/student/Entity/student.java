package com.student.Entity;

import jakarta.persistence.Column; 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "name" , nullable = false)
	private String nmae;
	@Column(name = "last_name")
	private String lastname;
	@Column(name= "Email")
	private String email;

	
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(long id, String nmae, String lastname, String email) {
		super();
		this.id = id;
		this.nmae = nmae;
		this.lastname = lastname;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNmae() {
		return nmae;
	}
	public void setNmae(String nmae) {
		this.nmae = nmae;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
