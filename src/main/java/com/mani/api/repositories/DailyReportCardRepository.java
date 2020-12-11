package com.mani.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mani.api.entities.DailyReportCard;

@Repository
public interface DailyReportCardRepository extends JpaRepository<DailyReportCard, Long>{

}
