package com.propen.resismiop.repository;

import com.propen.resismiop.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDb extends JpaRepository<UserModel, Long> {
    UserModel findByUsername(String username);
    UserModel findByPassword(String password);
}
