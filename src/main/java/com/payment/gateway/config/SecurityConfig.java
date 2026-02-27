package com.payment.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers(
                            "/",
                            "/dashboard",
                            "/swagger-ui/**",
                            "/v3/api-docs/**",
                            "/api/users/**"
                    ).permitAll()
                    .anyRequest().authenticated()
            );

        return http.build();
    }
}