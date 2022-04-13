package com.mychew.loginapp.common

import org.springframework.http.HttpStatus

data class BaseRes(
    val status: HttpStatus,
    val message: String?
)