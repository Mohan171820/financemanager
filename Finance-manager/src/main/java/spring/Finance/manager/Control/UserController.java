package spring.Finance.manager.Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.Finance.manager.Entity.User;
import spring.Finance.manager.Repos.UserRepository;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("api/users")        // Common start of api endpoint
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping                                          // It is to upload details
    public User enterDetails(@RequestBody User user) {
        return userRepository.save(user);
    };

    @GetMapping                                           // It is to get details of the user
    public List<User> details(@RequestBody User user) {
        return userRepository.findAll();
    };

    @GetMapping("/{userid}")                                // It gives the user details by id
    public User getUser(@PathVariable Integer userid) {
        return userRepository.findById(userid)
                .orElseThrow(() -> new RuntimeException("User not found"));
};
    @DeleteMapping("/{userid}")
    public void deleteUser(@PathVariable Integer userid) {
        userRepository.deleteById(userid);
    }
}
