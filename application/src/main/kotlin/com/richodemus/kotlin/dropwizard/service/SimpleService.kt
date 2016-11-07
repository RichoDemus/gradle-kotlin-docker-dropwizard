package com.richodemus.kotlin.dropwizard.service

internal class SimpleService : Service {
    override fun getMessage() = listOf("The", "backend", "works")
            .reduce { sum, new -> sum + " " + new }
            .toMessage()

    private fun String.toMessage() = Message(this)
}
