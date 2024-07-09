package com.sparta.spring_init_template.domain.exam.repository;

import com.sparta.spring_init_template.exception.custom.exam.ExamCodeEnum;
import com.sparta.spring_init_template.domain.exam.entity.Exam;
import com.sparta.spring_init_template.exception.custom.exam.detail.ExamDetailCustomException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ExamAdapter {
    private final ExamRepository examRepository;
    private final ExamQueryRepository examQueryRepository;

    public Exam findById(Long examId) {
        return examRepository.findById(examId)
                .orElseThrow(() -> new ExamDetailCustomException(ExamCodeEnum.EXAM_NOT_FOUND));
    }

    public Exam save(Exam exam) {
        return examRepository.save(exam);
    }

    public void delete(Exam findExam) {
        examRepository.delete(findExam);
    }

    public void validateExam() {
        // exam 검증
        // ex) 사용자가 탈퇴 여부 검증
    }
}