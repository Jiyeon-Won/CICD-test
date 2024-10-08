package com.sparta.cicd_test.domain.exam.dto;

import com.sparta.cicd_test.domain.exam.entity.Exam;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class ExamCreateRequestDto {
    @NotBlank(message = "제목 입력하세요.")
    private String title;
    @NotBlank(message = "내용 입력하세요.")
    private String content;

    public Exam toEntity() {
        return Exam.builder()
            .title(title)
            .content(content)
            .build();
    }
}