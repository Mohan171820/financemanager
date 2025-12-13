package spring.Finance.manager.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.Finance.manager.Entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Required for authentication (email is username)
    Optional<User> findByEmail(String email);
}
