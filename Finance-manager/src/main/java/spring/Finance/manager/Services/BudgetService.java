package spring.Finance.manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.Finance.manager.Entity.Budget;
import spring.Finance.manager.Repos.BudgetRepository;
import spring.Finance.manager.Repos.TransactionRepository;

import java.util.List;

@Service
public class BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    public Budget addBudget(Budget budget){
        return budgetRepository.save(budget);
    }
    public List<Budget> getAllBudgets(){
        return budgetRepository.findAll();
    }
    public Budget getBudgetById(int id){
        return budgetRepository.findById(id).get();
    }
    public Budget updateBudget(Budget budget){
        return budgetRepository.save(budget);
    }
    public void deleteBudget(int id){
    }
}
