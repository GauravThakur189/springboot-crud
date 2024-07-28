package net.javalearner.springboot_restful_api.repository;

import net.javalearner.springboot_restful_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
