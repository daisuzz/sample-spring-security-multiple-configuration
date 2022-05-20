package com.daisuzz.samplespringsecuritymultipleconfiguration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.web.servlet.invoke
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfiguration {

    @Bean
    @Order(1)
    fun apiFilterChain(http: HttpSecurity): SecurityFilterChain {
        http {
            securityMatcher("/api/**")
            httpBasic { }
            authorizeRequests {
                authorize("/api", authenticated)
                authorize(anyRequest, permitAll)
            }
        }
        return http.build()
    }

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http {
            formLogin { }
            authorizeRequests {
                authorize("/", authenticated)
                authorize(anyRequest, permitAll)
            }
        }
        return http.build()
    }
}
