package pl.ulatwdiete.diet.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.ulatwdiete.diet.database.entity.Food;
import pl.ulatwdiete.diet.database.FoodRepo;

@Service
public class FoodManager {

    private FoodRepo foodRepo;

    @Autowired
    public FoodManager(FoodRepo foodRepo) {
        this.foodRepo = foodRepo;
    }

    public Iterable<Food> findAll(){
        return foodRepo.findAll();
    }

    public Food save(Food food) {
        return foodRepo.save(food);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        foodRepo.save(new Food(1,"Banana", "Fruits", 56, 50, 5,1));
        foodRepo.save(new Food(2,"Apple", "Fruits", 106, 78, 3,3));
    }

    public void deleteById(Integer Id){
        foodRepo.deleteById(Id);
    }
}
