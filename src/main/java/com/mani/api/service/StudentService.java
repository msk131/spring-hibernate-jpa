package com.mani.api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mani.api.entities.DailyReportCard;
import com.mani.api.entities.Student;
import com.mani.api.repositories.DailyReportCardRepository;
import com.mani.api.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository repository;
	@Autowired
	DailyReportCardRepository dailyReportCardRepository;
	
	private static Logger logger = LoggerFactory.getLogger("StudentService.class");
	
	public void addStudent() {

		logger.info("Student id 10001 -> {}", repository.findById(10001L));
		
		logger.info("All users 1 -> {}", repository.findAll());
		
		logger.info("Inserting -> {}", "");
		
		DailyReportCard dailyReportCard =new DailyReportCard();		
		dailyReportCard.setId(1);
		dailyReportCard.setDate(new Date());
		dailyReportCard.setComment("Angular");		
		List<DailyReportCard> list = new ArrayList<DailyReportCard>();		
		Student student = new Student();
		student.setDailyReportCard(list);
		student.setId(100L);
		student.setName("John");
		student.setPassportNumber("A1234657");
		dailyReportCardRepository.save(dailyReportCard);		
		repository.save(student);
		
		dailyReportCard.setComment("Spring Boot");	
	}
	
}
