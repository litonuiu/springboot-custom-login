package com.example.springboot.login.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Md. Liton Miah
 * @Date 6/8/2021
 */

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .anyRequest()
            .authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
//            .usernameParameter("email") //for custom username parameter
//            .passwordParameter("pass") //for custom password parameter
//            .loginProcessingUrl("doLogin") //for custom login url
            .defaultSuccessUrl("/home", true)
//            .failureUrl("login_error")
//            .successForwardUrl("login_success_handler")
//            .failureForwardUrl("/login_failure_handler")
            .permitAll()
            .and()
            .logout(logout -> logout
                    .deleteCookies("dummyCookie")
            );
    }
}
