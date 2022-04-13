package com.mychew.loginapp.common

class BaseException(baseResponseCode: BaseResponseCode): RuntimeException() {
    public val baseResponseCode: BaseResponseCode = baseResponseCode
}