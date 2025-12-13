package spring.Finance.manager.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.Finance.manager.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
