package com.richodemus.kotlin.dropwizard.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SimpleServiceTest {
    @Test
    fun `Should return the expected message`() {
        assertThat(SimpleService().getMessage()).isEqualTo(Message("The backend works"))
    }
}
