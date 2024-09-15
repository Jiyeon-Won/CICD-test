package com.sparta.cicd_test.domain.exam.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.sparta.cicd_test.domain.exam.entity.Exam;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ExamResponseDto {
    private String title;
    private String content;

    @QueryProjection
    public ExamResponseDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public static ExamResponseDto from(Exam exam) {
        return ExamResponseDto.builder()
                .title(exam.getTitle())
                .content(exam.getContent())
                .build();
    }
}