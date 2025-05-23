package com.gestor.projeto_engenharia_software.repository;

import com.gestor.projeto_engenharia_software.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByMail(String mail);
    List<User> findByRole(String email);
}
