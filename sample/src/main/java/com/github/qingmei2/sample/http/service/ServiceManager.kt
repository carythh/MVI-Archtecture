package com.github.qingmei2.sample.http.service

data class ServiceManager(
    val userService: UserService,
    val loginService: LoginService
)
