package com.ssp.apps.cloud.user.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "AUTHORITIES ")
@Getter
@Setter
@NoArgsConstructor
public class Authorities {

    @Id
    private String username;

    private String authority;
}
