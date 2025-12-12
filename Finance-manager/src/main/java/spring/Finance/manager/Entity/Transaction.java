package spring.Finance.manager.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Here also the id is the primary key
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")  // Many transactions belong to one user
    private User user;

    @ManyToOne
    @JoinColumn(name="category_id")   // Many transactions belong to one category
    private Category category;

    @Column(nullable = false,precision = 14,scale = 2)
    private BigDecimal amount;

    @Column(nullable = false)
    private String type;

    @Column(columnDefinition = "TEXT")         // Here need not be a mandatory thing
    private String description;

    @Column(name = "txn_date", nullable = false)
    private LocalDateTime txnDate;


    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.txnDate == null) {
            this.txnDate = LocalDateTime.now();
        }
    }
}
