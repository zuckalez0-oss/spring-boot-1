package com.example.demo.proj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor; // Generate one constructor with all the fields
import lombok.Data; // For getters , setters , toString, equals, hashcode
import lombok.Getter;
import lombok.NoArgsConstructor; // Generate one constructor void
import lombok.Setter;

@Entity
// @Data // Perigoso utilizar em projetos grandes
// Utilizar o decorador @Getter e @Setter, pois se utilizar @Data, pode se gerar equals(), hashCode() e toString() <--- isso pode quebrar a aplicação ao longo prazo.
@Getter
@Setter
@NoArgsConstructor
// @AllArgsConstructor Para esse caso como o ID é gerado pela propria classe Task, não tem necessidade de gerar com o AllArgsConstructor.

public class Task {

    @Id // Marked the field "id" how a primary table key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configure the auto generation ID'S
    private Long id; // Task unique identification


    private String title; // Task title
    private String description; // Task description
    private boolean completed; // Task status (Finished or not)


    public Task(String title, String description,boolean completed){
    this.title=title;
    this.description=description;
    this.completed=completed;
}

}


