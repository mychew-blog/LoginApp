package com.mychew.loginapp.service
import com.mychew.loginapp.common.BaseException
import com.mychew.loginapp.common.BaseRes
import com.mychew.loginapp.common.BaseResponseCode
import com.mychew.loginapp.model.Member
import com.mychew.loginapp.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    fun login(email: String, password: String): ResponseEntity<Any>{
        val member:Member? = memberRepository.findByEmail(email)
        member ?: throw BaseException(BaseResponseCode.USER_NOT_FOUND)

        if(!member.checkPassword(password)){
            throw BaseException(BaseResponseCode.INVALID_PASSWORD)
        }

        return ResponseEntity.ok().body(member)
    }

    fun join(email: String, password: String): ResponseEntity<Any>{
        val member:Member? = memberRepository.findByEmail(email)
        member?.let { throw BaseException(BaseResponseCode.DUPLICATE_USER) }
        return ResponseEntity.ok().body(memberRepository.save(Member(email, password)))
    }

}
