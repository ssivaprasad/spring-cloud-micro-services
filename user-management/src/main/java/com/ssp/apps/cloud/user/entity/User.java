package com.ssp.apps.cloud.user.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private String username;

    private String password;
    private boolean enabled;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "username")
    private List<Authorities> authorities;
}
