package spring.Finance.manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.Finance.manager.Entity.User;
import spring.Finance.manager.Repos.UserRepository;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {       // It connects to the repo and stores the details entered by user
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {        // It brings all user details from the database by repository
        return userRepository.findAll();
    }

    public User getUserById(Integer userid) {
        return userRepository.findById(userid)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(Integer userid) {
        userRepository.deleteById(userid);
    }
}
