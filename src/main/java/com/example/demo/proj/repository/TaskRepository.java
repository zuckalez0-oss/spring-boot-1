package com.example.demo.proj.repository;
import com.example.demo.proj.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{
            // Nao precisa declarar nada, classe fica encarregada
            // Pelos metodos: save(), findById(), findAll(), delete()
        }



