package com.sparta.cicd_test.domain.exam.repository;

import com.sparta.cicd_test.domain.exam.entity.Exam;
import com.sparta.cicd_test.global.exception.custom.exam.ExamCodeEnum;
import com.sparta.cicd_test.global.exception.custom.exam.detail.ExamDetailCustomException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long>, ExamQueryRepository {

    default Exam findByIdOrElseThrow(Long examId) {
        return findById(examId)
            .orElseThrow(() -> new ExamDetailCustomException(ExamCodeEnum.EXAM_NOT_FOUND));
    }
}