package com.richodemus.kotlin.dropwizard.service

internal class SimpleService : Service {
    override fun getMessage() = listOf("The", "backend", "works")
            .joinToString(" ")
            .toMessage()

    private fun String.toMessage() = Message(this)
}
