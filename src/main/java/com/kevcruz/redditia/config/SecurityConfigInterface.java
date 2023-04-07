package com.kevcruz.redditia.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;

public interface SecurityConfigInterface {
    void configure(HttpSecurity http) throws Exception;
}
