package com.example.demoinitial.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class AppUserDetailsServiceTest {
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Test
    public void loadUser() {
        UserDetailsImpl userDetailsImpl = (UserDetailsImpl)
                userDetailsService.loadUserByUsername("admin@example.com");
        assertEquals(userDetailsImpl.getUsername(), "admin");
    }
}
