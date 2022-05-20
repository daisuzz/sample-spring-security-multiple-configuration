package com.daisuzz.samplespringsecuritymultipleconfiguration

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class SampleApiController {

    @GetMapping("/sample")
    fun getSample(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World.")
    }
}
