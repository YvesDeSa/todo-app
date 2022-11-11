package main;

import controller.ProjectController;
import java.util.List;
import model.Project;

public class TodoApp {

    public static void main(String[] args) {
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        project.setName("Projeto Teste");
        project.setDescription("descrição");
        
        projectController.save(project);
        
        project.setName("Novo Nome do Projeto Teste");
        projectController.update(project);
        
        List<Project> projects = projectController.getAll();
        System.out.print("Total de projetos: " + projects.size());
        
    }
}
