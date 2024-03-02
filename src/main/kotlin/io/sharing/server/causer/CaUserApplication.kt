package io.sharing.server.causer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class CaUserApplication

fun main(args: Array<String>) {
    runApplication<CaUserApplication>(*args)
}
