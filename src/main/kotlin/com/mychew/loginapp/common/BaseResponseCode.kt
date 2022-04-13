package com.mychew.loginapp.common

import org.springframework.http.HttpStatus

enum class BaseResponseCode(status: HttpStatus, message: String) {
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다."),
    INVALID_PASSWORD(HttpStatus.BAD_REQUEST, "잘못된 비밀번호입니다.");

    public val status: HttpStatus = status
    public val message: String = message
}