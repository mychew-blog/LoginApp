package com.mychew.loginapp.controller

import com.mychew.loginapp.dto.MemberRequest
import com.mychew.loginapp.service.MemberService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MemberController(
    private val memberService: MemberService
) {
    @PostMapping("/login")
    fun login(
        @RequestBody memberRequest: MemberRequest
    ): ResponseEntity<Any> {
        return memberService.login(memberRequest.email, memberRequest.password)
    }

    @PostMapping("/join")
    fun join(
        @RequestBody memberRequest: MemberRequest
    ): ResponseEntity<Any> {
        return memberService.join(memberRequest.email, memberRequest.password)
    }
}