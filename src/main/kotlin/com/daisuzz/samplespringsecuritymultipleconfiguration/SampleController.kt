package com.daisuzz.samplespringsecuritymultipleconfiguration

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
@RequestMapping
class SampleController {

    @GetMapping("/sample")
    fun index(modelAndView: ModelAndView): String {
        return "index"
    }
}
