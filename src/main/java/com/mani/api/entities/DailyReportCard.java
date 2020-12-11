package com.mani.api.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DailyReportCard {

	public DailyReportCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	private int id;
	private Date date;
	private String comment;
	public int getId() {
		return id;
	}
	public DailyReportCard(int id, Date date, String comment) {
		super();
		this.id = id;
		this.date = date;
		this.comment = comment;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
