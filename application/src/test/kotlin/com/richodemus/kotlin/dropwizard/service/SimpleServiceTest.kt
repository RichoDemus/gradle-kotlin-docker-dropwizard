package com.richodemus.kotlin.dropwizard.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SimpleServiceTest {
    @Test
    fun shouldReturnMessage() {
        assertThat(SimpleService().getMessage()).isEqualTo("The service class works")
    }
}