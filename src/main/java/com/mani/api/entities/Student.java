package com.mani.api.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	public List<DailyReportCard> getDailyReportCard() {
		return dailyReportCard;
	}

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
	
	@OneToMany
	private List<DailyReportCard> dailyReportCard;

	public void setDailyReportCard(List<DailyReportCard> dailyReportCard) {
		this.dailyReportCard = dailyReportCard;
	}

	public Student() {
		super();
	}

	public Student(Long id, String name, String passportNumber) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Student(String name, String passportNumber) {
		super();
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public Student(Long id, String name, String passportNumber, List<DailyReportCard> dailyReportCard) {
		super();
		this.id = id;
		this.name = name;
		this.passportNumber = passportNumber;
		this.dailyReportCard = dailyReportCard;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, passportNumber=%s]", id, name, passportNumber);
	}
}