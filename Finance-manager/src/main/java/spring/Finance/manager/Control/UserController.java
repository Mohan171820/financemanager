package spring.Finance.manager.Control;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.Finance.manager.Entity.User;
import spring.Finance.manager.Services.UserService;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/fm")        // Common start of api endpoint
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/api/enterDetails")                      // It is to upload details
    public User enterDetails(@RequestBody User user) {
        return userService.createUser(user);
    };
    @GetMapping("/api/users")                          // It is to get details of the user
    public List<User> details() {
        return userService.getAllUsers();
    };

    @GetMapping("/api/{userid}")                       // It gives the user details by id
    public User getUser(@PathVariable Integer userid) {
        return userService.getUserById(userid);
};
    @DeleteMapping("/api/{userid}")
    public void deleteUser(@PathVariable Integer userid) {
        userService.deleteUser(userid);
    }
}
