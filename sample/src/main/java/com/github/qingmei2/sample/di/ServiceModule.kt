package com.github.qingmei2.sample.di

import com.github.qingmei2.sample.http.service.LoginService
import com.github.qingmei2.sample.http.service.ServiceManager
import com.github.qingmei2.sample.http.service.UserService
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.kodein.di.Kodein
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton
import retrofit2.Retrofit

private const val SERVICE_MODULE_TAG = "serviceModule"

val serviceModule = Kodein.Module(SERVICE_MODULE_TAG) {

    bind<UserService>() with singleton {
        instance<Retrofit>().create(UserService::class.java)
    }

    bind<LoginService>() with singleton {
        instance<Retrofit>().create(LoginService::class.java)
    }

    bind<ServiceManager>() with singleton {
        ServiceManager(instance(), instance())
    }

    bind<Gson>() with singleton {
        GsonBuilder().create()
    }
}