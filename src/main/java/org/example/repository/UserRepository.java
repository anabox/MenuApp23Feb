package org.example.repository;

import org.example.entity.user.MenuUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<MenuUser,Long> {
    Optional<MenuUser> findByUsername(String username);

}
