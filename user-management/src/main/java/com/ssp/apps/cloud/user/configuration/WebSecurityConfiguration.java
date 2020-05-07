package com.ssp.apps.cloud.user.configuration;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    // @formatter:off
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       /* auth.inMemoryAuthentication().withUser("Siva").password("pass").roles("USER").and().withUser("prasad").password("pass").roles("ADMIN");*/
        
        auth
        .jdbcAuthentication().dataSource(dataSource)
        .withDefaultSchema()
        .withUser("Siva").password("pass").roles("USER").and()
        .withUser("prasad").password("pass").roles("ADMIN");
    }
 // @formatter:on

    // @formatter:off
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String[]  allowedResources = {"/h2-console/**"};
        
        http
        .csrf().disable()
        .headers().frameOptions().disable().and()
        .authorizeRequests()
        .antMatchers(allowedResources).permitAll()
        .anyRequest().authenticated().and()
        .formLogin();
    }
    // @formatter:on

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
