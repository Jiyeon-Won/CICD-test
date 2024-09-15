package com.sparta.cicd_test.global.common.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DataResponseDto<T> {
    private Integer statusCode;
    private String message;
    private final T data;
}