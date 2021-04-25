package br.com.bdmoriki.reactivedynamodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactivedynamodbApplication

fun main(args: Array<String>) {
	runApplication<ReactivedynamodbApplication>(*args)
}
