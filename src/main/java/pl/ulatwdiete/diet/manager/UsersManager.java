package pl.ulatwdiete.diet.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ulatwdiete.diet.database.UserRepo;
import pl.ulatwdiete.diet.database.entity.Users;

import java.util.List;
import java.util.Optional;

@Service
public class UsersManager {

    private UserRepo userRepo;

    @Autowired
    public UsersManager(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public List<Users> findAll() {
        return userRepo.findAll();
    }

    public Optional<Users> findOne(String user_id){
        return userRepo.findById(user_id);
    }

    public Users addOne(Users users){
        return userRepo.save(users);
    }

    public void deleteOne(Users users){
        userRepo.delete(users);
    }
}
