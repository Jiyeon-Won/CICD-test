package com.sparta.cicd_test.domain.exam.repository;

import com.querydsl.core.types.ConstructorExpression;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sparta.cicd_test.domain.exam.dto.ExamResponseDto;
import com.sparta.cicd_test.domain.exam.dto.QExamResponseDto;
import com.sparta.cicd_test.domain.exam.entity.QExam;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class ExamRepositoryImpl implements ExamQueryRepository {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<ExamResponseDto> findAllExam() {
        QExam qExam = QExam.exam;

        return queryFactory.select(new QExamResponseDto(qExam.title, qExam.content))
            .from(qExam)
            .fetch();
    }
}