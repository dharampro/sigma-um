package com.sigmaum.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SigmaUmApplication

fun main(args: Array<String>) {
	runApplication<SigmaUmApplication>(*args)
}
