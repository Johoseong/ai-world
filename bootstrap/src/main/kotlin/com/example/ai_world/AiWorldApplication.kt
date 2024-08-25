package com.example.ai_world

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
	scanBasePackages = ["com.example.ai_world"]
)
class AiWorldApplication

fun main(args: Array<String>) {
	runApplication<AiWorldApplication>(*args)
}
