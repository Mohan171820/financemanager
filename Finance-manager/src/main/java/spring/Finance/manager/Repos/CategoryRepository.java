package spring.Finance.manager.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.Finance.manager.Entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
