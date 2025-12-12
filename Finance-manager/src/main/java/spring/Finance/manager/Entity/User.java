package spring.Finance.manager.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")  // Specifically mentioned so that it will not cause any problem with database
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // As we used primary key in database
    private int id;

    @Column(nullable = false, unique = true, length = 150)   // As these are the main important things mentioned nullable
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "full_name", length = 50)
    private String fullName;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {                   // Automatically set creation timestamp right before the entity is saved to the database
        this.createdAt = LocalDateTime.now();
    }

    // Getters & setters...

    public int getId() {
        return id; }

    public void setId(int id) {
        this.id = id; }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
    this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName; }

    public void setFullName(String fullName) {
   this.fullName = fullName;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt; }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
