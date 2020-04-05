package net.erenkov.aleksandr.restsecurity1.repository;

import net.erenkov.aleksandr.restsecurity1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
