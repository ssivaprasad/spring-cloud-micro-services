package com.ssp.apps.cloud.oauth.server.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import com.ssp.apps.cloud.oauth.server.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}
