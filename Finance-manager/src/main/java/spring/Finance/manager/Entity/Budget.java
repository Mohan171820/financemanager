package spring.Finance.manager.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "budgets")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

                                                           // Many budgets belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

                                                           // Category can be null
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "amount_limit", nullable = false, precision = 14, scale = 2)
    private BigDecimal amountLimit;

    @Column(nullable = false)
    private int month;                                      // 1–12

    @Column(nullable = false)
    private int year;

    @Column(name = "used_amount", precision = 14, scale = 2)
    private BigDecimal usedAmount = BigDecimal.ZERO;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        if (this.usedAmount == null) {
            this.usedAmount = BigDecimal.ZERO;
        }
    }
    public int getId() {               // Getters & Setters
        return id; }

    public void setId(int id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getAmountLimit() {
        return amountLimit;
    }
    public void setAmountLimit(BigDecimal amountLimit) {
        this.amountLimit = amountLimit;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public BigDecimal getUsedAmount() {
        return usedAmount;
    }
    public void setUsedAmount(BigDecimal usedAmount) {
        this.usedAmount = usedAmount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
