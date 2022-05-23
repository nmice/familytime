package ru.neginskiy.familytime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.neginskiy.familytime.domain.Family;

public interface FamilyRepository extends JpaRepository<Family, String> {
}
