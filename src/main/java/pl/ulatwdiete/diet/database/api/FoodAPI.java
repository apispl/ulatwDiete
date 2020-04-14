package pl.ulatwdiete.diet.database.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.ulatwdiete.diet.database.entity.Food;
import pl.ulatwdiete.diet.manager.FoodManager;

@RequestMapping(path = "/api/food")
@RestController
public class FoodAPI {

    private FoodManager foodManager;

    public FoodAPI(FoodManager foodManager) {
        this.foodManager = foodManager;
    }

    @GetMapping("/all")
    public Iterable<Food> getAll(){
        return foodManager.findAll();
    }

    @PutMapping()
    public Food update(@RequestBody Food food) {
        return foodManager.save(food);
    }

    @PostMapping()
    public @ResponseBody Food addFood(@RequestBody Food food){
        return foodManager.save(food);
    }
}
