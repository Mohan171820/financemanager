package spring.Finance.manager.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.Finance.manager.Entity.Budget;

@Repository
public interface BudgetRepository extends JpaRepository<Budget, Integer> {
}
