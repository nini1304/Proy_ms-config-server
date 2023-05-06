package com.example.Proy_msconfigserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
class ProyMsConfigServerApplication

fun main(args: Array<String>) {
	runApplication<ProyMsConfigServerApplication>(*args)
}