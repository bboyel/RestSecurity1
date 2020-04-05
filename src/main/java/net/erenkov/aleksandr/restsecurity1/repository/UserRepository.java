package net.erenkov.aleksandr.restsecurity1.repository;

import net.erenkov.aleksandr.restsecurity1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
