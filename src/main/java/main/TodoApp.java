package main;

import controller.TaskController;
import java.util.Date;
import java.util.List;
import model.Task;

public class TodoApp {

    public static void main(String[] args) {
        TaskController taskController = new TaskController();
        
        Task task = new Task();
        task.setName("Projeto Teste");
        task.setIdProject(7);
        task.setDescription("descrição");
        task.setDeadline(new Date());
        task.setNotes("Notes teste");
        
        taskController.save(task);
        
        task.setName("Novo Nome do Projeto Teste");
        taskController.update(task);
        
        List<Task> tasks = taskController.getAll(task.getIdProject());
        System.out.print("Total de tarefas: " + tasks.size());
        
    }
}
