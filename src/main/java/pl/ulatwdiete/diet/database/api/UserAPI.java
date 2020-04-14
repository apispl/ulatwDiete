package pl.ulatwdiete.diet.database.api;

import org.springframework.web.bind.annotation.*;
import pl.ulatwdiete.diet.manager.UsersManager;

@RequestMapping("/api/users")
@RestController
public class UserAPI {

    private UsersManager usersManager;

    public UserAPI(UsersManager usersManager) {
        this.usersManager = usersManager;
    }
}
