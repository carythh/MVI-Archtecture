package com.github.qingmei2.sample.ui.login

import com.github.qingmei2.mvi.base.intent.IIntent

sealed class LoginIntent : IIntent {

    data class LoginClicksIntent(
        val username: String?,
        val password: String?
    ) : LoginIntent()

    data class EditUsernameIntent(
        val username: String
    ) : LoginIntent()

    data class EditPasswordIntent(
        val password: String
    ) : LoginIntent()

    object LoginSuccessIntent : LoginIntent()
}