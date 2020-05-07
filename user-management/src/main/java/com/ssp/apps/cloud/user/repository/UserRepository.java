package com.ssp.apps.cloud.user.repository;

import org.springframework.data.repository.CrudRepository;
import com.ssp.apps.cloud.user.entity.User;

public interface UserRepository extends CrudRepository<User, String> {

}
