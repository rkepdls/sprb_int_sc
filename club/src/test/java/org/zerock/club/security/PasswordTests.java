package org.zerock.club.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class PasswordTests {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testEncode() {

        String password = "1111";

        String enPw = passwordEncoder.encode(password);

        System.out.println("enPw: "+enPw);

        boolean matchResult = passwordEncoder.matches(password, enPw);

        System.out.println("matchResult: "+matchResult);

        // 1st result : $2a$10$zzDYWmb4XOlUZ3ZDK0fcW.q/ed/xZCtCYB6aGD8lFGMtS0nUWasMS
        // 2nd result : $2a$10$kGPYDfUbLNcxbYfr/STRFue4ckDKMzHhGm1SvfnqrO/VURYk4IVcW
    }
}
