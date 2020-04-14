package pl.ulatwdiete.diet.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.ulatwdiete.diet.database.entity.Food;

@Repository
public interface FoodRepo extends CrudRepository<Food, Integer> {
}
