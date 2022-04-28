package com.example.demo.Entities;

import java.sql.Array;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Column
	private Boolean status;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String userid;
	@Column
	private String emailid;
	@Column
	private int college_rollno;
	@Column
	private Array data;
	public User() {
		super();
	}
	
	public User(Boolean status, String userid, String emailid, int college_rollno, Array data) {
		super();
		this.status = status;
		this.userid = userid;
		this.emailid = emailid;
		this.college_rollno = college_rollno;
		this.data = data;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getCollege_rollno() {
		return college_rollno;
	}
	public void setCollege_rollno(int college_rollno) {
		this.college_rollno = college_rollno;
	}
	public Array getData() {
		return data;
	}
	public void setData(Array data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "User [status=" + status + ", userid=" + userid + ", emailid=" + emailid + ", college_rollno="
				+ college_rollno + ", data=" + data + "]";
	}
	
	
	
	

}
