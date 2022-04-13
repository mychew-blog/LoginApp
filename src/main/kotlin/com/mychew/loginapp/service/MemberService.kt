package com.mychew.loginapp.service
import com.mychew.loginapp.common.BaseException
import com.mychew.loginapp.common.BaseResponseCode
import com.mychew.loginapp.model.Member
import com.mychew.loginapp.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun login(email: String, password: String): Member?{
        val member:Member? = memberRepository.findByEmail(email)
        member ?: throw BaseException(BaseResponseCode.USER_NOT_FOUND)
        return member
    }

}
