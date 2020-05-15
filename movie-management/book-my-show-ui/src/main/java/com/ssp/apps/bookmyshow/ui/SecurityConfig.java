package com.ssp.apps.bookmyshow.ui;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // @formatter:off
        http.csrf().disable()
        .headers().frameOptions().disable().and()
        .authorizeRequests()
        .anyRequest().authenticated().and()
        .httpBasic().disable();
        // @formatter:on

    }
}
