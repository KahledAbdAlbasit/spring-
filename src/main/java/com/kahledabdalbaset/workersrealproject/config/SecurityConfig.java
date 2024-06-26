// package com.kahledabdalbaset.workersrealproject.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
// import org.springframework.security.crypto.password.NoOpPasswordEncoder;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.stereotype.Component;

// @Component
// @Configuration
// public class SecurityConfig {
//     @Bean
//     SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
//         http.authorizeHttpRequests(authRequest -> {
//             authRequest.requestMatchers("/","/workers/Dashboard","showNewAdminForm", "FormForUpdate","deleteAdmin", "/css/**", "/h2-console/**").permitAll();
//             authRequest.requestMatchers("/","Dashboard", "/note/**", "/my-notes/**", "/save/**").authenticated();
//             //authRequest.requestMatchers("/users/**").hasAnyRole("ADMIN");
//         });
//         http.cors(AbstractHttpConfigurer::disable);
//         http.csrf(AbstractHttpConfigurer::disable);
//         http.headers(AbstractHttpConfigurer::disable);
//         http.formLogin(Customizer.withDefaults());
//         http.httpBasic(Customizer.withDefaults());
//         return http.build();
//     }

//     @Bean
//     PasswordEncoder passwordEncoder() {
//         return NoOpPasswordEncoder.getInstance();
//     }
// }