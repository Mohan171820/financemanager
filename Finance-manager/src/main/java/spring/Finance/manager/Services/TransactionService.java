package spring.Finance.manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.Finance.manager.Entity.Transaction;
import spring.Finance.manager.Repos.TransactionRepository;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    // logic to save the transaction details in the database by repository
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
    // Logic to get details of all transactions from the database
    public List<Transaction> getAllTransactions(){
        return transactionRepository.findAll();
    }
    // logic to get details of a particular transaction using id
    public Transaction getTransactionById(int id){
        return transactionRepository.getById(id);
    }
    // logic to update the present transaction details
    public Transaction updateTransaction(Integer id, Transaction updatedTransaction) {

        Transaction existingTransaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));

        // Update only allowed fields
        existingTransaction.setAmount(updatedTransaction.getAmount());
        existingTransaction.setType(updatedTransaction.getType());
        existingTransaction.setDescription(updatedTransaction.getDescription());
        existingTransaction.setTxnDate(updatedTransaction.getTxnDate());
        existingTransaction.setCategory(updatedTransaction.getCategory());

        return transactionRepository.save(existingTransaction);
    }
    public void deleteTransaction(Integer id) {
        transactionRepository.deleteById(id);
    }
}
