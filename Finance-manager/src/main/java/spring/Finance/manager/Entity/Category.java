package spring.Finance.manager.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Here id is a primary key
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;                  //INCOME (or) EXPENSES

    @ManyToOne                      // The below comment line explains why we used ManyToOne Annotation
    @JoinColumn(name = "user_id")  //Many objects of this entity are linked to one User (user_id is the foreign key)
    private User user;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;


    public int getId() {                 // These are the getters and setters for the above ones
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
