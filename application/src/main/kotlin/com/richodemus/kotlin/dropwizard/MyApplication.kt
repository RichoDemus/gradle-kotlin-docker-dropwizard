package com.richodemus.kotlin.dropwizard

import com.richodemus.kotlin.dropwizard.inject.MyGuiceModule
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import ru.vyarus.dropwizard.guice.GuiceBundle

class MyApplication : Application<MyConfiguration>() {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MyApplication().run(*args)
        }
    }

    override fun initialize(bootstrap: Bootstrap<MyConfiguration>) =
            bootstrap.addBundle(GuiceBundle.builder<MyConfiguration>()
                    .enableAutoConfig("com.richodemus.kotlin.dropwizard.scan")
                    .modules(MyGuiceModule())
                    .build())


    override fun run(configuration: MyConfiguration, environment: Environment) {
    }
}
