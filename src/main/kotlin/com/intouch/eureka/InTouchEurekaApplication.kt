package com.intouch.eureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class InTouchEurekaApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<InTouchEurekaApplication>(*args)
        }
    }
}
