package spring.Finance.manager.Repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.Finance.manager.Entity.Transaction;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}
