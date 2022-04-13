package com.mychew.loginapp.repository

import com.mychew.loginapp.model.Member
import org.springframework.data.jpa.repository.JpaRepository


interface MemberRepository: JpaRepository<Member, Long> {
    fun findByEmail(email:String): Member?
}
