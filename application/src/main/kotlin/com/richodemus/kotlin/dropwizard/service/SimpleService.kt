package com.richodemus.kotlin.dropwizard.service

internal class SimpleService : Service {
    override fun getMessage() = Message("The backend works")
}
