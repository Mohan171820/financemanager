package spring.Finance.manager.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.Finance.manager.Entity.Budget;
import spring.Finance.manager.Services.BudgetService;
import spring.Finance.manager.Services.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/fm")
public class BudgetController {
    @Autowired
    private BudgetService budgetService;

    @PostMapping("/api/budgets")
    public Budget addBudget(@RequestBody Budget budget){
        return budgetService.addBudget(budget);
    }

    @GetMapping("/api/getbudget")
    public List<Budget> getAllBudgets(){
        return budgetService.getAllBudgets();
    }

    @GetMapping("/api/budgets/{id}")
    public Budget getBudgetById(@PathVariable Integer id){
        return budgetService.getBudgetById(id);
    }

    @PutMapping("/api/updateBudget")
    public Budget updateBudget(@RequestBody Budget budget){
        return budgetService.updateBudget(budget);
    }
    @DeleteMapping("/api/deleteBudget")
    public void deleteBudget(@RequestBody Budget budget){

    }

}
