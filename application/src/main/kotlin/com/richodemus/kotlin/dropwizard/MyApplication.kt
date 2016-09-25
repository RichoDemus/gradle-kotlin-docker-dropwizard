package com.richodemus.kotlin.dropwizard

import com.github.richodemus.guice_classpath_scanning.ClassPathScanningModule
import io.dropwizard.Application
import io.dropwizard.assets.AssetsBundle
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import ru.vyarus.dropwizard.guice.GuiceBundle

class MyApplication : Application<MyConfiguration>() {
    companion object {
        @JvmStatic fun main(args: Array<String>) = MyApplication().run(*args)
    }

    override fun initialize(bootstrap: Bootstrap<MyConfiguration>) {
        bootstrap.addBundle(GuiceBundle.builder<MyConfiguration>()
                .enableAutoConfig("com.richodemus.kotlin.dropwizard.scan")
                .modules(ClassPathScanningModule("com.richodemus.kotlin.dropwizard.service"))
                .build())
        bootstrap.addBundle(AssetsBundle("/webroot/", "/", "index.html", "static"))
    }


    override fun run(configuration: MyConfiguration, environment: Environment) {
    }
}
