package com.payment.gateway.config;

import com.payment.gateway.model.User;
import com.payment.gateway.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) {

        if (userRepository.count() == 0) {

            userRepository.save(
                    User.builder()
                            .fullName("Nikhil Lingala")
                            .email("nikhil@example.com")
                            .password("123456")
                            .build()
            );

            userRepository.save(
                    User.builder()
                            .fullName("HR Demo User")
                            .email("hr@example.com")
                            .password("password")
                            .build()
            );

            System.out.println("Sample users inserted into database!");
        }
    }
}