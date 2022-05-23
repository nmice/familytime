package ru.neginskiy.familytime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neginskiy.familytime.domain.User;

public interface UserRepository extends JpaRepository<User, String> {
}
