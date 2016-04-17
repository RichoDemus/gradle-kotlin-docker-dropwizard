package com.richodemus.kotlin.dropwizard.inject

import com.google.inject.AbstractModule
import com.richodemus.kotlin.dropwizard.service.Service
import com.richodemus.kotlin.dropwizard.service.SimpleService

internal class MyGuiceModule : AbstractModule() {
    override fun configure() {
        bind(Service::class.java).to(SimpleService::class.java)
    }
}