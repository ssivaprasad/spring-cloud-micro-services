package com.ssp.apps.cloud.user.dto;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.ssp.apps.cloud.user.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPrincipal implements UserDetails {

    private String username;
    private String password;
    private boolean enabled;

    private List<GrantedAuthority> authorities;

    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;

    public UserPrincipal(User user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.enabled = user.isEnabled();

        this.authorities = user.getAuthorities().stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getAuthority()))
                .collect(Collectors.toList());

    }


}
