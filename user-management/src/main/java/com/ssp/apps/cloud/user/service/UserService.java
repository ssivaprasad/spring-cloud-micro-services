package com.ssp.apps.cloud.user.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.ssp.apps.cloud.user.dto.UserPrincipal;
import com.ssp.apps.cloud.user.entity.User;
import com.ssp.apps.cloud.user.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findById(username);
        return user.map((userDtl) -> new UserPrincipal(userDtl))
                .orElseThrow(() -> new RuntimeException("Invalid Username"));
    }

}
