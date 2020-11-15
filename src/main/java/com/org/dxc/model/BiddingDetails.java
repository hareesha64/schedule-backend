package com.org.dxc.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="Bidding_Details")
public class BiddingDetails {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name = "user_Id")
	private int id;
	private String opinion;
	public BiddingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BiddingDetails(int id, String opinion) {
		super();
		this.id = id;
		this.opinion = opinion;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOpinion() {
		return opinion;
	}
	public void setOpinion(String opinion) {
		this.opinion = opinion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((opinion == null) ? 0 : opinion.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiddingDetails other = (BiddingDetails) obj;
		if (id != other.id)
			return false;
		if (opinion == null) {
			if (other.opinion != null)
				return false;
		} else if (!opinion.equals(other.opinion))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BiddingDetails [id=" + id + ", opinion=" + opinion + "]";
	}
	
	

}