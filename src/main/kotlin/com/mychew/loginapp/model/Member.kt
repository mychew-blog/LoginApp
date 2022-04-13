package com.mychew.loginapp.model

import org.hibernate.annotations.CreationTimestamp
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Member {
    @Id
    @GeneratedValue
    var id: Long? = null

    var email: String? = null
    var password: String? = null

    @CreationTimestamp
    var createdAt: LocalDateTime = LocalDateTime.now()

    fun checkPassword(input_password:String): Boolean{
        return (password == input_password)
    }
}