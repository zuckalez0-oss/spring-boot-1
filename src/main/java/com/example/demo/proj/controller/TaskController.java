package com.example.demo.proj.controller;
import com.example.demo.proj.repository.TaskRepository;
import com.example.demo.proj.model.Task;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController // Indica que esta classe é um controlador REST. Retorna dados diretamente (JSON/XML).

@RequestMapping("/api/tasks")  // Define o caminho base para todos os endpoints neste controlador

public class TaskController {
    @Autowired  // Injeta automaticamente uma instância de TaskRepository (gerenciada pelo Spring)
    private TaskRepository taskRepository;

    @GetMapping   // Mapeia requisições HTTP GET para este método no caminho "/api/tasks"
    public List<Task>getAllTasks(){
        return taskRepository.findAll(); // Usa o repositório para buscar todas as tarefas


    }
}

