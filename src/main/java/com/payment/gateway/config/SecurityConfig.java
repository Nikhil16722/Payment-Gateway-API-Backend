package com.payment.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth

                // Allow Swagger
                .requestMatchers(
                        "/swagger-ui/**",
                        "/v3/api-docs/**",
                        "/swagger-ui.html"
                ).permitAll()

                // Allow homepage
                .requestMatchers("/").permitAll()

                // Allow users API (for demo)
                .requestMatchers("/api/users/**").permitAll()

                // Everything else secure
                .anyRequest().authenticated()
            )
            .httpBasic(basic -> {});

        return http.build();
    }
}