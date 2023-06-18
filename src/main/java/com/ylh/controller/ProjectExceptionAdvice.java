package com.ylh.controller;

import com.ylh.exception.BusinessException;
import com.ylh.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(Exception e) {
        return new Result(Code.SYSTEM_ERR, null, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(Exception e) {
        return new Result(Code.BUSINESS_ERR, null, e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e) {
        return new Result(Code.UNKNOWN_ERR, null, "unknown error");
    }
}
