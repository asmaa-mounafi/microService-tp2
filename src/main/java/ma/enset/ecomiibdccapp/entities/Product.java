package ma.enset.ecomiibdccapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Product {
    @Id
    private String id;
    private String name;
    private double price;
    private int quantity;

}
