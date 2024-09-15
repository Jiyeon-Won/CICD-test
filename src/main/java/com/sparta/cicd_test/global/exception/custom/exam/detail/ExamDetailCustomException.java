package com.sparta.cicd_test.global.exception.custom.exam.detail;

import com.sparta.cicd_test.global.exception.custom.exam.ExamCodeEnum;
import com.sparta.cicd_test.global.exception.custom.exam.ExamException;

public class ExamDetailCustomException extends ExamException {

    public ExamDetailCustomException(ExamCodeEnum examCodeEnum) {
        super(examCodeEnum);
    }
}