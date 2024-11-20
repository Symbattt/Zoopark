package kz.iitu.zoopark.Model;

import javax.persistence.*;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String species;
    private String type; // Например, котенок, рыба и т.д.
    private double weight; // Вес в кг
    private double price; // Цена за вход

    // Конструкторы, геттеры и сеттеры

    public Animal() {
    }

    public Animal(String species, String type, double weight, double price) {
        this.species = species;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}