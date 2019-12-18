package jib.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class Controller {
    @Get
    fun get() = "Hello, world!"
}