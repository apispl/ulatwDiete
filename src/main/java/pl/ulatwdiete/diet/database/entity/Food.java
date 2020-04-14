package pl.ulatwdiete.diet.database.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;

    private String name;
    private String category;
    private double calories;
    private double carbochydrates;
    private double protein;
    private double fat;

    public Food() {
    }

    public Food(int id, String name, String category, double calories, double carbochydrates, double protein, double fat) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.calories = calories;
    this.carbochydrates = carbochydrates;
    this.protein = protein;
    this.fat = fat;
    }

    public int getId() {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCarbochydrates() {
        return carbochydrates;
    }

    public void setCarbochydrates(double carbochydrates) {
        this.carbochydrates = carbochydrates;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}
