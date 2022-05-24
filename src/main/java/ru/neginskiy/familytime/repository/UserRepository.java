package ru.neginskiy.familytime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neginskiy.familytime.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
}
