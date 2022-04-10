package com.mychew.loginapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoginAppApplication

fun main(args: Array<String>) {
    runApplication<LoginAppApplication>(*args)
}
