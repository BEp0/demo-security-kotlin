package br.com.bernardo.demosecurity

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoSecurityApplication

fun main(args: Array<String>) {
    runApplication<DemoSecurityApplication>(*args)
}
