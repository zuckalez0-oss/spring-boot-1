package com.example.demo.proj.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor; // Generate one constructor with all the fields
import lombok.Data; // For getters , setters , toString, equals, hashcode
import lombok.NoArgsConstructor; // Generate one constructor void

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Task {

    @Id // Marked the field "id" how a primary table key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configure the auto generation ID'S
    private Long id; // Task unique identification


    private String title; // Task title
    private String description; // Task description
    private boolean completed; // Task status (Finished or not)

}
