package ru.gb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
