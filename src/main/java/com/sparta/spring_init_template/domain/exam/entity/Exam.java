package com.sparta.spring_init_template.domain.exam.entity;

import com.sparta.spring_init_template.common.TimeStampEntity;
import com.sparta.spring_init_template.domain.exam.dto.ExamUpdateRequestDto;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Exam extends TimeStampEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @Builder // 필요한 것만 생성자로
    public Exam(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void update(ExamUpdateRequestDto requestDto) {
        this.title = requestDto.getTitle() != null ? requestDto.getTitle() : title;
        this.content = requestDto.getContent() != null ? requestDto.getContent() : content;
    }
}