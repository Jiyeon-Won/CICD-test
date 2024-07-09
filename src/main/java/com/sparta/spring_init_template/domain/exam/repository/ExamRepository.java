package com.sparta.spring_init_template.domain.exam.repository;

import com.sparta.spring_init_template.domain.exam.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}