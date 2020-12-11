package com.mani.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mani.api.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	
}
