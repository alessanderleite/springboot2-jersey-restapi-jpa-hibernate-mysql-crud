package br.com.alessanderleite.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alessanderleite.api.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
