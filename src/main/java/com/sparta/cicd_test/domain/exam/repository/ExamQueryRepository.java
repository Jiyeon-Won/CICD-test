package com.sparta.cicd_test.domain.exam.repository;

import com.sparta.cicd_test.domain.exam.dto.ExamResponseDto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamQueryRepository {

    List<ExamResponseDto> findAllExam();
}