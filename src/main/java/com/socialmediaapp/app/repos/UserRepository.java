package com.socialmediaapp.app.repos;

import com.socialmediaapp.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
