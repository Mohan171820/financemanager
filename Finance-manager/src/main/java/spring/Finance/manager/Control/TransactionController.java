package spring.Finance.manager.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.Finance.manager.Entity.Transaction;
import spring.Finance.manager.Services.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/fm")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    // To Enter the Transaction details
    @PostMapping("/api/transactions")
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    };
    // To get the details of the entered transactions
    @GetMapping("/api/transactions")
    public List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    };

    // To get details of a particular transaction
    @GetMapping("/api/transactions/{id}")
    public Transaction getTransactionById(@PathVariable Integer id){
        return transactionService.getTransactionById(id);
    };

    // To update details in transactions
    @PutMapping("/api/transactions/{id}")
    public Transaction updateTransaction(
            @PathVariable Integer id,
            @RequestBody Transaction transaction) {

        return transactionService.updateTransaction(id, transaction);
    };

    // TO delete a particular transaction
    @DeleteMapping("/api/tarnsactions/{id}")
    public void deleteTransaction(@PathVariable Integer id){

    }

}

