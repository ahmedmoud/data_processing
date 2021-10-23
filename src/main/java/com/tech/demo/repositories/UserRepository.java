package com.tech.demo.repositories;
import com.tech.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  UserRepository extends JpaRepository<User, Integer>{
}
