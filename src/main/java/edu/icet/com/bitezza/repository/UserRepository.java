package edu.icet.com.bitezza.repository;

import edu.icet.com.bitezza.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByUsername(String username);

}
