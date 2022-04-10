package com.mychew.loginapp.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController {

    fun login(): ResponseEntity<Any> {
        return ResponseEntity
    }
}