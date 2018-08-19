package de.roamingthings.jibworkbench

import org.springframework.http.MediaType.TEXT_PLAIN_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SmokeController {

    @GetMapping("/smoke", produces = [TEXT_PLAIN_VALUE])
    fun smoke() = "smoking"

    @GetMapping("/burn", produces = [TEXT_PLAIN_VALUE])
    fun burn() = "burning"

}
