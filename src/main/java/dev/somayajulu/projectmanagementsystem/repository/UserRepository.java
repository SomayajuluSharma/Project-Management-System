package dev.somayajulu.projectmanagementsystem.repository;

import dev.somayajulu.projectmanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User  findByEmail(String email);
}
