package com.kahledabdalbaset.workersrealproject.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.kahledabdalbaset.workersrealproject.models.Admin;
import com.kahledabdalbaset.workersrealproject.repository.AdminRepository;

public class CustomAdminDeltailsService implements UserDetailsService{
    private AdminRepository adminRepository;
    // private final static String ROLE_PREFIX = "ROLE_";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //log.info("username {} ", username);
        Optional<Admin> admin = this.adminRepository.findByUsername(username);
        admin.orElseThrow(() -> new UsernameNotFoundException("User not found!"));
        //log.info("user {} ", user.get());
        String password = admin.get().getPassword();
        //log.info("password {} ", password);
        // String role = user.get().getRole();
        //log.info("before role {} ", role);
        // role = ROLE_PREFIX + role;
        //log.info("role with ROLE_PREFIX {} ", role);
        // List<GrantedAuthority> roles = new ArrayList<>();
        // roles.add(new SimpleGrantedAuthority(role));
        //log.info("roles {} ", roles);
        return new CustomAdminDetails(username, password);
    }
}
