package com.sparta.spring_init_template.domain.exam.controller;

import com.sparta.spring_init_template.common.response.DataResponseDto;
import com.sparta.spring_init_template.common.response.MessageResponseDto;
import com.sparta.spring_init_template.exception.custom.exam.ExamCodeEnum;
import com.sparta.spring_init_template.common.response.ResponseUtils;
import com.sparta.spring_init_template.domain.exam.dto.ExamCreateRequestDto;
import com.sparta.spring_init_template.domain.exam.dto.ExamResponseDto;
import com.sparta.spring_init_template.domain.exam.dto.ExamUpdateRequestDto;
import com.sparta.spring_init_template.domain.exam.service.ExamService;
import com.sparta.spring_init_template.exception.custom.exam.detail.ExamDetailCustomException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/exam")
public class ExamController {
    private final ExamService examService;

    // Exam 생성
    @PostMapping
    public ResponseEntity<DataResponseDto<ExamResponseDto>> save(
//            @AuthenticationPrincipal AuthenticationUser user,
            @Valid @RequestBody ExamCreateRequestDto requestDto
    ) {
        ExamResponseDto responseDto = examService.save(requestDto);
        return ResponseUtils.createOk(responseDto);
    }

    // Exam 조회
    @GetMapping("/{examId}")
    public ResponseEntity<DataResponseDto<ExamResponseDto>> findById(
            @PathVariable Long examId
    ) {
        ExamResponseDto responseDto = examService.findById(examId);
        return ResponseUtils.findOk(responseDto);
    }

    // Exam 수정
    @PutMapping("/{examId}")
    public ResponseEntity<DataResponseDto<ExamResponseDto>> update(
//            @AuthenticationPrincipal AuthenticationUser user,
            @PathVariable Long examId,
            @Valid @RequestBody ExamUpdateRequestDto requestDto
    ) {
        ExamResponseDto responseDto = examService.update(examId, requestDto);
        return ResponseUtils.updateOk(responseDto);
    }

    // Exam 삭제
    @DeleteMapping("/{examId}")
    public ResponseEntity<MessageResponseDto> delete(
//            @AuthenticationPrincipal AuthenticationUser user,
            @PathVariable Long examId
    ) {
        examService.delete(examId);
        return ResponseUtils.deleteOk();
    }
}